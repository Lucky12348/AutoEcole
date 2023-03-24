/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entities.Lecon;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lucky1234
 */

public class ModelJTable extends AbstractTableModel{
    private String[] nomsColonnes;
    private Object[][] rows;


    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int columnIndex) {
        return nomsColonnes[columnIndex];
    }

    public void LoadDataLecon(ArrayList<Lecon> uneListe) {
        nomsColonnes = new String[]{"Date", "Heure", "Nom", "libelle","Réglée"};
        rows = new Object[uneListe.size()][5];
        int i = 0;
        for (Lecon uneLecon : uneListe) {
            rows[i][0] = uneLecon.getDate();
            rows[i][1] = uneLecon.getHeure();
            rows[i][2] = uneLecon.getNomMoniteur();
            rows[i][3] = uneLecon.getLibelle();
            rows[i][4] = uneLecon.getReglee();
            i++;
        }
}
   public void LoadDataLeconMoniteur(ArrayList<Lecon> uneListe) {
        nomsColonnes = new String[]{"Date", "Heure", "Nom Eleve", "libelle","code"};
        rows = new Object[uneListe.size()][5];
        int i = 0;
        for (Lecon uneLecon : uneListe) {
            rows[i][0] = uneLecon.getDate();
            rows[i][1] = uneLecon.getHeure();
            rows[i][2] = uneLecon.getNomEleve();
            rows[i][3] = uneLecon.getLibelle();
            rows[i][4] = uneLecon.getCodeElevee();

            i++;
        }
}
   
}