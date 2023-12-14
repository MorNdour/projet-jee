package com.example.ventevelo.entities;

import jakarta.persistence.*;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "employe")
public class Employe extends Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Float actif;
    private int manager_id;
    @ManyToOne
    private  Magasin magasin;

    public Employe() {
    }

    public Employe(String prenom, String nom, String telephone, String email, Float actif, int manager_id, Magasin magasin) {
        super(prenom, nom, telephone, email);
        this.actif = actif;
        this.manager_id = manager_id;
        this.magasin = magasin;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Float getActif() {
        return actif;
    }

    public void setActif(Float actif) {
        this.actif = actif;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }
}
