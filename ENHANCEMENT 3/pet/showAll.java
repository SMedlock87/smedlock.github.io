/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pet;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author me
 */
public class showAll extends javax.swing.JFrame {

    private Object rs;

    /**
     * Creates new form showAll
     */
    public showAll() {
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

        searchButton = new javax.swing.JButton();
        showAllButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        petTable = new javax.swing.JTable();
        idLabel = new javax.swing.JLabel();
        findTitle = new javax.swing.JLabel();
        petIdInput = new javax.swing.JTextField();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        showAllButton.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        showAllButton.setText("SHOW ALL");
        showAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllButtonActionPerformed(evt);
            }
        });

        petTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(petTable);

        idLabel.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        idLabel.setText("Pet Id");

        findTitle.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        findTitle.setText("FIND PET");

        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 166, Short.MAX_VALUE)
                .addComponent(findTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(petIdInput)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(searchButton)
                        .addGap(18, 18, 18)
                        .addComponent(showAllButton)
                        .addGap(30, 30, 30)
                        .addComponent(logout)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(findTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(petIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(showAllButton)
                    .addComponent(logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        
       
        String[] columnName = {"id","name","gender"}; 
        int petId = Integer.parseInt(petIdInput.getText());
        
        DefaultTableModel table = (DefaultTableModel) petTable.getModel();
        table.setColumnIdentifiers(columnName);

            try {
                    Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL database connection
               try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petdb", "smedlock", "8716" )) {
                   
                PreparedStatement pstatement = con.prepareStatement("SELECT id, name , gender FROM petinfo where id = ?");
                pstatement.setInt(1, petId);
                ResultSet rs = pstatement.executeQuery();
                


ResultSetMetaData resultsData = rs.getMetaData();
int numCols = resultsData.getColumnCount();
while(rs.next()){
 Object[] objects = new Object[numCols];

 for(int i=0;i<numCols;i++){
  objects[i]=rs.getObject(i+1);
  }
 table.addRow(objects);
}
petTable.setModel(table);

                } catch (SQLException ex) {
              Logger.getLogger(showAll.class.getName()).log(Level.SEVERE, null, ex);
          }
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(showAll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void showAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllButtonActionPerformed
        // TODO add your handling code here:
        
        
        String[] tableColumnsName = {"id","name","gender"}; 
        DefaultTableModel table = (DefaultTableModel) petTable.getModel();
        table.setColumnIdentifiers(tableColumnsName);

            try {
                    Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL database connection
               try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petdb", "smedlock", "8716" )) {
                   
               PreparedStatement pstatement = con.prepareStatement("SELECT * FROM `newuser` WHERE `username` = ? AND `password` = ?");
                ResultSet rs = pstatement.executeQuery("select id,name,gender from petinfo");


                ResultSetMetaData rsmd = rs.getMetaData();
                int colNo = rsmd.getColumnCount();
                while(rs.next()){
                Object[] objects = new Object[colNo];
 
                for(int i=0;i<colNo;i++){
                objects[i]=rs.getObject(i+1);
  }
        table.addRow(objects);
}
        petTable.setModel(table);

                } 
               catch (SQLException ex) {
                Logger.getLogger(showAll.class.getName()).log(Level.SEVERE, null, ex);
          }
    }   
            catch (ClassNotFoundException ex) {
            Logger.getLogger(showAll.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_showAllButtonActionPerformed
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new userLogin().setVisible(true);
        });
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(showAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
            new newUser().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel findTitle;
    private javax.swing.JLabel idLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField petIdInput;
    private javax.swing.JTable petTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton showAllButton;
    // End of variables declaration//GEN-END:variables
}
