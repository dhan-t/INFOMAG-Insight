/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.insight_flatlaf_revamp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhan Michea
 */
public class basicTable_page extends javax.swing.JFrame {
    private final DBManager user;
    private boolean isBasic = true;
    private JTable table_AdvTable = null;
    private int rows = 0;
    /**
     * Creates new form home_page
     */
    public basicTable_page(DBManager user) {
        this.user = user;
        initComponents();
        myInitComponents();
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
        panel_SearchBar43 = new javax.swing.JPanel();
        textfield_SearchBar43 = new javax.swing.JTextField();
        button_SearchRes43 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(90, 90, 90));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
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
        label_BasicTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_BasicTableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_sidePanelLayout = new javax.swing.GroupLayout(panel_sidePanel);
        panel_sidePanel.setLayout(panel_sidePanelLayout);
        panel_sidePanelLayout.setHorizontalGroup(
            panel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Insight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sidePanelLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(panel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_AddResident, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label_BasicTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_AdvTable, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
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
                .addComponent(label_BasicTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_AdvTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_AddResident, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        scrollpane_MainScroll.setMinimumSize(null);

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
        table_BasicTable.setMaximumSize(new java.awt.Dimension(1280, 720));
        table_BasicTable.setMinimumSize(new java.awt.Dimension(950, 1050));
        table_BasicTable.setPreferredSize(new java.awt.Dimension(950, 1050));
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
        button_RemoveRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RemoveResActionPerformed(evt);
            }
        });

        textfield_SearchBar43.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_SearchBar43.setForeground(new java.awt.Color(102, 102, 102));
        textfield_SearchBar43.setText("Search by ID, First name, or Surname");
        textfield_SearchBar43.setToolTipText("");
        textfield_SearchBar43.setPreferredSize(new java.awt.Dimension(200, 40));
        textfield_SearchBar43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_SearchBar43FocusGained(evt);
            }
        });
        textfield_SearchBar43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_SearchBar43ActionPerformed(evt);
            }
        });

        button_SearchRes43.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_SearchRes43.setText("Search Resident");
        button_SearchRes43.setPreferredSize(new java.awt.Dimension(150, 40));
        button_SearchRes43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SearchRes43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_SearchBar43Layout = new javax.swing.GroupLayout(panel_SearchBar43);
        panel_SearchBar43.setLayout(panel_SearchBar43Layout);
        panel_SearchBar43Layout.setHorizontalGroup(
            panel_SearchBar43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SearchBar43Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(textfield_SearchBar43, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_SearchRes43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        panel_SearchBar43Layout.setVerticalGroup(
            panel_SearchBar43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SearchBar43Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panel_SearchBar43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_SearchBar43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_SearchRes43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_SearchBar43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button_EditRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(button_RemoveRes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(scrollpane_MainScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(panel_SearchBar43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(button_EditRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_RemoveRes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(9, 9, 9)
                        .addComponent(scrollpane_MainScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void myInitComponents() {
        if (user.getClearanceLvl() == 1) {
            button_EditRes.setVisible(false);
            button_RemoveRes.setVisible(false);
            label_AddResident.setVisible(false);
        }
        
        // adding the Advanced table
        table_AdvTable = new javax.swing.JTable();
        table_AdvTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table_AdvTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Full Name", "Birthday", "Youth Class", "Employment", "SK Voter", "National Voter", "Education Level"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_AdvTable.setRowHeight(35);
        table_AdvTable.setShowGrid(true);
        table_AdvTable.getTableHeader().setResizingAllowed(false);
        table_AdvTable.getTableHeader().setReorderingAllowed(false);
//        scrollpane_MainScroll.setViewportView(table_AdvTable);
        if (table_AdvTable.getColumnModel().getColumnCount() > 0) {
            table_AdvTable.getColumnModel().getColumn(0).setResizable(false);
            table_AdvTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            table_AdvTable.getColumnModel().getColumn(1).setResizable(false);
            table_AdvTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            table_AdvTable.getColumnModel().getColumn(2).setResizable(false);
            table_AdvTable.getColumnModel().getColumn(2).setPreferredWidth(250);
            table_AdvTable.getColumnModel().getColumn(3).setResizable(false);
            table_AdvTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            table_AdvTable.getColumnModel().getColumn(4).setResizable(false);
            table_AdvTable.getColumnModel().getColumn(4).setPreferredWidth(80);
            table_AdvTable.getColumnModel().getColumn(5).setResizable(false);
            table_AdvTable.getColumnModel().getColumn(5).setPreferredWidth(80);
            table_AdvTable.getColumnModel().getColumn(6).setResizable(false);
            table_AdvTable.getColumnModel().getColumn(6).setPreferredWidth(80);
            table_AdvTable.getColumnModel().getColumn(7).setResizable(false);
            table_AdvTable.getColumnModel().getColumn(7).setPreferredWidth(90);
            table_AdvTable.getColumnModel().getColumn(8).setResizable(false);
            table_AdvTable.getColumnModel().getColumn(8).setPreferredWidth(90);
        }
        table_AdvTable.setVisible(true);
    }
    
    private void label_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HomeMouseClicked
    this.dispose();
    new home_page(user);
    }//GEN-LAST:event_label_HomeMouseClicked

    private void label_AddResidentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_AddResidentMouseClicked
    this.dispose();
    new addResident_page(user);
    }//GEN-LAST:event_label_AddResidentMouseClicked

    private void label_AdvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_AdvTableMouseClicked
        if (isBasic) {
            isBasic = false;
            scrollpane_MainScroll.setViewportView(table_AdvTable); 
        }
    }//GEN-LAST:event_label_AdvTableMouseClicked

    private void button_EditResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EditResMouseClicked
    
        if (isBasic) {
            int indexToChange = table_BasicTable.getSelectedRow();
            Object checker = table_BasicTable.getValueAt(indexToChange, 1);

            if (indexToChange < 0) {
                JOptionPane.showMessageDialog(rootPane, "Please select row to edit");
            } else if (checker == null) {
                JOptionPane.showMessageDialog(rootPane, "Please select a valid row to edit");
            } else {
                try {
                    String sqlFetch = "SELECT * FROM `resident` INNER JOIN address ON resident.Address_ID=address.Address_ID INNER JOIN "
                            + "demographic ON resident.Demo_ID=demographic.Demo_ID WHERE res_id=?";
                    Connection conn = user.connect();
                    PreparedStatement ps = conn.prepareStatement(sqlFetch);
                    ps.setString(1, checker.toString());
                    ResultSet rs = ps.executeQuery();

                    this.dispose();
                    new editResident_page(rs, user);
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(rootPane, err);
                }
            }
        } else {
            int indexToChange = table_AdvTable.getSelectedRow();
            Object checker = table_AdvTable.getValueAt(indexToChange, 0);

            if (indexToChange < 0) {
                JOptionPane.showMessageDialog(rootPane, "Please select row to edit");
            } else if (checker == null) {
                JOptionPane.showMessageDialog(rootPane, "Please select a valid row to edit");
            } else {
                try {
                    String sqlFetch = "SELECT * FROM `resident` INNER JOIN address ON resident.Address_ID=address.Address_ID INNER JOIN "
                            + "demographic ON resident.Demo_ID=demographic.Demo_ID WHERE res_id=?";
                    Connection conn = user.connect();
                    PreparedStatement ps = conn.prepareStatement(sqlFetch);
                    ps.setString(1, checker.toString());
                    ResultSet rs = ps.executeQuery();

                    this.dispose();
                    new editResident_page(rs, user);
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(rootPane, err);
                }
            }
        }
    }//GEN-LAST:event_button_EditResMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void button_RemoveResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RemoveResActionPerformed
        ArrayList<String> idsToRemove = new ArrayList<String>();
        ArrayList<Integer> rowToRemove = new ArrayList<Integer>();
        DefaultTableModel tblModel = (DefaultTableModel)table_BasicTable.getModel();
        DefaultTableModel adTblModel = (DefaultTableModel)table_AdvTable.getModel();
        if (isBasic) {
            for (int row = 0; row < tblModel.getRowCount(); row++) {
                if (tblModel.getValueAt(row, 0) == null) {
                    break;
                }
                if ((boolean)tblModel.getValueAt(row, 0)) {
                    System.out.println("remove basic");
                    Object checker =  table_BasicTable.getValueAt(row, 1);
                    
                    if (checker == null) {
                        JOptionPane.showMessageDialog(rootPane, "Please select a valid row to delete");
                        return;
                    }
                    idsToRemove.add((String)checker);
                    rowToRemove.add(row);
                }
            }
        }
        else {
            for (int row = 0; row < adTblModel.getRowCount(); row++) {
                if (adTblModel.getValueAt(row, 0) == null) {
                    break;
                }
                if ((boolean)adTblModel.getValueAt(row, 0)) {
                    System.out.println("remove advanced");
                    Object checker =  table_AdvTable.getValueAt(row, 1);

                    if (checker == null) {
                        JOptionPane.showMessageDialog(rootPane, "Please select a valid row to delete");
                        return;
                    }
                    idsToRemove.add((String)checker);
                    rowToRemove.add(row);
                }
            }  
        }
        
        if (idsToRemove.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please select row to delete");
        }
        else {
            for (int i = 0; i < idsToRemove.size(); i++) {
                try {
                String idToRemove = idsToRemove.get(i);
                String sqlDelete = "DELETE FROM `resident` WHERE Res_ID=?";
                Connection conn = user.connect();
                PreparedStatement ps = conn.prepareStatement(sqlDelete);
                ps.setString(1, idToRemove);
                ps.execute();
                tblModel.removeRow(rowToRemove.get(i));
                adTblModel.removeRow(rowToRemove.get(i));
                
                JOptionPane.showMessageDialog(rootPane, idToRemove + " Successfully deleted");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }
            idsToRemove.clear();
        }
        
    }//GEN-LAST:event_button_RemoveResActionPerformed

    private void textfield_SearchBar43FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_SearchBar43FocusGained
        textfield_SearchBar43.setText("");
    }//GEN-LAST:event_textfield_SearchBar43FocusGained

    private void textfield_SearchBar43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_SearchBar43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_SearchBar43ActionPerformed

    private void button_SearchRes43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SearchRes43ActionPerformed
        try {
            String searchText = textfield_SearchBar43.getText();

            boolean isIdToSearch = false;
            if (searchText.contains("2024")) isIdToSearch = true;

            String sqlFetch = "";  
            Connection conn = user.connect();
            PreparedStatement ps = null;
            
            if (isIdToSearch) {
                sqlFetch = "SELECT * FROM `resident` INNER JOIN address ON resident.Address_ID=address.Address_ID "
                        + "INNER JOIN demographic ON resident.Demo_ID=demographic.Demo_ID WHERE res_id=?";
                ps = conn.prepareStatement(sqlFetch);
                ps.setString(1, searchText);
            }
            else {
                sqlFetch = "SELECT * FROM `resident` INNER JOIN address ON resident.Address_ID=address.Address_ID "
                        + "INNER JOIN demographic ON resident.Demo_ID=demographic.Demo_ID WHERE First_Name=? OR Last_Name=?";
                ps = conn.prepareStatement(sqlFetch);
                ps.setString(1, searchText);
                ps.setString(2, searchText);
            }
            
            ResultSet rs =  ps.executeQuery();
            
            DefaultTableModel tblModel = (DefaultTableModel)table_BasicTable.getModel();
            DefaultTableModel adTblModel = (DefaultTableModel)table_AdvTable.getModel();
            
            int rowCounter = 0;
            for (int i = 0; i <= rows; i++) {
                tblModel.removeRow(i);
                adTblModel.removeRow(i);
            }
            while (rs.next()) {
                String iD = rs.getString("res_id");
                String surname = rs.getString("last_Name");
                String firstName = rs.getString("first_Name");
                String initial = rs.getString("middle_initial");
                String sex = rs.getString("sex");
                String number = rs.getString("contact_num");
                String address = rs.getString("zone") + " " + rs.getString("house_num") + " " + rs.getString("district");

                String birthDate = rs.getString("birthdate");
                String youthClass = rs.getString("Youth_Class");
                String employed = rs.getString("work_stat");
                String skVoter = rs.getString("reg_SKVoter");
                String natVoter = rs.getString("reg_natVoter");
                String educLvl = rs.getString("educ_background");


                Object tblData[] = {false, iD, surname, firstName, initial, sex, number, address};
                Object adtblData[] = {false, iD, surname + ", " + firstName + " " + initial, birthDate, youthClass, employed, skVoter, natVoter, educLvl};
                System.out.println("test");

                tblModel.insertRow(rowCounter, tblData);
                adTblModel.insertRow(rowCounter, adtblData);
                rowCounter++;
            }
            System.out.println("");
            rows = rowCounter;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_button_SearchRes43ActionPerformed

    private void label_BasicTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_BasicTableMouseClicked
        if (!isBasic) {
            isBasic = true;
            scrollpane_MainScroll.setViewportView(table_BasicTable); 
        }
    }//GEN-LAST:event_label_BasicTableMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_EditRes;
    private javax.swing.JButton button_RemoveRes;
    private javax.swing.JButton button_SearchRes43;
    private javax.swing.JLabel label_AddResident;
    private javax.swing.JLabel label_AdvTable;
    private javax.swing.JLabel label_BasicTable;
    private javax.swing.JLabel label_BrgyName;
    private javax.swing.JLabel label_BrgyName1;
    private javax.swing.JLabel label_Home;
    private javax.swing.JLabel label_Insight;
    private javax.swing.JPanel panel_BrgyName;
    private javax.swing.JPanel panel_SearchBar43;
    private javax.swing.JScrollPane scrollpane_MainScroll;
    private javax.swing.JTable table_BasicTable;
    private javax.swing.JTextField textfield_SearchBar43;
    // End of variables declaration//GEN-END:variables
}
