/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacqu
 */
public class CtrlGraphique 
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlGraphique() {
        cnx = ConnexionBDD.getCnx();
    }
   
    public HashMap<String,Integer> GetDatasGraphique3()
    {
        HashMap<String, Integer> datas = new HashMap();
        try {
            ps = cnx.prepareStatement("select count(lecon.CodeLecon)as nb,modele as total \n" +
"from lecon\n" +
"join moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur \n" +
"join vehicule on lecon.Immatriculation=vehicule.Immatriculation\n" +
"WHERE moniteur.CodeMoniteur = 11\n" +
"group by modele;");
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString("total"), rs.getInt("nb"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }
    
    public HashMap<String,Integer> GetDatasGraphiqueAdmin1()
    {
        HashMap<String, Integer> datas = new HashMap();
        try {
            ps = cnx.prepareStatement("select modele,count(lecon.CodeLecon) as total from lecon  join moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur join vehicule on lecon.Immatriculation=vehicule.Immatriculation group by modele;");
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString("modele"), rs.getInt("total"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }
    public HashMap<String,Integer> GetDatasGraphiqueAdmin2()
    {
        HashMap<String, Integer> datas = new HashMap();
        try {
            ps = cnx.prepareStatement("SELECT moniteur.Nom,count(lecon.CodeLecon) as total from lecon join moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur group by moniteur.Nom;;");
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString("Nom"), rs.getInt("total"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }
    
}
