package com.example.ventevelo.services;

import com.example.ventevelo.entities.Client;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class FacadeClient extends AbstractFacade<Client> {
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;
    public FacadeClient() {
        super(Client.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
