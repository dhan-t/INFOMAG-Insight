/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.insight_flatlaf_revamp;

/**
 *
 * @author Dhan Michea
 */
public class basicTable_page extends javax.swing.JFrame {

    /**
     * Creates new form home_page
     */
    public basicTable_page() {
        initComponents();
        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.

     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel panel_sidePanel = new javax.swing.JPanel();
        label_Insight = new javax.swing.JLabel();
        label_AdvTable = new javax.swing.JLabel();
        label_Home = new javax.swing.JLabel();
        label_AddResident = new javax.swing.JLabel();
        label_BasicTable = new javax.swing.JLabel();
        panel_BrgyName = new javax.swing.JPanel();
        label_BrgyName = new javax.swing.JLabel();
        label_BrgyName1 = new javax.swing.JLabel();
        scrollpane_MainScroll = new javax.swing.JScrollPane();
        table_BasicTable = new javax.swing.JTable();
        button_EditRes = new javax.swing.JButton();
        button_RemoveRes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(90, 90, 90));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        panel_sidePanel.setBackground(new java.awt.Color(51, 51, 51));
        panel_sidePanel.setToolTipText("");
        panel_sidePanel.setMaximumSize(new java.awt.Dimension(240, 720));
        panel_sidePanel.setMinimumSize(new java.awt.Dimension(240, 720));

        label_Insight.setFont(new java.awt.Font("Quando", 1, 24)); // NOI18N
        label_Insight.setForeground(new java.awt.Color(242, 242, 242));
        label_Insight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Insight.setText("Insight");

        label_AdvTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_AdvTable.setText("Advanced Table");
        label_AdvTable.setToolTipText("");
        label_AdvTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_AdvTableMouseClicked(evt);
            }
        });

        label_Home.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Home.setText("Home");
        label_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_HomeMouseClicked(evt);
            }
        });

        label_AddResident.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_AddResident.setText("Add Resident");
        label_AddResident.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_AddResidentMouseClicked(evt);
            }
        });

        label_BasicTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_BasicTable.setText("Basic Table");
        label_BasicTable.setToolTipText("");

        javax.swing.GroupLayout panel_sidePanelLayout = new javax.swing.GroupLayout(panel_sidePanel);
        panel_sidePanel.setLayout(panel_sidePanelLayout);
        panel_sidePanelLayout.setHorizontalGroup(
            panel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Insight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sidePanelLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(panel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_BasicTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_AddResident, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_AdvTable, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        panel_sidePanelLayout.setVerticalGroup(
            panel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sidePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_Insight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(label_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_AddResident, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_BasicTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_AdvTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 365, Short.MAX_VALUE))
        );

        panel_BrgyName.setBackground(new java.awt.Color(255, 214, 10));
        panel_BrgyName.setPreferredSize(new java.awt.Dimension(540, 90));

        label_BrgyName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        label_BrgyName.setForeground(new java.awt.Color(51, 51, 51));
        label_BrgyName.setText("Basic Table");

        label_BrgyName1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label_BrgyName1.setForeground(new java.awt.Color(51, 51, 51));
        label_BrgyName1.setText("Barangay #337, Zone 34, District 2, Manila");

        javax.swing.GroupLayout panel_BrgyNameLayout = new javax.swing.GroupLayout(panel_BrgyName);
        panel_BrgyName.setLayout(panel_BrgyNameLayout);
        panel_BrgyNameLayout.setHorizontalGroup(
            panel_BrgyNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BrgyNameLayout.createSequentialGroup()
                .addGroup(panel_BrgyNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BrgyNameLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(label_BrgyName1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_BrgyNameLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(label_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel_BrgyNameLayout.setVerticalGroup(
            panel_BrgyNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BrgyNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_BrgyName1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(label_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        table_BasicTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table_BasicTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Surname", "First Name", "M.I.", "Sex", "Number", "Addresss"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_BasicTable.setRowHeight(35);
        table_BasicTable.setShowGrid(true);
        table_BasicTable.getTableHeader().setResizingAllowed(false);
        table_BasicTable.getTableHeader().setReorderingAllowed(false);
        scrollpane_MainScroll.setViewportView(table_BasicTable);
        if (table_BasicTable.getColumnModel().getColumnCount() > 0) {
            table_BasicTable.getColumnModel().getColumn(0).setResizable(false);
            table_BasicTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            table_BasicTable.getColumnModel().getColumn(1).setResizable(false);
            table_BasicTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            table_BasicTable.getColumnModel().getColumn(2).setResizable(false);
            table_BasicTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            table_BasicTable.getColumnModel().getColumn(3).setResizable(false);
            table_BasicTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            table_BasicTable.getColumnModel().getColumn(4).setResizable(false);
            table_BasicTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            table_BasicTable.getColumnModel().getColumn(5).setResizable(false);
            table_BasicTable.getColumnModel().getColumn(5).setPreferredWidth(60);
            table_BasicTable.getColumnModel().getColumn(6).setResizable(false);
            table_BasicTable.getColumnModel().getColumn(6).setPreferredWidth(150);
            table_BasicTable.getColumnModel().getColumn(7).setResizable(false);
            table_BasicTable.getColumnModel().getColumn(7).setPreferredWidth(400);
        }

        button_EditRes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_EditRes.setText("Edit Resident");
        button_EditRes.setMaximumSize(new java.awt.Dimension(180, 35));
        button_EditRes.setMinimumSize(new java.awt.Dimension(180, 35));
        button_EditRes.setPreferredSize(new java.awt.Dimension(180, 35));
        button_EditRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_EditResMouseClicked(evt);
            }
        });

        button_RemoveRes.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        button_RemoveRes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_RemoveRes.setText("Remove Resident");
        button_RemoveRes.setToolTipText("");
        button_RemoveRes.setMaximumSize(new java.awt.Dimension(180, 35));
        button_RemoveRes.setMinimumSize(new java.awt.Dimension(180, 35));
        button_RemoveRes.setPreferredSize(new java.awt.Dimension(180, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panel_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(button_EditRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(button_RemoveRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(scrollpane_MainScroll)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(button_EditRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button_RemoveRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addComponent(scrollpane_MainScroll)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HomeMouseClicked
        this.dispose();
        home_page home_page = new home_page();         // TODO add your handling code here:
    }//GEN-LAST:event_label_HomeMouseClicked

    private void label_AddResidentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_AddResidentMouseClicked
     this.dispose();
      addResident_page addResident_page = new addResident_page();        // TODO add your handling code here:
    }//GEN-LAST:event_label_AddResidentMouseClicked

    private void label_AdvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_AdvTableMouseClicked
    this.dispose();
      advTable_page advTable_page = new advTable_page();        // TODO add your handling code here:
    }//GEN-LAST:event_label_AdvTableMouseClicked

    private void button_EditResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EditResMouseClicked
    this.dispose();
      editResident_page editResident_page = new editResident_page();       // TODO add your handling code here:
    }//GEN-LAST:event_button_EditResMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_EditRes;
    private javax.swing.JButton button_RemoveRes;
    private javax.swing.JLabel label_AddResident;
    private javax.swing.JLabel label_AdvTable;
    private javax.swing.JLabel label_BasicTable;
    private javax.swing.JLabel label_BrgyName;
    private javax.swing.JLabel label_BrgyName1;
    private javax.swing.JLabel label_Home;
    private javax.swing.JLabel label_Insight;
    private javax.swing.JPanel panel_BrgyName;
    private javax.swing.JScrollPane scrollpane_MainScroll;
    private javax.swing.JTable table_BasicTable;
    // End of variables declaration//GEN-END:variables
}
