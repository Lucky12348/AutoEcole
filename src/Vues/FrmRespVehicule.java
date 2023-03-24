/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Entities.User;
import Entities.Vehicule;
import Vues.FrmConnexion;
import static Vues.FrmRespSommaire.leUser;

/**
 *
 * @author louis
 */
public class FrmRespVehicule extends javax.swing.JFrame {
    Vehicule unVehicule;
    /**
     * Creates new form FrmRespSommaire
     */
    public FrmRespVehicule(User unUser) {
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
        btnCategorie = new javax.swing.JButton();
        btnMoniteur = new javax.swing.JButton();
        btnEleve = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        btnLecon = new javax.swing.JButton();
        btnAjoutVehicule = new javax.swing.JButton();
        btnModifVehicule = new javax.swing.JButton();

        btnDeco.setText("Deconnexion");
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

        btnVehicule.setBackground(new java.awt.Color(0, 255, 100));
        btnVehicule.setText("Vehicule");
        btnVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculeActionPerformed(evt);
            }
        });

        btnCategorie.setText("Catégorie");
        btnCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategorieActionPerformed(evt);
            }
        });

        btnMoniteur.setText("Moniteur");
        btnMoniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoniteurActionPerformed(evt);
            }
        });

        btnEleve.setText("Eleve");
        btnEleve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleveActionPerformed(evt);
            }
        });

        btnStats.setText("Statstique");
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

        btnAjoutVehicule.setText("Ajouter un véhicule");
        btnAjoutVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutVehiculeActionPerformed(evt);
            }
        });

        btnModifVehicule.setText("Modifier un véhicule");
        btnModifVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifVehiculeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMoniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEleve, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLecon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnStats, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAjoutVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(261, Short.MAX_VALUE))
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
                    .addComponent(btnCategorie)
                    .addComponent(btnMoniteur)
                    .addComponent(btnEleve)
                    .addComponent(btnStats))
                .addGap(26, 26, 26)
                .addComponent(btnLecon)
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjoutVehicule)
                    .addComponent(btnModifVehicule))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecoActionPerformed
        this.dispose();//ferme le frmEleve
    }//GEN-LAST:event_btnDecoActionPerformed

    private void btnRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespActionPerformed
        this.dispose();
        FrmRespSommaire frm = new FrmRespSommaire(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnRespActionPerformed

    private void btnVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculeActionPerformed
        this.dispose();
        FrmRespVehicule frm = new FrmRespVehicule(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnVehiculeActionPerformed

    private void btnCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategorieActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCategorieActionPerformed

    private void btnMoniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoniteurActionPerformed
        this.dispose();
        FrmRespMoniteur frm = new FrmRespMoniteur(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnMoniteurActionPerformed

    private void btnEleveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleveActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnEleveActionPerformed

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

    private void btnAjoutVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutVehiculeActionPerformed
        this.dispose();
        FrmRespAjoutVehicule frm = new FrmRespAjoutVehicule(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnAjoutVehiculeActionPerformed

    private void btnModifVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifVehiculeActionPerformed
        this.dispose();
        FrmRespModifVehicule frm = new FrmRespModifVehicule(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnModifVehiculeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRespVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRespVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRespVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRespVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRespVehicule(leUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjoutVehicule;
    private javax.swing.JButton btnCategorie;
    private javax.swing.JButton btnDeco;
    private javax.swing.JButton btnEleve;
    private javax.swing.JButton btnLecon;
    private javax.swing.JButton btnModifVehicule;
    private javax.swing.JButton btnMoniteur;
    private javax.swing.JButton btnResp;
    private javax.swing.JButton btnStats;
    private javax.swing.JButton btnVehicule;
    // End of variables declaration//GEN-END:variables
}
