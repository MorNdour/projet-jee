package com.example.ventevelo.services;

import com.example.ventevelo.entities.Magasin;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class FacadeMagasin extends AbstractFacade<Magasin> {
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;
    public FacadeMagasin() {
        super(Magasin.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
