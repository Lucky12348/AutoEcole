/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Lucky1234
 */
public class Lecon {
    private String Date;
    private String Heure;
    private String nomMoniteur;
       private String nomEleve;
    private String libelle;
    private String reglee;

    public Lecon( String Date, String Heure, String nomMoniteur, String libelle, String reglee) {
        this.Heure = Heure;
        this.Date = Date;
        this.nomMoniteur = nomMoniteur;
        this.libelle = libelle;
        this.reglee = reglee;
    }
    public Lecon( String Date, String Heure, String nomEleve, String libelle) {
        this.Heure = Heure;
        this.Date = Date;
        this.nomEleve = nomEleve;
        this.libelle = libelle;
        
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the Heure
     */
    public String getHeure() {
        return Heure;
    }

    /**
     * @param Heure the Heure to set
     */
    public void setHeure(String Heure) {
        this.Heure = Heure;
    }

    /**
     * @return the nomMoniteur
     */
    public String getNomMoniteur() {
        return nomMoniteur;
    }

    /**
     * @param nomMoniteur the nomMoniteur to set
     */
    public void setNomMoniteur(String nomMoniteur) {
        this.nomMoniteur = nomMoniteur;
    }

    /**
     * @return the nomEleve
     */
    public String getNomEleve() {
        return nomEleve;
    }

    /**
     * @param nomEleve the nomEleve to set
     */
    public void setNomEleve(String nomEleve) {
        this.nomEleve = nomEleve;
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
     * @return the reglee
     */
    public String getReglee() {
        return reglee;
    }

    /**
     * @param reglee the reglee to set
     */
    public void setReglee(String reglee) {
        this.reglee = reglee;
    }
}
