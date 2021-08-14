/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pet;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author me
 */
public class checkIn extends javax.swing.JFrame {

    /**
     * Creates new form checkIn
     */
    public checkIn() {
        initComponents();
        getContentPane().setBackground(Color.pink);  //set background color
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        nameInput = new javax.swing.JTextField();
        birthdayInput = new javax.swing.JFormattedTextField();
        gender = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        spaceLabel = new javax.swing.JLabel();
        spaceInput = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        titleLabel.setText("CHECK IN PET");

        nameLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        nameLabel.setText("NAME");

        birthdayLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        birthdayLabel.setText("BIRTHDAY");

        logout.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        birthdayInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        birthdayInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayInputActionPerformed(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));

        genderLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        genderLabel.setText("GENDER");

        spaceLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        spaceLabel.setText("SPACE#");

        submitButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addGap(54, 54, 54)
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthdayLabel)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spaceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spaceInput, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(birthdayInput)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(back)
                        .addGap(18, 18, 18)
                        .addComponent(submitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(logout)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdayInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameInput)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spaceInput)
                            .addComponent(spaceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(submitButton))
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // display login screen
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new userLogin().setVisible(true);
        });
    }//GEN-LAST:event_logoutActionPerformed

    private void birthdayInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayInputActionPerformed
        // input birthday format
    }//GEN-LAST:event_birthdayInputActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // define variables name, bday, gen, and space to check in pet
        String uname = nameInput.getText();
        String bday = birthdayInput.getFormatterFactory().toString();
        Object gen = gender.getSelectedItem();
        int space = Integer.parseInt(spaceInput.getText());
    
        //conect to database and insert pet into database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL database connection
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petdb", "smedlock", "8716" )) {
                Statement sta = con.createStatement();
                String query ="INSERT INTO checkin"
                + "(`name`, `birthday`, `gender`, `space`)"
                +
                "VALUES('"+uname+"','"+bday+"','"+gen+"','"+space+"')";

                int x = sta.executeUpdate(query);  //execute query
                if (x == 0)
                JOptionPane.showMessageDialog(submitButton, "Space not available");  //display not available message if space is taken

                else {
                    if(space == 0)
                    JOptionPane.showMessageDialog(submitButton, "Pet is checked in!"); //pet is checked in based on space availability

                }

                   //catch exceptions
            } catch (SQLException ex) {
                Logger.getLogger(checkIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(newUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_submitButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // Go back to pet menu screen
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new petMenu().setVisible(true);
        });
    }//GEN-LAST:event_backActionPerformed

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
      
    }//GEN-LAST:event_nameInputActionPerformed

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
            java.util.logging.Logger.getLogger(checkIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new checkIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JFormattedTextField birthdayInput;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton logout;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField spaceInput;
    private javax.swing.JLabel spaceLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
