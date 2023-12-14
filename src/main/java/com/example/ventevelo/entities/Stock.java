package com.example.ventevelo.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "stock")
public class Stock implements Serializable {
    private int quantite;
    @ManyToOne
    private Magasin magasin;
    @ManyToOne
    @Id
    private Produit produit;

    public Stock() {
    }

    public Stock(int quantite, Magasin magasin, Produit produit) {
        this.quantite = quantite;
        this.magasin = magasin;
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "quantite=" + quantite +
                ", magasin=" + magasin +
                ", produit=" + produit +
                '}';
    }
}
