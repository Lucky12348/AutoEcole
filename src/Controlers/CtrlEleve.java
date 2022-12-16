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
        
}
