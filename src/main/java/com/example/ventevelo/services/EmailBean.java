package com.example.ventevelo.services;

import jakarta.ejb.Stateless;
import jakarta.mail.*;

import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

@Stateless
public class EmailBean {
    private static final String SMTP_HOST = "mail.galgit.com";
    private static final int SMTP_PORT = 587;
    private static final String SMTP_USERNAME = "dic2-2023@galgit.com";
    private static final String SMTP_PASSWORD = "sn-ept@GIT2024";
    private static final String EMAIL_FROM = "dic2-2023@galgit.com";

    public void sendEmail(String recipient, String subject, String messageContent) throws MessagingException {
        //Etape1: Creation d'une session
        Properties properties = new Properties();
        properties.put("mail.smtp.host", SMTP_HOST);
        properties.put("mail.smtp.port", SMTP_PORT);
        properties.put("mail.smtp.auth", "true");
       // properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication(SMTP_USERNAME,SMTP_PASSWORD);
                    }
                }
        );
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(EMAIL_FROM));
        message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(recipient));
        message.setSubject(subject);
        message.setText(messageContent);
        Transport.send(message);

    }
}
