package com.example.ventevelo.services;

import com.example.ventevelo.entities.Stock;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class FacadeStock extends AbstractFacade<Stock> {
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;
    public FacadeStock() {
        super(Stock.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
