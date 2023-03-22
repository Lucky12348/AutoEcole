/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author louis
 */
public class Eleve {
    private int idEleve;
    private String nom;
    private String prenom;
    private String sexe;
    private Date naissance;
    private String adresse1;
    private String postale;
    private String ville;
    private String tel;
    
    public Eleve(int unIdEleve,String unNom, String unPrenom, String unSexe, Date uneNaissance, String uneAdresse, String unPostale, String uneVille, String unTel)
    {
        idEleve = unIdEleve;
        nom = unNom;
        prenom = unPrenom;
        sexe = unSexe;
        naissance = uneNaissance;
        adresse1 = uneAdresse;
        postale = unPostale;
        ville = uneVille;
        tel = unTel;
    }

    /**
     * @return the idEleve
     */
    public int getIdEleve() {
        return idEleve;
    }

    /**
     * @param idEleve the idEleve to set
     */
    public void setIdEleve(int idEleve) {
        this.idEleve = idEleve;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the naissance
     */
    public Date getNaissance() {
        return naissance;
    }

    /**
     * @param naissance the naissance to set
     */
    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    /**
     * @return the adresse1
     */
    public String getAdresse1() {
        return adresse1;
    }

    /**
     * @param adresse1 the adresse1 to set
     */
    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

  

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the postale
     */
    public String getPostale() {
        return postale;
    }

    /**
     * @param postale the postale to set
     */
    public void setPostale(String postale) {
        this.postale = postale;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }



}
