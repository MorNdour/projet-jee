package com.example.ventevelo.entities;

import jakarta.persistence.*;
import org.hibernate.type.descriptor.jdbc.DecimalJdbcType;

@Entity
@Table(name = "articlecommande")
public class ArticleCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ligne;
    private int quantite;
    private int prix_depart;
    private int remise;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Commande commande;

    public ArticleCommande() {
    }

    public ArticleCommande(int quantite, int prix_depart, int remise) {
        this.quantite = quantite;
        this.prix_depart = prix_depart;
        this.remise = remise;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getPrix_depart() {
        return prix_depart;
    }

    public void setPrix_depart(int prix_depart) {
        this.prix_depart = prix_depart;
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
