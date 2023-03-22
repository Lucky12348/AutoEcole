/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Moniteur;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Lucky1234
 */
public class CtrlMoniteur {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlMoniteur() {
        cnx = ConnexionBDD.getCnx();
    }
    
    public void ModifInformationMoniteur(String nom, String prenom, String sexe, String adresse, int codePostal, String ville, int tel, String mail, String mdp, int codeEleve, String naissance)
    {
        try {
            ps = cnx.prepareStatement("UPDATE moniteur, identifiant\n" +
                "set Nom = ?, Prenom = ?, Sexe =?, Adresse1= ?,\n" +
                "CodePostal = ?, ville = ?, Telephone = ?, mail = ?,\n" +
                "mdp = ? , DateDeNaissance = ? where moniteur.codeMoniteur = ? and identifiant.codeMoniteur = ?");
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, sexe);
            ps.setString(4, adresse);
            ps.setInt(5, codePostal);
            ps.setString(6, ville);
            ps.setInt(7, tel);
            ps.setString(8, mail);
            ps.setString(9, mdp);
            ps.setString(10, naissance);
            ps.setInt(11, codeEleve);
            ps.setInt(12, codeEleve);
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Moniteur getInfoMoniteur(int idMoniteur)
    {
        Moniteur unMoniteur = null;
        try {
            ps = cnx.prepareStatement("SELECT moniteur.CodeMoniteur,moniteur.Nom,moniteur.Prenom,moniteur.Sexe,moniteur.DateDeNaissance,moniteur.Adresse1,moniteur.CodePostal,moniteur.Ville,moniteur.Telephone FROM moniteur where moniteur.CodeMoniteur = ?;");
            ps.setInt(1, idMoniteur);
            rs = ps.executeQuery();
            if(rs.next())
            {
                unMoniteur = new Moniteur(idMoniteur,rs.getString("Nom"),rs.getString("Prenom"),rs.getString("Sexe"),rs.getDate("DateDeNaissance"),rs.getString("Adresse1"),rs.getString("CodePostal"),rs.getString("Ville"),rs.getString("Telephone"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unMoniteur;
    }
    
    public DefaultListModel GetRDV(int idMoniteur,String laDate) throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("SELECT lecon.Date,lecon.Heure,eleve.Nom,categorie.Libelle from lecon "
                                    + "JOIN eleve on lecon.CodeEleve = eleve.CodeEleve "
                                    + "JOIN moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur "
                                    + "JOIN vehicule on lecon.Immatriculation = vehicule.Immatriculation "
                                    + "JOIN categorie on vehicule.CodeCategorie = categorie.CodeCategorie "
                                    + "where  moniteur.CodeMoniteur = ? and lecon.Date = ?;");
            ps.setInt(1, idMoniteur);
            ps.setString(2, laDate);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            String[] items = {"Date : "+rs.getDate("Date").toString(),"Heure : "+rs.getTime("Heure").toString(),"Eleve : "+rs.getString("Nom"),"Licence : "+rs.getString("Libelle")};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }else {
            String[] items = {"Date : ","Heure : ","Eleve : ","Licence : "};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        ps.close();
        
        return model;
    }
    public DefaultListModel getLicenceMoniteur(int idMoniteur) throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("SELECT categorie.Libelle "
                                    + "from moniteur "
                                    + "JOIN licence on moniteur.CodeMoniteur = licence.CodeMoniteur "
                                    + "join categorie on licence.CodeCategorie = categorie.CodeCategorie "
                                    + "WHERE moniteur.CodeMoniteur=?;");
            ps.setInt(1, idMoniteur);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            ArrayList<String> ar = new ArrayList<String>();
            for (int i = 0; i < rs.getRow(); i++) {
                String s1 =rs.getString("Libelle");
            rs.next();
            ar.add(s1);
            }
            for (int i = 0; i < ar.size(); i++) {
                model.add(i, ar.get(i));
            }
        }else {
            String[] items = {"Aucune Licence"};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        ps.close();
        
        return model;
    }
}

