/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author louis
 */
public class Vehicule {
    private String immatriculation;
    private String marque;
    private String modele;
    private int annee;
    private int codeCategorie;

    public Vehicule(String unImmatriculation, String uneMarque, String unModele, int uneAnnee, int unCodeCategorie){
        immatriculation = unImmatriculation;
        marque = uneMarque;
        modele = unModele;
        annee = uneAnnee;
        codeCategorie = unCodeCategorie;
    }

    /**
     * @return the immatriculation
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * @param immatriculation the immatriculation to set
     */
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * @return the modele
     */
    public String getModele() {
        return modele;
    }

    /**
     * @param modele the modele to set
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
        this.annee = annee;
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
}
