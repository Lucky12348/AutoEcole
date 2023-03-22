/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.User;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucky1234
 */
public class CtrlUser {
     private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlUser() {
        cnx = ConnexionBDD.getCnx();
    }
    
    public User GetUnUser(String mail, String mdp)
    {
        User unUser = null;
        try {
            ps = cnx.prepareStatement("select codeMoniteur,codeEleve,mail,mdp,statut from identifiant where mail = '"+mail+"' and mdp = '"+mdp+"'");
            rs = ps.executeQuery();
            if(rs.next())
            {
                unUser = new User(rs.getInt("codeMoniteur"),rs.getInt("codeEleve"),rs.getString("statut"),mail);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unUser;
    }
}
