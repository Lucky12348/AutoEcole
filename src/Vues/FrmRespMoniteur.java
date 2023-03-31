/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlAdmin;
import Entities.User;
import Vues.FrmConnexion;
import static Vues.FrmRespSommaire.leUser;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author louis
 */
public class FrmRespMoniteur extends javax.swing.JFrame {
    CtrlAdmin leCtrlA;
    /**
     * Creates new form FrmRespSommaire
     */
    public FrmRespMoniteur(User unUser) {
        initComponents();
        leUser = unUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeco = new javax.swing.JButton();
        btnResp = new javax.swing.JButton();
        btnVehicule = new javax.swing.JButton();
        btnMoniteur = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        btnLecon = new javax.swing.JButton();
        txtNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSexe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAdresse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodePostal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtVille = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnValiderMoniteur = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cboLicence = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        dtDateObtention = new com.toedter.calendar.JDateChooser();
        dtDateNaissance = new com.toedter.calendar.JDateChooser();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnDeco.setText("Déconnexion");
        btnDeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecoActionPerformed(evt);
            }
        });

        btnResp.setBackground(new java.awt.Color(0, 255, 100));
        btnResp.setText("Responsable");
        btnResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespActionPerformed(evt);
            }
        });

        btnVehicule.setText("Véhicule");
        btnVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculeActionPerformed(evt);
            }
        });

        btnMoniteur.setBackground(new java.awt.Color(0, 255, 100));
        btnMoniteur.setText("Moniteur");
        btnMoniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoniteurActionPerformed(evt);
            }
        });

        btnStats.setText("Statstiques");
        btnStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatsActionPerformed(evt);
            }
        });

        btnLecon.setText("Visualiser le planning des leçons");
        btnLecon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeconActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom");

        jLabel2.setText("Prenom");

        jLabel3.setText("Sexe");

        jLabel4.setText("DateDeNaissance");

        jLabel5.setText("Adresse");

        jLabel6.setText("Code Postal");

        jLabel7.setText("Ville");

        jLabel8.setText("Téléphone");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel9.setText("Ajouter un moniteur");

        btnValiderMoniteur.setText("Valider");
        btnValiderMoniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderMoniteurActionPerformed(evt);
            }
        });

        jLabel10.setText("Sélectionner une licence");

        cboLicence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automobile", "Poids lourd", "Bateau", "Moto", "Transport en commun" }));

        jLabel11.setText("Sélectionner une date d'obtention");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(btnMoniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLecon, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSexe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txtPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAdresse)
                                    .addComponent(txtCodePostal)
                                    .addComponent(dtDateNaissance, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboLicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnStats, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtDateObtention, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(428, 428, 428))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnValiderMoniteur)
                        .addGap(504, 504, 504))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeco)
                    .addComponent(btnResp))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVehicule)
                    .addComponent(btnMoniteur)
                    .addComponent(btnStats))
                .addGap(26, 26, 26)
                .addComponent(btnLecon)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtDateObtention, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(cboLicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGap(27, 27, 27)
                        .addComponent(btnValiderMoniteur)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dtDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecoActionPerformed
        this.dispose();//ferme le frmEleve
    }//GEN-LAST:event_btnDecoActionPerformed

    private void btnRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespActionPerformed
        this.dispose();
        FrmRespMoniteur frm = new FrmRespMoniteur(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnRespActionPerformed

    private void btnVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculeActionPerformed
        this.dispose();
        FrmRespVehicule frm = new FrmRespVehicule(leUser);
        frm.setVisible(true);    
    }//GEN-LAST:event_btnVehiculeActionPerformed

    private void btnMoniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoniteurActionPerformed
        this.dispose();
        FrmRespMoniteur frm = new FrmRespMoniteur(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnMoniteurActionPerformed

    private void btnStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatsActionPerformed
        this.dispose();
        FrmRespStats frm = new FrmRespStats(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnStatsActionPerformed

    private void btnLeconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeconActionPerformed
        this.dispose();
        FrmRespLecon frm = new FrmRespLecon(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnLeconActionPerformed

    private void btnValiderMoniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderMoniteurActionPerformed
        int lecon=0;
        int result = 0;
        if (txtNom.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un nom","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtPrenom.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un prenom","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtSexe.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un sexe","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (dtDateNaissance.getDate()==null){
            JOptionPane.showMessageDialog(this, "Saisir une date de naissance","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtAdresse.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une adresse","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtCodePostal.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un code postal","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtVille.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une ville","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtTel.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un numéro de téléphone","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (dtDateObtention.getDate()==null){
            JOptionPane.showMessageDialog(this, "Saisir une Date d'Obtention","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String selectedItem = (String) cboLicence.getSelectedItem();
            

            switch (selectedItem) {
                case "Automobile":
                    lecon = 1;
                    break;
                case "Poids lourd":
                    lecon = 2;
                    break;
                case "Bateau":
                    lecon = 3;
                    break;
                case "Moto":
                    lecon = 4;
                    break;
                case "Transport en commun":
                    lecon = 5;
                    break;
                default:
                    lecon = 0;
                    break;
            }
            try {
                leCtrlA.AjoutMoniteur(txtNom.getText(), txtPrenom.getText(), txtSexe.getText(), dtDateNaissance.getDate(), txtAdresse.getText(), txtCodePostal.getText(), txtVille.getText(), txtTel.getText(), dtDateObtention.getDate(),lecon);
            } catch (SQLException ex) {
                Logger.getLogger(FrmRespMoniteur.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Le moniteur bien été ajouté","Ok",JOptionPane.CANCEL_OPTION);
            
        }
    }//GEN-LAST:event_btnValiderMoniteurActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        leCtrlA = new CtrlAdmin();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRespMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRespMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRespMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRespMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRespMoniteur(leUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeco;
    private javax.swing.JButton btnLecon;
    private javax.swing.JButton btnMoniteur;
    private javax.swing.JButton btnResp;
    private javax.swing.JButton btnStats;
    private javax.swing.JButton btnValiderMoniteur;
    private javax.swing.JButton btnVehicule;
    private javax.swing.JComboBox<String> cboLicence;
    private com.toedter.calendar.JDateChooser dtDateNaissance;
    private com.toedter.calendar.JDateChooser dtDateObtention;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtCodePostal;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtSexe;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
