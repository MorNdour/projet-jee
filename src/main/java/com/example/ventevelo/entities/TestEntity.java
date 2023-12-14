package com.example.ventevelo.entities;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestEntity {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
    }
}
