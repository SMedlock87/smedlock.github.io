/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pet;

import javax.swing.JOptionPane;

/**
 *
 * @author me
 */
public class servicePet extends javax.swing.JFrame {

    /**
     * Creates new form servicePet
     */
    public servicePet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        amountDue = new javax.swing.JButton();
        bathCheckBox = new javax.swing.JCheckBox();
        groomInput = new javax.swing.JCheckBox();
        walkInput = new javax.swing.JCheckBox();
        outfitInput = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logout.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        title.setText("PET SERVICES");

        amountDue.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        amountDue.setText("AMOUNT DUE");
        amountDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountDueActionPerformed(evt);
            }
        });

        bathCheckBox.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        bathCheckBox.setText("BATHING");
        bathCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathCheckBoxActionPerformed(evt);
            }
        });

        groomInput.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        groomInput.setText("GROOMING");
        groomInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groomInputActionPerformed(evt);
            }
        });

        walkInput.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        walkInput.setText("WALKING");
        walkInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walkInputActionPerformed(evt);
            }
        });

        outfitInput.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        outfitInput.setText("OUTFIT");
        outfitInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outfitInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groomInput)
                            .addComponent(outfitInput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(walkInput)
                            .addComponent(bathCheckBox)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountDue)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(logout)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bathCheckBox)
                    .addComponent(groomInput))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outfitInput)
                    .addComponent(walkInput))
                .addGap(18, 18, 18)
                .addComponent(amountDue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new userLogin().setVisible(true);
        });
    }//GEN-LAST:event_logoutActionPerformed

    private void bathCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bathCheckBoxActionPerformed
        // TODO add your handling code here:
                                                      

         if (bathCheckBox.isSelected()) {

            total = total + 15;

        } else {

           total = total -15;

        }
 
    }//GEN-LAST:event_bathCheckBoxActionPerformed

    private void amountDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountDueActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(amountDue, "AMOUNT DUE: $" + String.valueOf(total));
                  
         
    }//GEN-LAST:event_amountDueActionPerformed

    private void groomInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groomInputActionPerformed
        // TODO add your handling code here:
        if (groomInput.isSelected()) {
            total = total + 30;
        } 
        
        else {

           total = total - 30;
        }
        
        
        
    }//GEN-LAST:event_groomInputActionPerformed

    private void walkInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walkInputActionPerformed
        // TODO add your handling code here:
        
         if (walkInput.isSelected()) {

            total = total + 20;

        } else {

           total = total - 20;

        }
    }//GEN-LAST:event_walkInputActionPerformed

    private void outfitInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outfitInputActionPerformed
        // TODO add your handling code here:
        
        if (outfitInput.isSelected()) {

            total = total + 40;

        } else {

           total = total - 40;

        }

    }//GEN-LAST:event_outfitInputActionPerformed

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
            java.util.logging.Logger.getLogger(servicePet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(servicePet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(servicePet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(servicePet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new servicePet().setVisible(true);
        });
    }
    private int total = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amountDue;
    private javax.swing.JCheckBox bathCheckBox;
    private javax.swing.JCheckBox groomInput;
    private javax.swing.JButton logout;
    private javax.swing.JCheckBox outfitInput;
    private javax.swing.JLabel title;
    private javax.swing.JCheckBox walkInput;
    // End of variables declaration//GEN-END:variables
}