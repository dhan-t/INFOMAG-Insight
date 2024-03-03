/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.insight_flatlaf_revamp;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Dhan Michea
 */
public class addResident_page extends javax.swing.JFrame {
    private final DBManager user;
    private static ArrayList<newTextField> rah = new ArrayList<newTextField>();
    public static String lastInsertedName = "";
    /**
     * Creates new form home_page
     */
    public addResident_page(DBManager user) {
        this.user = user;
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
        panel_FirstPanel = new javax.swing.JPanel();
        label_BasicDetails = new javax.swing.JLabel();
        label_Surname = new javax.swing.JLabel();
        textfield_Surname = new javax.swing.JTextField();
        label_FirstName = new javax.swing.JLabel();
        textfield_FirstName = new javax.swing.JTextField();
        label_MiddleInitial = new javax.swing.JLabel();
        textfield_MiddleInitial = new javax.swing.JTextField();
        textfield_Suffix = new javax.swing.JTextField();
        label_Suffix = new javax.swing.JLabel();
        label_Sex = new javax.swing.JLabel();
        combobox_Sex = new javax.swing.JComboBox<>();
        label_Birthday = new javax.swing.JLabel();
        textfield_BDAY_YEAR = new javax.swing.JTextField();
        textfield_BDAY_MONTH = new javax.swing.JTextField();
        textfield_BDAY_DAY = new javax.swing.JTextField();
        label_Address = new javax.swing.JLabel();
        label_HouseNumber = new javax.swing.JLabel();
        textfield_HouseNumber = new javax.swing.JTextField();
        textfield_Barangay = new javax.swing.JTextField();
        label_Barangay = new javax.swing.JLabel();
        textfield_Municipality = new javax.swing.JTextField();
        label_Municipality = new javax.swing.JLabel();
        textfield_Region = new javax.swing.JTextField();
        label_Region = new javax.swing.JLabel();
        textfield_District = new javax.swing.JTextField();
        textfield_Province = new javax.swing.JTextField();
        label_Province = new javax.swing.JLabel();
        label_District = new javax.swing.JLabel();
        label_Zone = new javax.swing.JLabel();
        textfield_Zone = new javax.swing.JTextField();
        panel_SecondPanel = new javax.swing.JPanel();
        label_PhoneNum = new javax.swing.JLabel();
        textfield_PhoneNum = new javax.swing.JTextField();
        label_Email = new javax.swing.JLabel();
        textfield_Email = new javax.swing.JTextField();
        label_Demographic = new javax.swing.JLabel();
        label_CivilStats = new javax.swing.JLabel();
        combobox_CivilStat = new javax.swing.JComboBox<>();
        label_YouthClass = new javax.swing.JLabel();
        combobox_YouthClass = new javax.swing.JComboBox<>();
        label_WorkStat = new javax.swing.JLabel();
        combobox_WorkStat = new javax.swing.JComboBox<>();
        label_EducAttain = new javax.swing.JLabel();
        combobox_EducAttain = new javax.swing.JComboBox<>();
        label_SKvoter = new javax.swing.JLabel();
        radiobutton_YES_SKvoter = new javax.swing.JRadioButton();
        radiobutton_NO_SKvoter = new javax.swing.JRadioButton();
        radiobutton_NO_NTNLvoter = new javax.swing.JRadioButton();
        radiobutton_YES_NTNLvoter = new javax.swing.JRadioButton();
        label_NTNLvoter = new javax.swing.JLabel();
        button_RegisterResident = new javax.swing.JButton();
        button_Cancel = new javax.swing.JButton();
        label_ContactInformation = new javax.swing.JLabel();
        panel_RRForm_Container = new javax.swing.JPanel();
        label_Resident = new javax.swing.JLabel();
        label_Registration = new javax.swing.JLabel();
        label_Form = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(90, 90, 90));
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

        label_Home.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Home.setText("Home");
        label_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_HomeMouseClicked(evt);
            }
        });

        label_AddResident.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_AddResident.setText("Add Resident");

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
                .addContainerGap(75, Short.MAX_VALUE)
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

        panel_FirstPanel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        panel_FirstPanel.setMaximumSize(new java.awt.Dimension(340, 670));
        panel_FirstPanel.setMinimumSize(new java.awt.Dimension(340, 670));
        panel_FirstPanel.setPreferredSize(new java.awt.Dimension(340, 670));

        label_BasicDetails.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_BasicDetails.setText("Basic Details");

        label_Surname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Surname.setText("Surname");

        textfield_Surname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Surname.setText(" ");
        textfield_Surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_SurnameActionPerformed(evt);
            }
        });

        label_FirstName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_FirstName.setText("First Name");

        textfield_FirstName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_FirstName.setText(" ");
        textfield_FirstName.setMaximumSize(new java.awt.Dimension(300, 75));
        textfield_FirstName.setMinimumSize(new java.awt.Dimension(300, 75));
        textfield_FirstName.setPreferredSize(new java.awt.Dimension(72, 35));
        textfield_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_FirstNameActionPerformed(evt);
            }
        });

        label_MiddleInitial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_MiddleInitial.setText("Middle Initial");

        textfield_MiddleInitial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_MiddleInitial.setText(" ");
        textfield_MiddleInitial.setMaximumSize(new java.awt.Dimension(70, 35));
        textfield_MiddleInitial.setMinimumSize(new java.awt.Dimension(70, 35));
        textfield_MiddleInitial.setPreferredSize(new java.awt.Dimension(70, 35));
        textfield_MiddleInitial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_MiddleInitialActionPerformed(evt);
            }
        });

        textfield_Suffix.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Suffix.setText(" ");
        textfield_Suffix.setMaximumSize(new java.awt.Dimension(70, 35));
        textfield_Suffix.setMinimumSize(new java.awt.Dimension(70, 35));
        textfield_Suffix.setPreferredSize(new java.awt.Dimension(70, 35));
        textfield_Suffix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_SuffixActionPerformed(evt);
            }
        });

        label_Suffix.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Suffix.setText("Suffix");

        label_Sex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Sex.setText("Sex");

        combobox_Sex.setBackground(new java.awt.Color(40, 40, 40));
        combobox_Sex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combobox_Sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        combobox_Sex.setLightWeightPopupEnabled(false);
        combobox_Sex.setMaximumSize(new java.awt.Dimension(70, 35));
        combobox_Sex.setMinimumSize(new java.awt.Dimension(70, 35));
        combobox_Sex.setPreferredSize(new java.awt.Dimension(70, 35));
        combobox_Sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_SexActionPerformed(evt);
            }
        });

        label_Birthday.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Birthday.setText("Birthday");

        textfield_BDAY_YEAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_BDAY_YEAR.setText("YYYY");
        textfield_BDAY_YEAR.setMaximumSize(new java.awt.Dimension(70, 35));
        textfield_BDAY_YEAR.setMinimumSize(new java.awt.Dimension(70, 35));
        textfield_BDAY_YEAR.setPreferredSize(new java.awt.Dimension(70, 35));
        textfield_BDAY_YEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_BDAY_YEARActionPerformed(evt);
            }
        });

        textfield_BDAY_MONTH.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_BDAY_MONTH.setText("MM");
        textfield_BDAY_MONTH.setMaximumSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_MONTH.setMinimumSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_MONTH.setPreferredSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_MONTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_BDAY_MONTHActionPerformed(evt);
            }
        });

        textfield_BDAY_DAY.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_BDAY_DAY.setText("DD");
        textfield_BDAY_DAY.setMaximumSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_DAY.setMinimumSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_DAY.setPreferredSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_DAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_BDAY_DAYActionPerformed(evt);
            }
        });

        label_Address.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Address.setText("Address");
        label_Address.setMaximumSize(new java.awt.Dimension(300, 300));

        label_HouseNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_HouseNumber.setText("House Number");

        textfield_HouseNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_HouseNumber.setText(" ");
        textfield_HouseNumber.setToolTipText("");
        textfield_HouseNumber.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_HouseNumber.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_HouseNumber.setPreferredSize(new java.awt.Dimension(120, 35));

        textfield_Barangay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Barangay.setText(" ");
        textfield_Barangay.setToolTipText("");
        textfield_Barangay.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Barangay.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Barangay.setPreferredSize(new java.awt.Dimension(120, 35));

        label_Barangay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Barangay.setText("Barangay");

        textfield_Municipality.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Municipality.setText(" ");
        textfield_Municipality.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Municipality.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Municipality.setPreferredSize(new java.awt.Dimension(120, 35));

        label_Municipality.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Municipality.setText("City/Municipality");

        textfield_Region.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Region.setText(" ");
        textfield_Region.setToolTipText("");
        textfield_Region.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Region.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Region.setPreferredSize(new java.awt.Dimension(120, 35));

        label_Region.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Region.setText("Region");

        textfield_District.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_District.setText(" ");
        textfield_District.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_District.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_District.setPreferredSize(new java.awt.Dimension(120, 35));

        textfield_Province.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Province.setText(" ");
        textfield_Province.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Province.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Province.setPreferredSize(new java.awt.Dimension(120, 35));

        label_Province.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Province.setText("Province");
        label_Province.setToolTipText("");

        label_District.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_District.setText("District");

        label_Zone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Zone.setText("Zone");
        label_Zone.setToolTipText("");

        textfield_Zone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Zone.setText(" ");
        textfield_Zone.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Zone.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Zone.setPreferredSize(new java.awt.Dimension(120, 35));

        javax.swing.GroupLayout panel_FirstPanelLayout = new javax.swing.GroupLayout(panel_FirstPanel);
        panel_FirstPanel.setLayout(panel_FirstPanelLayout);
        panel_FirstPanelLayout.setHorizontalGroup(
            panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textfield_Zone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Zone)
                    .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                        .addComponent(textfield_Municipality, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textfield_Region, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                        .addComponent(textfield_BDAY_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_BDAY_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_BDAY_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_Birthday)
                    .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textfield_MiddleInitial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_MiddleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textfield_Suffix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_Suffix, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combobox_Sex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Sex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label_Surname)
                    .addComponent(textfield_Surname)
                    .addComponent(textfield_FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_HouseNumber)
                            .addComponent(textfield_HouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Municipality))
                        .addGap(18, 18, 18)
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Region, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_Barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Barangay)))
                    .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_Province, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Province))
                        .addGap(18, 18, 18)
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_District, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_District, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label_BasicDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_FirstPanelLayout.setVerticalGroup(
            panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_BasicDetails)
                .addGap(18, 18, 18)
                .addComponent(label_Surname)
                .addGap(0, 0, 0)
                .addComponent(textfield_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_FirstName)
                .addGap(0, 0, 0)
                .addComponent(textfield_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                        .addComponent(label_MiddleInitial)
                        .addGap(0, 0, 0)
                        .addComponent(textfield_MiddleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Suffix)
                            .addComponent(label_Sex))
                        .addGap(0, 0, 0)
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_Suffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_Sex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Birthday)
                .addGap(0, 0, 0)
                .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_BDAY_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_BDAY_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_BDAY_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(label_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                        .addComponent(label_HouseNumber)
                        .addGap(0, 0, 0)
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_HouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_Barangay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                                .addComponent(label_Municipality)
                                .addGap(0, 0, 0)
                                .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textfield_Municipality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_Region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label_Region))
                        .addGap(10, 10, 10)
                        .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_FirstPanelLayout.createSequentialGroup()
                                .addComponent(label_Province)
                                .addGap(0, 0, 0)
                                .addGroup(panel_FirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textfield_Province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_District, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label_District))
                        .addGap(10, 10, 10)
                        .addComponent(label_Zone)
                        .addGap(0, 0, 0)
                        .addComponent(textfield_Zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_Barangay))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_SecondPanel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        panel_SecondPanel.setMaximumSize(new java.awt.Dimension(340, 670));
        panel_SecondPanel.setMinimumSize(new java.awt.Dimension(340, 670));
        panel_SecondPanel.setPreferredSize(new java.awt.Dimension(340, 670));

        label_PhoneNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_PhoneNum.setText("Phone Number");

        textfield_PhoneNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_PhoneNum.setText(" ");
        textfield_PhoneNum.setMaximumSize(new java.awt.Dimension(300, 35));
        textfield_PhoneNum.setMinimumSize(new java.awt.Dimension(300, 35));
        textfield_PhoneNum.setPreferredSize(new java.awt.Dimension(300, 35));
        textfield_PhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_PhoneNumActionPerformed(evt);
            }
        });

        label_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Email.setText("Email");

        textfield_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Email.setText(" ");
        textfield_Email.setMaximumSize(new java.awt.Dimension(300, 35));
        textfield_Email.setMinimumSize(new java.awt.Dimension(300, 35));
        textfield_Email.setPreferredSize(new java.awt.Dimension(300, 35));
        textfield_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_EmailActionPerformed(evt);
            }
        });

        label_Demographic.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Demographic.setText("Demographic");

        label_CivilStats.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_CivilStats.setText("Civil Status");

        combobox_CivilStat.setBackground(new java.awt.Color(40, 40, 40));
        combobox_CivilStat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combobox_CivilStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "Divorced" }));
        combobox_CivilStat.setMaximumSize(new java.awt.Dimension(300, 35));
        combobox_CivilStat.setMinimumSize(new java.awt.Dimension(300, 35));
        combobox_CivilStat.setPreferredSize(new java.awt.Dimension(300, 35));

        label_YouthClass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_YouthClass.setText("Youth Class");

        combobox_YouthClass.setBackground(new java.awt.Color(40, 40, 40));
        combobox_YouthClass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combobox_YouthClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Child Youth", "Youth Core", "Young Adult" }));
        combobox_YouthClass.setMaximumSize(new java.awt.Dimension(300, 35));
        combobox_YouthClass.setMinimumSize(new java.awt.Dimension(300, 35));
        combobox_YouthClass.setPreferredSize(new java.awt.Dimension(300, 35));

        label_WorkStat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_WorkStat.setText("Work Status");

        combobox_WorkStat.setBackground(new java.awt.Color(40, 40, 40));
        combobox_WorkStat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combobox_WorkStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employed", "Self-Employed", "Unemployed" }));
        combobox_WorkStat.setMaximumSize(new java.awt.Dimension(300, 35));
        combobox_WorkStat.setMinimumSize(new java.awt.Dimension(300, 35));
        combobox_WorkStat.setPreferredSize(new java.awt.Dimension(300, 35));

        label_EducAttain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_EducAttain.setText("Highest Educational Attainment");
        label_EducAttain.setToolTipText("");

        combobox_EducAttain.setBackground(new java.awt.Color(40, 40, 40));
        combobox_EducAttain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combobox_EducAttain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elementary", "High-School", "Senior High-School", "College" }));
        combobox_EducAttain.setMaximumSize(new java.awt.Dimension(300, 35));
        combobox_EducAttain.setMinimumSize(new java.awt.Dimension(300, 35));
        combobox_EducAttain.setPreferredSize(new java.awt.Dimension(300, 35));

        label_SKvoter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_SKvoter.setText("Registered SK Voter");
        label_SKvoter.setToolTipText("");

        radiobutton_YES_SKvoter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        radiobutton_YES_SKvoter.setText("Yes");
        radiobutton_YES_SKvoter.setPreferredSize(new java.awt.Dimension(45, 35));

        radiobutton_NO_SKvoter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        radiobutton_NO_SKvoter.setText("No");
        radiobutton_NO_SKvoter.setPreferredSize(new java.awt.Dimension(45, 35));
        radiobutton_NO_SKvoter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_NO_SKvoterActionPerformed(evt);
            }
        });

        radiobutton_NO_NTNLvoter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        radiobutton_NO_NTNLvoter.setText("No");
        radiobutton_NO_NTNLvoter.setPreferredSize(new java.awt.Dimension(45, 35));

        radiobutton_YES_NTNLvoter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        radiobutton_YES_NTNLvoter.setText("Yes");
        radiobutton_YES_NTNLvoter.setPreferredSize(new java.awt.Dimension(45, 35));

        label_NTNLvoter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_NTNLvoter.setText("Registered National Voter");
        label_NTNLvoter.setToolTipText("");

        button_RegisterResident.setBackground(javax.swing.UIManager.getDefaults().getColor("Objects.Green"));
        button_RegisterResident.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_RegisterResident.setText("Register Resident");
        button_RegisterResident.setMaximumSize(new java.awt.Dimension(300, 35));
        button_RegisterResident.setMinimumSize(new java.awt.Dimension(300, 35));
        button_RegisterResident.setPreferredSize(new java.awt.Dimension(300, 35));
        button_RegisterResident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RegisterResidentActionPerformed(evt);
            }
        });

        button_Cancel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_Cancel.setText("Cancel");
        button_Cancel.setToolTipText("");
        button_Cancel.setMaximumSize(new java.awt.Dimension(300, 35));
        button_Cancel.setMinimumSize(new java.awt.Dimension(300, 35));
        button_Cancel.setPreferredSize(new java.awt.Dimension(300, 35));
        button_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelActionPerformed(evt);
            }
        });

        label_ContactInformation.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_ContactInformation.setText("Contact Information");

        javax.swing.GroupLayout panel_SecondPanelLayout = new javax.swing.GroupLayout(panel_SecondPanel);
        panel_SecondPanel.setLayout(panel_SecondPanelLayout);
        panel_SecondPanelLayout.setHorizontalGroup(
            panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ContactInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                        .addGroup(panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_PhoneNum)
                            .addComponent(textfield_PhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                        .addGroup(panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_RegisterResident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                                .addComponent(radiobutton_YES_NTNLvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radiobutton_NO_NTNLvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_NTNLvoter, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                                .addComponent(radiobutton_YES_SKvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radiobutton_NO_SKvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_SKvoter, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_EducAttain, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_EducAttain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_WorkStat, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_WorkStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_YouthClass, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_YouthClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_Email)
                                .addComponent(textfield_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_Demographic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_CivilStats, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combobox_CivilStat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel_SecondPanelLayout.setVerticalGroup(
            panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(label_ContactInformation)
                .addGap(10, 10, 10)
                .addComponent(label_PhoneNum)
                .addGap(0, 0, 0)
                .addComponent(textfield_PhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_Email)
                .addGap(0, 0, 0)
                .addComponent(textfield_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(label_Demographic)
                .addGap(10, 10, 10)
                .addComponent(label_CivilStats)
                .addGap(0, 0, 0)
                .addComponent(combobox_CivilStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_YouthClass)
                .addGap(0, 0, 0)
                .addComponent(combobox_YouthClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_WorkStat)
                .addGap(0, 0, 0)
                .addComponent(combobox_WorkStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_EducAttain)
                .addGap(0, 0, 0)
                .addComponent(combobox_EducAttain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_SKvoter)
                .addGap(0, 0, 0)
                .addGroup(panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobutton_YES_SKvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiobutton_NO_SKvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(label_NTNLvoter)
                .addGap(0, 0, 0)
                .addGroup(panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobutton_YES_NTNLvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiobutton_NO_NTNLvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_RegisterResident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panel_RRForm_Container.setInheritsPopupMenu(true);

        label_Resident.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Resident.setText("Resident");

        label_Registration.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Registration.setText("Registration");

        label_Form.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Form.setText("Form");

        javax.swing.GroupLayout panel_RRForm_ContainerLayout = new javax.swing.GroupLayout(panel_RRForm_Container);
        panel_RRForm_Container.setLayout(panel_RRForm_ContainerLayout);
        panel_RRForm_ContainerLayout.setHorizontalGroup(
            panel_RRForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RRForm_ContainerLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panel_RRForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Registration)
                    .addComponent(label_Resident)
                    .addComponent(label_Form))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_RRForm_ContainerLayout.setVerticalGroup(
            panel_RRForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RRForm_ContainerLayout.createSequentialGroup()
                .addComponent(label_Resident)
                .addGap(0, 0, 0)
                .addComponent(label_Registration)
                .addGap(0, 0, 0)
                .addComponent(label_Form)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_FirstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_SecondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(panel_RRForm_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_RRForm_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_FirstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addComponent(panel_SecondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HomeMouseClicked

    }//GEN-LAST:event_label_HomeMouseClicked

    private void textfield_SurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_SurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_SurnameActionPerformed

    private void textfield_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_FirstNameActionPerformed

    private void textfield_MiddleInitialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_MiddleInitialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_MiddleInitialActionPerformed

    private void textfield_SuffixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_SuffixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_SuffixActionPerformed

    private void combobox_SexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_SexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_SexActionPerformed

    private void textfield_BDAY_YEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_BDAY_YEARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_BDAY_YEARActionPerformed

    private void textfield_BDAY_MONTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_BDAY_MONTHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_BDAY_MONTHActionPerformed

    private void textfield_BDAY_DAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_BDAY_DAYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_BDAY_DAYActionPerformed

    private void textfield_PhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_PhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_PhoneNumActionPerformed

    private void textfield_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_EmailActionPerformed

    private void button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_CancelActionPerformed

    private void radiobutton_NO_SKvoterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_NO_SKvoterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobutton_NO_SKvoterActionPerformed

    private void label_BasicTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_BasicTableMouseClicked
    this.dispose();
      basicTable_page basicTable_page = new basicTable_page(user);// TODO add your handling code here:
    }//GEN-LAST:event_label_BasicTableMouseClicked

    private void label_AdvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_AdvTableMouseClicked
    this.dispose();
      advTable_page advTable_page = new advTable_page(user);     // TODO add your handling code here:
    }//GEN-LAST:event_label_AdvTableMouseClicked

    private void button_RegisterResidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RegisterResidentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_RegisterResidentActionPerformed
    
    
    public static int ageCalculator(String year, String month, String day) {
        LocalDate dob = LocalDate.parse(year + "-" + month + "-" + day);
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public static String checkIfMissing(newTextField textfield) {
            if (textfield.getText().equals("")) {
                rah.add(textfield);
                return null;
            }
            else {
                return textfield.getText().trim();
            }
    }

    class MyIntFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string,
            javax.swing.text.AttributeSet attr) throws BadLocationException {

            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.insert(offset, string);

            if (test(sb.toString())) {
                super.insertString(fb, offset, string, attr);
            } else {
                JOptionPane.showMessageDialog(rootPane, "error1");
            }
        }

        private boolean test(String text) {
            try {
                Integer.parseInt(text);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text,
            javax.swing.text.AttributeSet attrs) throws BadLocationException {

            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.replace(offset, offset + length, text);

            if (test(sb.toString())) {
                    super.replace(fb, offset, length, text, attrs);
            } else {
                    JOptionPane.showMessageDialog(rootPane, "ERROR 2");
            }

            }

//		@Override
//		public void remove(FilterBypass fb, int offset, int length)
//				throws BadLocationException {
//			Document doc = fb.getDocument();
//			StringBuilder sb = new StringBuilder();
//			sb.append(doc.getText(0, doc.getLength()));
//			sb.delete(offset, offset + length);
//
//			if (test(sb.toString())) {
//				super.remove(fb, offset, length);
//			} else {
//				JOptionPane.showMessageDialog(frame, "ERROR3");
//			}
//
//		}
    }

    public static String demoIdPicker(JComboBox comboBox) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (comboBox.getSelectedIndex() == i) return String.valueOf(i);
        }
        return null;
    }

    @SuppressWarnings("serial")
    public class newTextField extends JTextField {
            public String tfName;

            public newTextField(String tfName) {
                    this.tfName = tfName;
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cancel;
    private javax.swing.JButton button_RegisterResident;
    private javax.swing.JComboBox<String> combobox_CivilStat;
    private javax.swing.JComboBox<String> combobox_EducAttain;
    private javax.swing.JComboBox<String> combobox_Sex;
    private javax.swing.JComboBox<String> combobox_WorkStat;
    private javax.swing.JComboBox<String> combobox_YouthClass;
    private javax.swing.JLabel label_AddResident;
    private javax.swing.JLabel label_Address;
    private javax.swing.JLabel label_AdvTable;
    private javax.swing.JLabel label_Barangay;
    private javax.swing.JLabel label_BasicDetails;
    private javax.swing.JLabel label_BasicTable;
    private javax.swing.JLabel label_Birthday;
    private javax.swing.JLabel label_CivilStats;
    private javax.swing.JLabel label_ContactInformation;
    private javax.swing.JLabel label_Demographic;
    private javax.swing.JLabel label_District;
    private javax.swing.JLabel label_EducAttain;
    private javax.swing.JLabel label_Email;
    private javax.swing.JLabel label_FirstName;
    private javax.swing.JLabel label_Form;
    private javax.swing.JLabel label_Home;
    private javax.swing.JLabel label_HouseNumber;
    private javax.swing.JLabel label_Insight;
    private javax.swing.JLabel label_MiddleInitial;
    private javax.swing.JLabel label_Municipality;
    private javax.swing.JLabel label_NTNLvoter;
    private javax.swing.JLabel label_PhoneNum;
    private javax.swing.JLabel label_Province;
    private javax.swing.JLabel label_Region;
    private javax.swing.JLabel label_Registration;
    private javax.swing.JLabel label_Resident;
    private javax.swing.JLabel label_SKvoter;
    private javax.swing.JLabel label_Sex;
    private javax.swing.JLabel label_Suffix;
    private javax.swing.JLabel label_Surname;
    private javax.swing.JLabel label_WorkStat;
    private javax.swing.JLabel label_YouthClass;
    private javax.swing.JLabel label_Zone;
    private javax.swing.JPanel panel_FirstPanel;
    private javax.swing.JPanel panel_RRForm_Container;
    private javax.swing.JPanel panel_SecondPanel;
    private javax.swing.JRadioButton radiobutton_NO_NTNLvoter;
    private javax.swing.JRadioButton radiobutton_NO_SKvoter;
    private javax.swing.JRadioButton radiobutton_YES_NTNLvoter;
    private javax.swing.JRadioButton radiobutton_YES_SKvoter;
    private javax.swing.JTextField textfield_BDAY_DAY;
    private javax.swing.JTextField textfield_BDAY_MONTH;
    private javax.swing.JTextField textfield_BDAY_YEAR;
    private javax.swing.JTextField textfield_Barangay;
    private javax.swing.JTextField textfield_District;
    private javax.swing.JTextField textfield_Email;
    private javax.swing.JTextField textfield_FirstName;
    private javax.swing.JTextField textfield_HouseNumber;
    private javax.swing.JTextField textfield_MiddleInitial;
    private javax.swing.JTextField textfield_Municipality;
    private javax.swing.JTextField textfield_PhoneNum;
    private javax.swing.JTextField textfield_Province;
    private javax.swing.JTextField textfield_Region;
    private javax.swing.JTextField textfield_Suffix;
    private javax.swing.JTextField textfield_Surname;
    private javax.swing.JTextField textfield_Zone;
    // End of variables declaration//GEN-END:variables
}
