package com.example.ventevelo.services;

import com.example.ventevelo.entities.Employe;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class FacadeEmploye extends AbstractFacade<Employe> {
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;
    public FacadeEmploye() {
        super(Employe.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
