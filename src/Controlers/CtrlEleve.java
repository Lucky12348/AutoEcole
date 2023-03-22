/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import Entities.Eleve;
import Entities.User;
import com.mysql.jdbc.Statement;
import java.awt.List;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import org.jfree.data.time.Hour;
import Entities.Eleve;
/**
 *
 * @author Lucky1234
 */
public class CtrlEleve {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlEleve() {
        cnx = ConnexionBDD.getCnx();
    }
    public void ModifInformationEleve(String nom, String prenom, String sexe, String adresse, int codePostal, String ville, int tel, String mail, String mdp, int codeEleve, String naissance)
    {
        try {
            ps = cnx.prepareStatement("UPDATE eleve, identifiant\n" +
                "set Nom = ?, Prenom = ?, Sexe =?, Adresse1= ?,\n" +
                "CodePostal = ?, ville = ?, Telephone = ?, mail = ?,\n" +
                "mdp = ? , DateDeNaissance = ? where eleve.codeEleve = ? and identifiant.codeEleve = ?");
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
    
    public Eleve getInfoEleve(int idEleve)
    {
        Eleve unEleve = null;
        try {
            ps = cnx.prepareStatement("SELECT eleve.CodeEleve,eleve.Nom,eleve.Prenom,eleve.Sexe,eleve.DateDeNaissance,eleve.Adresse1,eleve.CodePostal,eleve.Ville,eleve.Telephone From eleve where eleve.CodeEleve=?;");
            ps.setInt(1, idEleve);
            rs = ps.executeQuery();
            if(rs.next())
            {
                unEleve = new Eleve(idEleve,rs.getString("Nom"),rs.getString("Prenom"),rs.getString("Sexe"),rs.getDate("DateDeNaissance"),rs.getString("Adresse1"),rs.getString("CodePostal"),rs.getString("Ville"),rs.getString("Telephone"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unEleve;
    }
   
    public DefaultListModel GetRDV(int idEleve,String laDate) throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("SELECT lecon.Date,lecon.Heure,moniteur.Nom,categorie.Libelle from lecon "
                                    + "JOIN eleve on lecon.CodeEleve = eleve.CodeEleve "
                                    + "JOIN moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur "
                                    + "JOIN vehicule on lecon.Immatriculation = vehicule.Immatriculation "
                                    + "JOIN categorie on vehicule.CodeCategorie = categorie.CodeCategorie "
                                    + "where  eleve.CodeEleve = ? and lecon.Date = ?;");
            ps.setInt(1, idEleve);
            ps.setString(2, laDate);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            String[] items = {"Date : "+rs.getDate("Date").toString(),"Heure : "+rs.getTime("Heure").toString(),"Moniteur : "+rs.getString("Nom"),"Licence : "+rs.getString("Libelle")};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }else {
            String[] items = {"Date : ","Heure : ","Moniteur : ","Licence : "};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        ps.close();
        
        return model;
    }
    
    public DefaultListModel getLicence() throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("SELECT categorie.Libelle "
                                    + "from categorie");
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
    public DefaultListModel getMoniteur() throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("SELECT moniteur.Nom "
                                    + "from moniteur");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            ArrayList<String> ar = new ArrayList<String>();
            for (int i = 0; i < rs.getRow(); i++) {
                String s1 =rs.getString("Nom");
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
     public DefaultListModel getMontantPermis(int idEleve, String laLicence) throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("SELECT lecon.Date,categorie.Prix\n" +
"					FROM lecon\n" +
"					JOIN vehicule on lecon.Immatriculation = vehicule.Immatriculation\n" +
"					JOIN categorie on vehicule.CodeCategorie = categorie.CodeCategorie\n" +
"					where lecon.CodeEleve = ? and lecon.Reglee=1 and categorie.Libelle = ?;");
        ps.setInt(1, idEleve);    
        ps.setString(2, laLicence);    
	rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            ArrayList<String> ar = new ArrayList<String>();
            for (int i = 0; i < rs.getRow(); i++) {
                String s1 =rs.getString("Date");
            rs.next();
            ar.add(s1);
            }
            for (int i = 0; i < ar.size(); i++) {
                model.add(i, ar.get(i));
            }
        }else {
            String[] items = {"Aucune"};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        ps.close();
        return model;
    }
     
public DefaultListModel getLecon(int idEleve, String laLicence) throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("SELECT lecon.Date,categorie.Prix\n" +
"					FROM lecon\n" +
"					JOIN vehicule on lecon.Immatriculation = vehicule.Immatriculation\n" +
"					JOIN categorie on vehicule.CodeCategorie = categorie.CodeCategorie\n" +
"					where lecon.CodeEleve = ? and lecon.Reglee=0 and categorie.Libelle = ?;");
        ps.setInt(1, idEleve);    
        ps.setString(2, laLicence);    
	rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            ArrayList<String> ar = new ArrayList<String>();
            for (int i = 0; i < rs.getRow(); i++) {
                String s1 =rs.getString("Date");
            rs.next();
            ar.add(s1);
            }
            for (int i = 0; i < ar.size(); i++) {
                model.add(i, ar.get(i));
            }
        }else {
            String[] items = {"Aucune"};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        ps.close();
        return model;
    }

    public String getPrixLecon(int idEleve, String laLicence) throws SQLException
    {
        String resultat = "0";
        try {
            ps = cnx.prepareStatement("SELECT categorie.Prix\n" +
"					FROM lecon\n" +
"					JOIN vehicule on lecon.Immatriculation = vehicule.Immatriculation\n" +
"					JOIN categorie on vehicule.CodeCategorie = categorie.CodeCategorie\n" +
"					where lecon.CodeEleve = ? and lecon.Reglee=0 and categorie.Libelle = ?;");
        ps.setInt(1, idEleve);    
        ps.setString(2, laLicence);    
	rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            resultat = rs.getString("Prix");
        }
        ps.close();
        return resultat;
    }
    
    public String getPrixPermis(int idEleve, String laLicence) throws SQLException
    {
        String resultat = "0";
        try {
            ps = cnx.prepareStatement("SELECT categorie.Prix\n" +
"					FROM lecon\n" +
"					JOIN vehicule on lecon.Immatriculation = vehicule.Immatriculation\n" +
"					JOIN categorie on vehicule.CodeCategorie = categorie.CodeCategorie\n" +
"					where lecon.CodeEleve = ? and lecon.Reglee=1 and categorie.Libelle = ?;");
        ps.setInt(1, idEleve);    
        ps.setString(2, laLicence);    
	rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            resultat = rs.getString("Prix");
        }
        ps.close();
        return resultat;
    }
    
    public DefaultListModel getVoiture(String laCateg) throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("select DISTINCT marque\n" +
                                      "from vehicule\n" +
                                      "JOIN categorie on vehicule.CodeCategorie = categorie.CodeCategorie\n" +
                                      "WHERE categorie.Libelle = ?;");
            ps.setString(1, laCateg);   
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            ArrayList<String> ar = new ArrayList<String>();
            for (int i = 0; i < rs.getRow(); i++) {
                String s1 =rs.getString("marque");
            rs.next();
            ar.add(s1);
            }
            for (int i = 0; i < ar.size(); i++) {
                model.add(i, ar.get(i));
            }
        }else {
            String[] items = {"Aucune Voiture"};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        ps.close();
        
        return model;
    }
    
    public DefaultListModel getLicenceMoniteur(String leNom) throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("select categorie.Libelle\n" +
                                      "from moniteur\n" +
                                      "JOIN licence on moniteur.CodeMoniteur = licence.CodeMoniteur\n" +
                                      "join categorie on licence.CodeCategorie = categorie.CodeCategorie\n" +
                                      "where moniteur.Nom =?;");
            ps.setString(1, leNom);   
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
    public int InscriptionLecon(String laDate,int leNomMoniteur,int leCodeEleve,String laVoiture) throws SQLException
    {
        int resultat = 0;
        try {
            ps = cnx.prepareStatement("INSERT INTO lecon (date,CodeMoniteur,CodeEleve,Immatriculation)\n" +
                                      " VALUES (?,?,?,?);");
            ps.setString(1, laDate);
            ps.setInt(2, leNomMoniteur);
            ps.setInt(3, leCodeEleve);
            ps.setString(4, laVoiture);
            ps.executeUpdate();
            String query = "select date,CodeMoniteur,CodeEleve,Immatriculation from lecon";
            ResultSet rs = ps.executeQuery(query);
            if (rs.next()) {
            resultat = 1;
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultat;
    }
    
    public ArrayList getMoniteurVoitureId(String leNomMoniteur,String laVoiture) throws SQLException
    {
        ArrayList list = new ArrayList();
        int resultat1;
        String resultat2;
        try {
            ps = cnx.prepareStatement("SELECT DISTINCT moniteur.CodeMoniteur,vehicule.Immatriculation\n" +
                                        "FROM moniteur\n" +
                                        "JOIN lecon on  moniteur.CodeMoniteur = lecon.CodeMoniteur\n" +
                                        "JOIN vehicule on lecon.Immatriculation = vehicule.Immatriculation\n" +
                                        "WHERE moniteur.Nom = ? and vehicule.Marque = ?;");
            ps.setString(1, leNomMoniteur);
            ps.setString(2, laVoiture);
            rs = ps.executeQuery();
            /*
            ps.setString(1, laDate);
            ps.setInt(2, rs.getInt("CodeMoniteur"));
            ps.setInt(3, leCodeEleve);
            ps.setString(4, rs.getString("Immatriculation"));
            */
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            resultat1 = rs.getInt("CodeMoniteur");
            resultat2 = rs.getString("Immatriculation");
            list.add(resultat1);
            list.add(resultat2);
        }else {
            resultat1 = 0; 
            resultat2= "erreur";
        }
        ps.close();
        return list;
    }

}
