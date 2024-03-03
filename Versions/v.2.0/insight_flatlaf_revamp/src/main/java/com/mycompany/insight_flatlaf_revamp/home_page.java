/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.insight_flatlaf_revamp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Dhan Michea
 */
    public class home_page extends javax.swing.JFrame {
    private final DBManager user;
    
    Font font = new Font("helvetica", Font.PLAIN, 12);
    Map attributes = font.getAttributes();
    Font newFont;
    /**
     * Creates new form home_page
     * @param user
     */
    public home_page(DBManager user) {
        attributes.put(java.awt.font.TextAttribute.STRIKETHROUGH, java.awt.font.TextAttribute.STRIKETHROUGH_ON);
        this.newFont = new Font(attributes);
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

        label_LastUpdated = new javax.swing.JLabel();
        javax.swing.JPanel panel_sidePanel = new javax.swing.JPanel();
        label_Insight = new javax.swing.JLabel();
        label_AdvTable = new javax.swing.JLabel();
        label_Home = new javax.swing.JLabel();
        label_AddResident = new javax.swing.JLabel();
        label_BasicTable = new javax.swing.JLabel();
        panel_BrgyName = new javax.swing.JPanel();
        label_BrgyName = new javax.swing.JLabel();
        panel_DashboardPanel = new javax.swing.JPanel();
        label_QuickSight = new javax.swing.JLabel();
        panel_RegisteredRes = new javax.swing.JPanel();
        label_Registered = new javax.swing.JLabel();
        label_PrevSevDays = new javax.swing.JLabel();
        label_Residents = new javax.swing.JLabel();
        label_NumofRes = new javax.swing.JLabel();
        label_IncreasedResNum = new javax.swing.JLabel();
        panel_TermRemaining = new javax.swing.JPanel();
        label_TermRemaining = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        label_PercentLeft = new javax.swing.JLabel();
        label_Started = new javax.swing.JLabel();
        label_Ending = new javax.swing.JLabel();
        panel_MonthlyDashBoard = new javax.swing.JPanel();
        jScrollPane_monthView = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_Activities = new javax.swing.JPanel();
        radiobutton_Activity_Second = new javax.swing.JRadioButton();
        radiobutton_Activity_First = new javax.swing.JRadioButton();
        radiobutton_Activity_Third = new javax.swing.JRadioButton();
        radiobutton_Activity_Fourth = new javax.swing.JRadioButton();
        label_MonthName = new javax.swing.JLabel();
        label_ActivitiesForMonth = new javax.swing.JLabel();

        label_LastUpdated.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        label_LastUpdated.setForeground(new java.awt.Color(51, 51, 51));
        label_LastUpdated.setText("LAST UPDATED: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

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

        label_Home.setBackground(new java.awt.Color(204, 204, 204));
        label_Home.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Home.setText("Home");

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
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(panel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_AdvTable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_AddResident, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_BasicTable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        panel_sidePanelLayout.setVerticalGroup(
            panel_sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sidePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_Insight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(label_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(label_BasicTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(label_AdvTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_AddResident, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_BrgyName.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        panel_BrgyName.setPreferredSize(new java.awt.Dimension(540, 90));

        label_BrgyName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label_BrgyName.setForeground(new java.awt.Color(51, 51, 51));
        label_BrgyName.setText("Barangay #337, Zone 34, District 2, Manila");

        javax.swing.GroupLayout panel_BrgyNameLayout = new javax.swing.GroupLayout(panel_BrgyName);
        panel_BrgyName.setLayout(panel_BrgyNameLayout);
        panel_BrgyNameLayout.setHorizontalGroup(
            panel_BrgyNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BrgyNameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_BrgyNameLayout.setVerticalGroup(
            panel_BrgyNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BrgyNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_DashboardPanel.setBackground(new java.awt.Color(51, 51, 51));
        panel_DashboardPanel.setMinimumSize(new java.awt.Dimension(810, 310));
        panel_DashboardPanel.setPreferredSize(new java.awt.Dimension(810, 310));

        label_QuickSight.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        label_QuickSight.setText("Quick Sight");

        panel_RegisteredRes.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        panel_RegisteredRes.setMaximumSize(new java.awt.Dimension(400, 180));
        panel_RegisteredRes.setMinimumSize(new java.awt.Dimension(400, 180));
        panel_RegisteredRes.setPreferredSize(new java.awt.Dimension(400, 180));

        label_Registered.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Registered.setForeground(java.awt.SystemColor.text);
        label_Registered.setText("Registered");

        label_PrevSevDays.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_PrevSevDays.setForeground(java.awt.SystemColor.text);
        label_PrevSevDays.setText("vs Previous 30 days ");

        label_Residents.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Residents.setForeground(java.awt.SystemColor.text);
        label_Residents.setText("Residents");

        label_NumofRes.setFont(new java.awt.Font("Arial", 0, 64)); // NOI18N
        label_NumofRes.setForeground(java.awt.SystemColor.text);
        label_NumofRes.setText("00000");

        label_IncreasedResNum.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_IncreasedResNum.setForeground(new java.awt.Color(51, 204, 0));
        label_IncreasedResNum.setText("+XX ");

        javax.swing.GroupLayout panel_RegisteredResLayout = new javax.swing.GroupLayout(panel_RegisteredRes);
        panel_RegisteredRes.setLayout(panel_RegisteredResLayout);
        panel_RegisteredResLayout.setHorizontalGroup(
            panel_RegisteredResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RegisteredResLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_RegisteredResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_Registered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Residents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_RegisteredResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_RegisteredResLayout.createSequentialGroup()
                        .addComponent(label_IncreasedResNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_PrevSevDays)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(label_NumofRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        panel_RegisteredResLayout.setVerticalGroup(
            panel_RegisteredResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegisteredResLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel_RegisteredResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_RegisteredResLayout.createSequentialGroup()
                        .addComponent(label_Registered)
                        .addGap(0, 0, 0)
                        .addComponent(label_Residents, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_NumofRes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panel_RegisteredResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_PrevSevDays, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_IncreasedResNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_TermRemaining.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        panel_TermRemaining.setMaximumSize(new java.awt.Dimension(400, 180));
        panel_TermRemaining.setMinimumSize(new java.awt.Dimension(400, 180));
        panel_TermRemaining.setPreferredSize(new java.awt.Dimension(400, 180));
        panel_TermRemaining.setRequestFocusEnabled(false);

        label_TermRemaining.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_TermRemaining.setForeground(java.awt.SystemColor.text);
        label_TermRemaining.setText("Term Remaining");

        jProgressBar1.setMaximumSize(new java.awt.Dimension(350, 15));
        jProgressBar1.setMinimumSize(new java.awt.Dimension(350, 15));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(350, 15));

        label_PercentLeft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        label_PercentLeft.setForeground(java.awt.SystemColor.text);
        label_PercentLeft.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_PercentLeft.setText("%XX");

        label_Started.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_Started.setForeground(java.awt.SystemColor.text);
        label_Started.setText("Started: YYYY-DD-MM");

        label_Ending.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_Ending.setForeground(java.awt.SystemColor.text);
        label_Ending.setText("Ending: YYYY-DD-MM");

        javax.swing.GroupLayout panel_TermRemainingLayout = new javax.swing.GroupLayout(panel_TermRemaining);
        panel_TermRemaining.setLayout(panel_TermRemainingLayout);
        panel_TermRemainingLayout.setHorizontalGroup(
            panel_TermRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TermRemainingLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_TermRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_TermRemaining)
                    .addComponent(label_Started)
                    .addGroup(panel_TermRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_TermRemainingLayout.createSequentialGroup()
                            .addComponent(label_Ending)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_PercentLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel_TermRemainingLayout.setVerticalGroup(
            panel_TermRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TermRemainingLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label_TermRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Started)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_TermRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TermRemainingLayout.createSequentialGroup()
                        .addComponent(label_Ending)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_PercentLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_MonthlyDashBoard.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        panel_MonthlyDashBoard.setMaximumSize(new java.awt.Dimension(850, 300));
        panel_MonthlyDashBoard.setMinimumSize(new java.awt.Dimension(850, 300));
        panel_MonthlyDashBoard.setPreferredSize(new java.awt.Dimension(850, 300));
        panel_MonthlyDashBoard.setRequestFocusEnabled(false);

        jScrollPane_monthView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setBackground(new java.awt.Color(30, 30, 30));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "02", "03", "04", "05", "06", "07"},
                {"08", "09", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", "31", "", "", "", null}
            },
            new String [] {
                "S", "M", "T", "W", "Th", "F", "St"
            }
        ));
        jTable1.setAlignmentX(10.0F);
        jTable1.setMaximumSize(new java.awt.Dimension(300, 300));
        jTable1.setMinimumSize(new java.awt.Dimension(300, 300));
        jTable1.setPreferredSize(new java.awt.Dimension(230, 230));
        jTable1.setRowHeight(35);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane_monthView.setViewportView(jTable1);

        radiobutton_Activity_Second.setText("DD - Example of activity.");
        radiobutton_Activity_Second.setMaximumSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_Second.setMinimumSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_Second.setName(""); // NOI18N
        radiobutton_Activity_Second.setPreferredSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_Second.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_Activity_SecondActionPerformed(evt);
            }
        });

        radiobutton_Activity_First.setText("DD - Example of activity.");
        radiobutton_Activity_First.setToolTipText("");
        radiobutton_Activity_First.setMaximumSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_First.setMinimumSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_First.setName(""); // NOI18N
        radiobutton_Activity_First.setPreferredSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_Activity_FirstActionPerformed(evt);
            }
        });

        radiobutton_Activity_Third.setText("DD - Example of activity.");
        radiobutton_Activity_Third.setMaximumSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_Third.setMinimumSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_Third.setName(""); // NOI18N
        radiobutton_Activity_Third.setPreferredSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_Third.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_Activity_ThirdActionPerformed(evt);
            }
        });

        radiobutton_Activity_Fourth.setText("DD - Example of activity.");
        radiobutton_Activity_Fourth.setMaximumSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_Fourth.setMinimumSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_Fourth.setName(""); // NOI18N
        radiobutton_Activity_Fourth.setPreferredSize(new java.awt.Dimension(25, 25));
        radiobutton_Activity_Fourth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_Activity_FourthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ActivitiesLayout = new javax.swing.GroupLayout(panel_Activities);
        panel_Activities.setLayout(panel_ActivitiesLayout);
        panel_ActivitiesLayout.setHorizontalGroup(
            panel_ActivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ActivitiesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_ActivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(radiobutton_Activity_Second, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radiobutton_Activity_Fourth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radiobutton_Activity_Third, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radiobutton_Activity_First, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panel_ActivitiesLayout.setVerticalGroup(
            panel_ActivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ActivitiesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(radiobutton_Activity_First, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiobutton_Activity_Second, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiobutton_Activity_Third, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiobutton_Activity_Fourth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        label_MonthName.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_MonthName.setForeground(java.awt.SystemColor.text);
        label_MonthName.setText("*MonthName");

        label_ActivitiesForMonth.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label_ActivitiesForMonth.setForeground(java.awt.SystemColor.text);
        label_ActivitiesForMonth.setText("Activities for *MonthName");

        javax.swing.GroupLayout panel_MonthlyDashBoardLayout = new javax.swing.GroupLayout(panel_MonthlyDashBoard);
        panel_MonthlyDashBoard.setLayout(panel_MonthlyDashBoardLayout);
        panel_MonthlyDashBoardLayout.setHorizontalGroup(
            panel_MonthlyDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MonthlyDashBoardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_MonthlyDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_MonthName, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane_monthView, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_MonthlyDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ActivitiesForMonth)
                    .addComponent(panel_Activities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panel_MonthlyDashBoardLayout.setVerticalGroup(
            panel_MonthlyDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MonthlyDashBoardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_MonthlyDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ActivitiesForMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_MonthName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panel_MonthlyDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Activities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane_monthView, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_DashboardPanelLayout = new javax.swing.GroupLayout(panel_DashboardPanel);
        panel_DashboardPanel.setLayout(panel_DashboardPanelLayout);
        panel_DashboardPanelLayout.setHorizontalGroup(
            panel_DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DashboardPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_QuickSight)
                    .addGroup(panel_DashboardPanelLayout.createSequentialGroup()
                        .addComponent(panel_RegisteredRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_TermRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_MonthlyDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panel_DashboardPanelLayout.setVerticalGroup(
            panel_DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DashboardPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_QuickSight, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_TermRemaining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_RegisteredRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(panel_MonthlyDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panel_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(panel_DashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panel_BrgyName, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(panel_DashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addGap(37, 37, 37))
            .addComponent(panel_sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void myInitComponents() {
        if (user.getClearanceLvl() == 1) 
            label_AddResident.setVisible(false);

        try {
        String sqlResCount = "SELECT count(res_id) AS resCount FROM `resident`";
        Connection conn = user.connect();
        PreparedStatement ps = conn.prepareStatement(sqlResCount);
        ResultSet rs = ps.executeQuery();
        int resCount = 0;
        if (rs.next()) 
            resCount = rs.getInt("resCount");
        
        label_NumofRes.setText(String.valueOf(resCount));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        // for the Remaining term
        label_Started.setText("2023-09-20"); // starting term
        label_Ending.setText("2025-09-20"); // ending term
        LocalDate startDate = LocalDate.parse("2023-09-20"); //parsing the starting term as a LocalDate
        long days = ChronoUnit.DAYS.between(startDate, LocalDate.now()); // num of days
        
        final int maxDays = 730;
        jProgressBar1.setMinimum(0);
        jProgressBar1.setMaximum(maxDays);
        int intDays = (int)days;
        
        jProgressBar1.setValue(intDays); 
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        double percentRemaining = (double)intDays/(double)maxDays;
        
        String percentage = df.format(percentRemaining*100); // Setting the progress bar
        label_PercentLeft.setText(percentage + "%");
        
        // radiobutton initialization
        label_ActivitiesForMonth.setText("Activities for March");
        radiobutton_Activity_First.setText("02 - Meeting the residents");
        radiobutton_Activity_Second.setText("08 - Charity Campaign");
        radiobutton_Activity_Third.setText("17 - Cleaning the house");
        radiobutton_Activity_Fourth.setText("29 - Monthly Meeting");
        
        // the date
        label_MonthName.setText("March");
        String[] sArr = {"02", "08", "17", "29"};
//        DefaultTableModel adTblModel = (DefaultTableModel)jTable1.getModel();
        jTable1.setDefaultRenderer(Object.class, new CellHighlighterRenderer(sArr));
        
    }
    
    private void radiobutton_Activity_SecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_Activity_SecondActionPerformed
        if (radiobutton_Activity_Second.isSelected()) 
            radiobutton_Activity_Second.setFont(newFont);
        else 
            radiobutton_Activity_Second.setFont(font);
    }//GEN-LAST:event_radiobutton_Activity_SecondActionPerformed

    private void radiobutton_Activity_FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_Activity_FirstActionPerformed
        if (radiobutton_Activity_First.isSelected()) 
            radiobutton_Activity_First.setFont(newFont);
        else 
            radiobutton_Activity_First.setFont(font);
    }//GEN-LAST:event_radiobutton_Activity_FirstActionPerformed

    private void radiobutton_Activity_ThirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_Activity_ThirdActionPerformed
        if (radiobutton_Activity_Third.isSelected()) 
            radiobutton_Activity_Third.setFont(newFont);
        else 
            radiobutton_Activity_Third.setFont(font);
    }//GEN-LAST:event_radiobutton_Activity_ThirdActionPerformed

    private void radiobutton_Activity_FourthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_Activity_FourthActionPerformed
        if (radiobutton_Activity_Fourth.isSelected()) 
            radiobutton_Activity_Fourth.setFont(newFont);
        else 
            radiobutton_Activity_Fourth.setFont(font);
    }//GEN-LAST:event_radiobutton_Activity_FourthActionPerformed

    private void label_BasicTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_BasicTableMouseClicked
        this.dispose();
        basicTable_page basicTable_page = new basicTable_page(user); // TODO add your handling code here:
    }//GEN-LAST:event_label_BasicTableMouseClicked

    private void label_AddResidentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_AddResidentMouseClicked
        this.dispose();
        addResident_page addResident_page = new addResident_page(user);         // TODO add your handling code here:
    }//GEN-LAST:event_label_AddResidentMouseClicked

    private void label_AdvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_AdvTableMouseClicked
        this.dispose();
        advTable_page advTable_page = new advTable_page(user);  // TODO add your handling code here:
    }//GEN-LAST:event_label_AdvTableMouseClicked
    
    class CellHighlighterRenderer extends DefaultTableCellRenderer {

    private static final long serialVersionUID = 1L;
    String[] a = new String[4];
    public CellHighlighterRenderer (String[] a) {
        this.a = a;
    }
    
    int[][] rawr = new int[4][2];
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Component c = null;
        int counter = 0;
            for (String s : a) {
                for (int rows = 0; rows < model.getRowCount(); rows++) {
                    for (int columns = 0; columns < model.getRowCount(); columns++) {
                        String cellValue = String.valueOf(model.getValueAt(row, column));
                        for (int[] test : rawr) {
                            if (test[0] == rows && test[1] == columns) {
                                continue;
                            }
                            if (cellValue.equals(s)) {
                                c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, rows, columns);
                                rawr[counter][0] = rows;
                                rawr[counter][1] = columns;
                                
                                counter+=1;
                                
                                if (counter == 4) {
                                    return c;
                                }
                                c.setBackground(Color.pink);
                            }
                            else {
                                c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, rows, columns);
                                c.setBackground(table.getBackground()); 
                            }
                        }
                    }
                }
            }
            return c;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane_monthView;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_ActivitiesForMonth;
    private javax.swing.JLabel label_AddResident;
    private javax.swing.JLabel label_AdvTable;
    private javax.swing.JLabel label_BasicTable;
    private javax.swing.JLabel label_BrgyName;
    private javax.swing.JLabel label_Ending;
    private javax.swing.JLabel label_Home;
    private javax.swing.JLabel label_IncreasedResNum;
    private javax.swing.JLabel label_Insight;
    private javax.swing.JLabel label_LastUpdated;
    private javax.swing.JLabel label_MonthName;
    private javax.swing.JLabel label_NumofRes;
    private javax.swing.JLabel label_PercentLeft;
    private javax.swing.JLabel label_PrevSevDays;
    private javax.swing.JLabel label_QuickSight;
    private javax.swing.JLabel label_Registered;
    private javax.swing.JLabel label_Residents;
    private javax.swing.JLabel label_Started;
    private javax.swing.JLabel label_TermRemaining;
    private javax.swing.JPanel panel_Activities;
    private javax.swing.JPanel panel_BrgyName;
    private javax.swing.JPanel panel_DashboardPanel;
    private javax.swing.JPanel panel_MonthlyDashBoard;
    private javax.swing.JPanel panel_RegisteredRes;
    private javax.swing.JPanel panel_TermRemaining;
    private javax.swing.JRadioButton radiobutton_Activity_First;
    private javax.swing.JRadioButton radiobutton_Activity_Fourth;
    private javax.swing.JRadioButton radiobutton_Activity_Second;
    private javax.swing.JRadioButton radiobutton_Activity_Third;
    // End of variables declaration//GEN-END:variables
}