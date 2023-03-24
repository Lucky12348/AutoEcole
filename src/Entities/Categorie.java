/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Lucky1234
 */
public class Categorie {
    private int codeCategorie;
    private String libelle;
    private double prix;
    
    public Categorie (int uncodeCategorie,String unlibelle,double unprix)
    {
        codeCategorie = uncodeCategorie;
        libelle = unlibelle;
        prix = unprix;
    }

    /**
     * @return the codeCategorie
     */
    public int getCodeCategorie() {
        return codeCategorie;
    }

    /**
     * @param codeCategorie the codeCategorie to set
     */
    public void setCodeCategorie(int codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }
}
