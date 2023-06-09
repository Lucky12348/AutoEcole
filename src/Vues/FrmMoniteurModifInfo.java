/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlMoniteur;
import Controlers.CtrlUser;
import Entities.Moniteur;
import Entities.User;
import Tools.ConnexionBDD;
import Tools.ModelJTable;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;



/**
 *
 * @author louis
 */
public class FrmMoniteurModifInfo extends javax.swing.JFrame {
    CtrlMoniteur ctrlMoniteur;
    Moniteur unMoniteur;
    CtrlUser ctrlUser;
    ConnexionBDD cnx;
    static User theUser;

    /**
     * Creates new form FrmEleveModifInfo
     */

    public FrmMoniteurModifInfo(User leUser) {
        initComponents();
        theUser = leUser;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNom = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblNom1 = new javax.swing.JLabel();
        lblNom2 = new javax.swing.JLabel();
        lblNom3 = new javax.swing.JLabel();
        lblNom4 = new javax.swing.JLabel();
        lblNom5 = new javax.swing.JLabel();
        lblNom6 = new javax.swing.JLabel();
        lblNom7 = new javax.swing.JLabel();
        lblNom8 = new javax.swing.JLabel();
        lblNom9 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtMdpModif = new javax.swing.JTextField();
        txtMdpModifC = new javax.swing.JTextField();
        cboSexe = new javax.swing.JComboBox<>();
        txtAdresse = new javax.swing.JTextField();
        txtPostal = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnModif = new javax.swing.JButton();
        lblNom10 = new javax.swing.JLabel();
        dcNaissance = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        btnDeconnexion = new javax.swing.JToggleButton();
        btnModifE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNom.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom.setText("Nom");

        lblInfo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblInfo.setText("Modifier ses informations personnelles");

        lblNom1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom1.setText("Prénom");

        lblNom2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom2.setText("Mail");

        lblNom3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom3.setText("Mot de passe");

        lblNom4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom4.setText("Confirmation");

        lblNom5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom5.setText("Sexe");

        lblNom6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom6.setText("Adresse");

        lblNom7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom7.setText("Code Postal");

        lblNom8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom8.setText("Ville");

        lblNom9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom9.setText("Téléphone");

        cboSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));

        btnModif.setText("MODIFIER");
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });

        lblNom10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNom10.setText("Date de naissance");

        jButton1.setText("Moniteur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDeconnexion.setText("Déconnexion");
        btnDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnexionActionPerformed(evt);
            }
        });

        btnModifE.setBackground(new java.awt.Color(51, 102, 0));
        btnModifE.setText("Modifier ses informations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModif)
                .addGap(455, 455, 455))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNom2)
                            .addComponent(lblNom4)
                            .addComponent(lblNom))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMdpModifC, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNom3)
                            .addComponent(lblNom1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMdpModif, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNom5)
                    .addComponent(lblNom6)
                    .addComponent(lblNom7)
                    .addComponent(lblNom8)
                    .addComponent(lblNom9)
                    .addComponent(lblNom10))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(txtVille, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(txtPostal, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(txtAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(cboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcNaissance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeconnexion)
                .addGap(3, 3, 3)
                .addComponent(btnModifE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(371, 371, 371)
                    .addComponent(lblInfo)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeconnexion)
                    .addComponent(jButton1)
                    .addComponent(btnModifE))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom)
                    .addComponent(lblNom5)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom1)
                    .addComponent(lblNom6)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom2)
                    .addComponent(lblNom7)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom3)
                    .addComponent(lblNom8)
                    .addComponent(txtMdpModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom4)
                    .addComponent(lblNom9)
                    .addComponent(txtMdpModifC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNom10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btnModif)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dcNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(lblInfo)
                    .addContainerGap(471, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifActionPerformed
        if (txtNom.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un nom","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtPrenom.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un prenom","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtMail.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un mail","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtMdpModif.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un mot de passe","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (!txtMdpModifC.getText().equals(txtMdpModif.getText())){
            JOptionPane.showMessageDialog(this, "confirmer le mot de passe","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtAdresse.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une adresse","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtPostal.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un code postal","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtVille.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une ville","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtTel.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un numéro de téléphone","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else {
        String DateNaissance = new SimpleDateFormat("yyyy-MM-dd").format(dcNaissance.getDate());
        ctrlMoniteur.ModifInformationMoniteur(txtNom.getText(), txtPrenom.getText(),cboSexe.getSelectedItem().toString(), txtAdresse.getText(), Integer.parseInt(txtPostal.getText()), txtVille.getText(), Integer.parseInt(txtTel.getText()), txtMail.getText(), txtMdpModif.getText(),theUser.getIdMoniteur(),DateNaissance);
        }
    }//GEN-LAST:event_btnModifActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cnx = new ConnexionBDD();
        ctrlMoniteur = new CtrlMoniteur();
        ctrlUser = new CtrlUser();
        txtMail.setText(theUser.getEmail());
        unMoniteur = ctrlMoniteur.getInfoMoniteur(theUser.getIdMoniteur());
        txtNom.setText(unMoniteur.getNom());
        txtPrenom.setText(unMoniteur.getPrenom());
        cboSexe.setSelectedItem(unMoniteur.getSexe());
        txtAdresse.setText(unMoniteur.getAdresse1());
        txtPostal.setText(unMoniteur.getCodePostal());
        txtVille.setText(unMoniteur.getVille());
        txtTel.setText(unMoniteur.getTelephone());
        dcNaissance.setDate(unMoniteur.getDate());
    }//GEN-LAST:event_formWindowOpened

    private void btnDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnexionActionPerformed
        this.dispose();//ferme le frmMoniteur
    }//GEN-LAST:event_btnDeconnexionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();//ferme le frmMoniteurModifInfo
        FrmMoniteur frm = new FrmMoniteur(theUser);
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMoniteurModifInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMoniteurModifInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMoniteurModifInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMoniteurModifInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMoniteurModifInfo(theUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDeconnexion;
    private javax.swing.JButton btnModif;
    private javax.swing.JButton btnModifE;
    private javax.swing.JComboBox<String> cboSexe;
    private com.toedter.calendar.JDateChooser dcNaissance;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNom1;
    private javax.swing.JLabel lblNom10;
    private javax.swing.JLabel lblNom2;
    private javax.swing.JLabel lblNom3;
    private javax.swing.JLabel lblNom4;
    private javax.swing.JLabel lblNom5;
    private javax.swing.JLabel lblNom6;
    private javax.swing.JLabel lblNom7;
    private javax.swing.JLabel lblNom8;
    private javax.swing.JLabel lblNom9;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMdpModif;
    private javax.swing.JTextField txtMdpModifC;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPostal;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
