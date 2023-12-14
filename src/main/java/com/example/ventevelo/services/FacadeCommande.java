package com.example.ventevelo.services;

import com.example.ventevelo.entities.Commande;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class FacadeCommande extends AbstractFacade<Commande> {
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;
    public FacadeCommande() {
        super(Commande.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
