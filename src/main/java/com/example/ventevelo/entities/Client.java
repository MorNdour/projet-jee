package com.example.ventevelo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Table(name = "client")
@Entity
public  class Client extends Personne implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String adresse;
    private  String ville;
    private String etat;
    private String code_zip;
    @OneToMany(mappedBy = "client")
    private Collection<Commande> commandes;
    public Client() {
    }

    public Client(String prenom, String nom, String telephone, String email, String adresse, String ville, String etat, String code_zip) {
        super(prenom, nom, telephone, email);
        this.adresse = adresse;
        this.ville = ville;
        this.etat = etat;
        this.code_zip = code_zip;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getCode_zip() {
        return code_zip;
    }

    public void setCode_zip(String code_zip) {
        this.code_zip = code_zip;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }
}
