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
import Entities.Vehicule;
/**
 *
 * @author louis
 */
public class CtrlAdmin {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlAdmin() {
     cnx = ConnexionBDD.getCnx();
}
        public void AjoutVehicule(String immatriculation, String marque, String modele, int annee, int codeCategorie)
    {
        try {
            ps = cnx.prepareStatement("INSERT INTO `vehicule` (`Immatriculation`, `Marque`, `Modele`, `Annee`, `CodeCategorie`) VALUES (?, ?, ?, ?, ?);");
            ps.setString(1, immatriculation);
            ps.setString(2, marque);
            ps.setString(3, modele);
            ps.setInt(4, annee);
            ps.setInt(5, codeCategorie);            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
         public void ModifVehicule(String immatriculation, String marque, String modele, int annee, int codeCategorie, String ancienImma)
    {
        try {
            ps = cnx.prepareStatement("UPDATE `vehicule` SET Immatriculation = ?, Marque = ?, `Modele` = ?, `Annee` = ?, `CodeCategorie` = ? WHERE vehicule.Immatriculation = ?;");
            ps.setString(1, immatriculation);
            ps.setString(2, marque);
            ps.setString(3, modele);
            ps.setInt(4, annee);
            ps.setInt(5, codeCategorie); 
            ps.setString(6, ancienImma);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public DefaultListModel getCategorie() throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("SELECT categorie.libelle "
                                    + "from categorie");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            ArrayList<String> ar = new ArrayList<String>();
            for (int i = 0; i < rs.getRow(); i++) {
                String s1 =rs.getString("libelle");
            rs.next();
            ar.add(s1);
            }
            for (int i = 0; i < ar.size(); i++) {
                model.add(i, ar.get(i));
            }
        }else {
            String[] items = {"Aucune Categorie"};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        ps.close();
        
        return model;
    }
    public String getCategorieId(String categorie) throws SQLException
    {
        String resultat = "0";
        try {
            ps = cnx.prepareStatement("SELECT categorie.codeCategorie \n" +
"					from categorie where categorie.libelle = ?");
        ps.setString(1, categorie);     
	rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            resultat = rs.getString("codeCategorie");
        }
        ps.close();
        return resultat;
    }
    public DefaultListModel getImma() throws SQLException
    {
        // Initialise le tableau
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        try {
            ps = cnx.prepareStatement("SELECT vehicule.immatriculation "
                                    + "from vehicule");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()) {
            ArrayList<String> ar = new ArrayList<String>();
            for (int i = 0; i < rs.getRow(); i++) {
                String s1 =rs.getString("immatriculation");
            rs.next();
            ar.add(s1);
            }
            for (int i = 0; i < ar.size(); i++) {
                model.add(i, ar.get(i));
            }
        }else {
            String[] items = {"Aucune Plaque"};
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        ps.close();
        
        return model;
    }
    public Vehicule getInfoVehicule(String immatriculation)
    {
        Vehicule unVehicule = null;
        try {
            ps = cnx.prepareStatement("SELECT vehicule.immatriculation, vehicule.marque, vehicule.modele, vehicule.annee, vehicule.codeCategorie from vehicule where vehicule.immatriculation = ?");
            ps.setString(1, immatriculation);
            rs = ps.executeQuery();
            if(rs.next())
            {
                unVehicule = new Vehicule(immatriculation,rs.getString("Marque"),rs.getString("modele"),rs.getInt("annee"),rs.getInt("codeCategorie"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unVehicule;
    }
    
}
