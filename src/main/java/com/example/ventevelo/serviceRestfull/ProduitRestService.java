package com.example.ventevelo.serviceRestfull;

import com.example.ventevelo.entities.Produit;
import com.example.ventevelo.services.AbstractFacade;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import javax.swing.text.html.parser.Parser;
import java.awt.*;

@Stateless
@Path("/produit")
public class ProduitRestService extends AbstractFacade<Produit> {
    @PersistenceContext(name = "myPersistenceUnit")
    private  EntityManager entityManager;
    public ProduitRestService() {
        super(Produit.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    @Path("/produits/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_ATOM_XML})
    public Produit find(@PathParam(value = "id")int id){
        return super.find(id);
    }

    @Path("/test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test(){
        return "Bonjour";
    }
}
