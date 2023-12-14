package com.example.ventevelo.services;

import com.example.ventevelo.entities.Categorie;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class FacadeCategorie extends AbstractFacade<Categorie>{
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;

    public FacadeCategorie() {
        super(Categorie.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
