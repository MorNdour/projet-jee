package com.example.ventevelo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "marque")
public class Marque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Nom;
    @OneToMany(mappedBy = "marque")
    private Collection<Produit> produits;

    public Marque() {
    }

    public Marque( String nom_marque ){
        this.Nom = nom_marque;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id_marque) {
        this.id = id_marque;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom_marque) {
        this.Nom = nom_marque;
    }

    @Override
    public String toString() {
        return "Marque{" +
                "id_marque=" + id +
                ", nom_marque='" + Nom + '\'' +
                '}';
    }
}
