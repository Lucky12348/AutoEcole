/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author Lucky1234
 */
public class Moniteur {
    private int codeMoniteur;
    private String nom;
    private String prenom;
    private String sexe;
    private Date date;
    private String adresse1;
    private String codePostal;
    private String ville;
    private String telephone;
    
    public Moniteur(int uncodeMoniteur,String unnom,String unprenom,String unsexe,Date unedate,String uneadresse1,String uncodePostal,String uneville,String untelephone)
    {
        codeMoniteur = uncodeMoniteur;
        nom = unnom;
        prenom = unprenom;
        sexe = unsexe;
        date = unedate;
        adresse1 = uneadresse1;
        codePostal = uncodePostal;
        ville = uneville;
        telephone = untelephone;
    }

    /**
     * @return the codeMoniteur
     */
    public int getCodeMoniteur() {
        return codeMoniteur;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the adresse1
     */
    public String getAdresse1() {
        return adresse1;
    }

    /**
     * @return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }
}
