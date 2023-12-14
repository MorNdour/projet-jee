package com.example.ventevelo.services;

import jakarta.ejb.EJB;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

import jakarta.mail.MessagingException;

@Singleton
@Startup
public class EmailNotificationBean {
    private static final String EMAIL_TO = "";
    @EJB
    private EmailBean emailBean;
    @PostConstruct
    public void sendStartupNotification() {
        try {
            emailBean.sendEmail(EMAIL_TO,"Application started", "Application has been started.");
        } catch (MessagingException e) {
            // Handle exception
        }
    }
    @PreDestroy
    public void sendShutdownNotification() {
        try {
            emailBean.sendEmail(EMAIL_TO,"Application shutdown", "Application is shutting down.");
        } catch (MessagingException e) {
            // Handle exception
        }
    }
}
