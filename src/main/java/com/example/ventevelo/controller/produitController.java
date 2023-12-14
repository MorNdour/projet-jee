package com.example.ventevelo.controller;

import com.example.ventevelo.entities.Produit;
import com.example.ventevelo.services.FacadeProduit;
import jakarta.ejb.EJB;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.primefaces.PrimeFaces;

import java.io.Serializable;
import java.util.List;
@Named("produitList")
@ViewScoped
public class produitController implements Serializable {
    @EJB
    private FacadeProduit facadeProduit;
    private Produit selectedProduit ;
    private List<Produit> produits;
    private List<Produit> selectedProducts;

    public List<Produit> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<Produit> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public Produit getSelectedProduit() {
        return selectedProduit;
    }

    public void setSelectedProduit(Produit selectedProduit) {
        this.selectedProduit = selectedProduit;
    }

    public List<Produit> getProduits() {
        if (produits == null){
            produits = facadeProduit.findAll();
        }
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public void newProduct() {
        this.selectedProduit = new Produit("test",2023,2000);
    }

    public void saveProduct() {
        facadeProduit.edit(this.selectedProduit);
        System.out.println(this.selectedProduit);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Product Updated"));
        PrimeFaces.current().executeScript("PF('manageProductDialog').hide()");
        PrimeFaces.current().ajax().update("form:messages", "form:dt-products");
    }

    public void deleteProduct() {
        facadeProduit.remove(this.selectedProduit);
        this.selectedProduit = null;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Product Removed"));
        PrimeFaces.current().ajax().update("form:messages", "form:dt-products");
    }

    public String getDeleteButtonMessage() {
        if (hasSelectedProducts()) {
            int size = this.selectedProducts.size();
            return size > 1 ? size + " products selected" : "1 product selected";
        }

        return "Delete";
    }

    public boolean hasSelectedProducts() {
        return this.selectedProducts != null && !this.selectedProducts.isEmpty();
    }
}
