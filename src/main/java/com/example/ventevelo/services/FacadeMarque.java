package com.example.ventevelo.services;

import com.example.ventevelo.entities.Marque;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class FacadeMarque extends AbstractFacade<Marque> {
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;
    public FacadeMarque() {
        super(Marque.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
