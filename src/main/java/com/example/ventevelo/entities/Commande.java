package com.example.ventevelo.entities;

import jakarta.persistence.*;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "commande")
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numero;
    private int statut;
    private Date date_commande;
    private Date date_livraison_voulue;
    private Date date_livraison;
    @ManyToOne
    private Employe employe;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Magasin magasin;
    @OneToMany(mappedBy = "commande")
    private Collection<ArticleCommande> articleCommandes;
    public Commande() {
    }

    public Commande(int statut, Date date_commande, Date date_livraison_voulue, Date date_livraison) {
        this.statut = statut;
        this.date_commande = date_commande;
        this.date_livraison_voulue = date_livraison_voulue;
        this.date_livraison = date_livraison;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public Date getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(Date date_commande) {
        this.date_commande = date_commande;
    }

    public Date getDate_livraison_voulue() {
        return date_livraison_voulue;
    }

    public void setDate_livraison_voulue(Date date_livraison_voulue) {
        this.date_livraison_voulue = date_livraison_voulue;
    }

    public Date getDate_livraison() {
        return date_livraison;
    }

    public void setDate_livraison(Date date_livraison) {
        this.date_livraison = date_livraison;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Collection<ArticleCommande> getArticleCommandes() {
        return articleCommandes;
    }

    public void setArticleCommandes(Collection<ArticleCommande> articleCommandes) {
        this.articleCommandes = articleCommandes;
    }
}
