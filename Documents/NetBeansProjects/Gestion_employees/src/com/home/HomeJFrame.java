/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.home;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bmd-tech
 */
public class HomeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeJFrame
     */
    public HomeJFrame() {
        initComponents();
        setIconImage (Toolkit.getDefaultToolkit().getImage(getClass().getResource("home.png")));
        loadTable();
        
    }

    public void loadAllDataIntoTable(List<HomeBean> list) {
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (HomeBean bean : list) {
        
            Vector v = new Vector();
            v.add(bean.getIde());
            v.add(bean.getPrenom());
            v.add(bean.getNom());
            v.add(bean.getSexe());
            v.add(bean.getPays());
            v.add(bean.getAddresse());
            v.add(bean.getDate());
            
            dtm.addRow(v);
            
            
            
        }

   }
    
    public void loadTable () {
    
        HomeBal bal = new HomeBal();
        List list = bal.loadData();
        bal.loadData();
        loadAllDataIntoTable(list);
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPrenom = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldAddresse = new javax.swing.JTextField();
        jComboBoxSexe = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBoxPays = new javax.swing.JComboBox<>();
        jButtonUpdate = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/home.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion des employees");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGap(216, 216, 216))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1160, 150));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true), "CRUD APP ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Prenom :");

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Sexe :");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Nom :");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Addresse :");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Pays :");

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Date :");

        jTextFieldPrenom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });

        jTextFieldNom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });

        jTextFieldAddresse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        jTextFieldAddresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddresseActionPerformed(evt);
            }
        });

        jComboBoxSexe.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jComboBoxSexe.setForeground(new java.awt.Color(0, 153, 153));
        jComboBoxSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jComboBoxSexe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));

        jDateChooser1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));

        jComboBoxPays.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jComboBoxPays.setForeground(new java.awt.Color(0, 153, 153));
        jComboBoxPays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senegal", "Mali", "Maurutanie", "Gambie", "Guinee", "Gabon", "Congo", "Cote d'Ivoire" }));
        jComboBoxPays.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 153));
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Modifier");
        jButtonUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonInsert.setBackground(new java.awt.Color(0, 153, 153));
        jButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("Ajouter");
        jButtonInsert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(0, 153, 153));
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Supprimer");
        jButtonDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(0, 153, 153));
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Effacer");
        jButtonClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAddresse, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jComboBoxSexe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrenom)
                            .addComponent(jComboBoxPays, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 109, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 520, 460));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Prenom", "Nom", "Sexe", "Pays", "Addresse", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 630, 460));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 1170, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1200, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomActionPerformed

    private void jTextFieldAddresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddresseActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        
        String prenom  = jTextFieldNom.getText();
        String nom  = jTextFieldPrenom.getText();
        String sexe  = (String) jComboBoxSexe.getSelectedItem();
        String pays  = (String) jComboBoxPays.getSelectedItem();
        String addresse = jTextFieldAddresse.getText();
        Date date = jDateChooser1.getDate();
        HomeBean bean = new HomeBean(ide,prenom,nom,sexe,pays,addresse,date);
        
        HomeBal bal = new HomeBal();
        bal.updateData(bean);
        loadTable();
        


    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed

        // TODO add your handling code here:
        String prenom  = jTextFieldNom.getText();
        String nom  = jTextFieldPrenom.getText();
        String sexe  = (String) jComboBoxSexe.getSelectedItem();
        String pays  = (String) jComboBoxPays.getSelectedItem();
        String addresse = jTextFieldAddresse.getText();
        Date date = jDateChooser1.getDate();
        
        
        HomeBean homeBean = new HomeBean(0,prenom,nom,sexe,pays,addresse,date);
        
        HomeBal homeObj = new HomeBal();
        
        homeObj.insert(homeBean); 
        
        loadTable();
        
        
     
    }//GEN-LAST:event_jButtonInsertActionPerformed
    
    
    int ide = 0 ;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    int row = jTable1.getSelectedRow();
    
    if (row < 0) {
        JOptionPane.showMessageDialog(null, "Selectionner une colonne a modifier ou supprimer");
    }else {
    
            ide = (int) jTable1.getValueAt(row, 0);
            HomeBal bal = new HomeBal();
            HomeBean bean = bal.returnAllDataToTextFields(ide);
            jTextFieldNom.setText(bean.getPrenom());
            jTextFieldPrenom.setText(bean.getNom());
            jComboBoxSexe.setSelectedItem(bean.getSexe());
            jComboBoxPays.setSelectedItem(bean.getPays());
            jTextFieldAddresse.setText(bean.getAddresse());
            jDateChooser1.setDate(bean.getDate());
            loadTable();
                 
    }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
        HomeBal bal = new HomeBal();
        bal.deleteRecord(ide);
        loadTable();
        
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        
        clearTextFieldsData();
        
    }//GEN-LAST:event_jButtonClearActionPerformed

    
    
    public void clearTextFieldsData () {
        jTextFieldPrenom.setText("");
        jTextFieldNom.setText("");
        jTextFieldAddresse.setText("");
        jDateChooser1.setDate(null);
        
    }
  
    
    
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
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxPays;
    private javax.swing.JComboBox<String> jComboBoxSexe;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAddresse;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
}
