package com.example.ventevelo.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Collection;

@Table(name = "produit")
@XmlRootElement
@Entity
public class Produit implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private int annee_model;
    private int prix_depart;
    @OneToMany(mappedBy = "produit")
    private Collection<Stock> stocks;
    @ManyToOne
    private Marque marque;
    @ManyToOne
    private Categorie categorie;

    public Produit() {
    }

    public Produit(String nom, int annee_model, int prix_depart) {
        this.nom = nom;
        this.annee_model = annee_model;
        this.prix_depart = prix_depart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnnee_model() {
        return annee_model;
    }

    public void setAnnee_model(int annee_model) {
        this.annee_model = annee_model;
    }

    public int getPrix_depart() {
        return prix_depart;
    }

    public void setPrix_depart(int prix_depart) {
        this.prix_depart = prix_depart;
    }


    public Collection<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(Collection<Stock> stocks) {
        this.stocks = stocks;
    }

    public Categorie getCategory() {
        return categorie;
    }

    public void setCategory(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", annee_model=" + annee_model +
                ", prix_depart=" + prix_depart +
                ", marque=" + marque +
                ", categorie=" + categorie +
                '}';
    }
}
