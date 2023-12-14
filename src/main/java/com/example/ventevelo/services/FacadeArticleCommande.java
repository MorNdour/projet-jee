package com.example.ventevelo.services;

import com.example.ventevelo.entities.ArticleCommande;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class FacadeArticleCommande extends AbstractFacade<ArticleCommande>{
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;
    public FacadeArticleCommande() {
        super(ArticleCommande.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
