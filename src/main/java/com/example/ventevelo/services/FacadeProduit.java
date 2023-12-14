package com.example.ventevelo.services;

import com.example.ventevelo.entities.Produit;
import jakarta.ejb.Stateless;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class FacadeProduit extends AbstractFacade<Produit> {
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;
    public FacadeProduit() {
        super(Produit.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
