/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.insight_flatlaf_revamp;

import static com.mycompany.insight_flatlaf_revamp.addResident_page.ageCalculator;
import static com.mycompany.insight_flatlaf_revamp.addResident_page.checkIfMissing;
import static com.mycompany.insight_flatlaf_revamp.addResident_page.demoIdPicker;
import static com.mycompany.insight_flatlaf_revamp.addResident_page.lastInsertedName;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
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
public class editResident_page extends javax.swing.JFrame {
    private final DBManager user;
    private final ResultSet resToEdit;
    private static boolean fieldIsMissing = false;
    private ButtonGroup skGroup = new ButtonGroup();
    private ButtonGroup natGroup = new ButtonGroup();
    private static String addressId;
    private static String demoID;
    private static boolean didDemoChange = false;
    private static boolean didAddressChange = false;
    private static String iD = "";
    
    /**
     * Creates new form home_page
     */
    public editResident_page(ResultSet resToEdit, DBManager user) {
        this.user = user;
        this.resToEdit = resToEdit;
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
        button_EditInfo = new javax.swing.JButton();
        button_Cancel = new javax.swing.JButton();
        label_ContactInformation = new javax.swing.JLabel();
        panel_RRForm_Container = new javax.swing.JPanel();
        label_Edit = new javax.swing.JLabel();
        label_Resident = new javax.swing.JLabel();
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
                .addComponent(label_BasicTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_AdvTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_AddResident, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 365, Short.MAX_VALUE))
        );

        panel_FirstPanel.setBackground(new java.awt.Color(51, 51, 51));
        panel_FirstPanel.setMaximumSize(new java.awt.Dimension(340, 670));
        panel_FirstPanel.setMinimumSize(new java.awt.Dimension(340, 670));
        panel_FirstPanel.setPreferredSize(new java.awt.Dimension(340, 670));

        label_BasicDetails.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_BasicDetails.setText("Basic Details");

        label_Surname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Surname.setText("Surname");

        textfield_Surname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Surname.setText(" ");
        textfield_Surname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_Surname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_SurnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_SurnameFocusLost(evt);
            }
        });

        label_FirstName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_FirstName.setText("First Name");

        textfield_FirstName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_FirstName.setText(" ");
        textfield_FirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_FirstName.setMaximumSize(new java.awt.Dimension(300, 75));
        textfield_FirstName.setMinimumSize(new java.awt.Dimension(300, 75));
        textfield_FirstName.setPreferredSize(new java.awt.Dimension(72, 35));
        textfield_FirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_FirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_FirstNameFocusLost(evt);
            }
        });

        label_MiddleInitial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_MiddleInitial.setText("Middle Initial");

        textfield_MiddleInitial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_MiddleInitial.setText(" ");
        textfield_MiddleInitial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_MiddleInitial.setMaximumSize(new java.awt.Dimension(70, 35));
        textfield_MiddleInitial.setMinimumSize(new java.awt.Dimension(70, 35));
        textfield_MiddleInitial.setPreferredSize(new java.awt.Dimension(70, 35));
        textfield_MiddleInitial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_MiddleInitialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_MiddleInitialFocusLost(evt);
            }
        });

        textfield_Suffix.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Suffix.setText(" ");
        textfield_Suffix.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_Suffix.setMaximumSize(new java.awt.Dimension(70, 35));
        textfield_Suffix.setMinimumSize(new java.awt.Dimension(70, 35));
        textfield_Suffix.setPreferredSize(new java.awt.Dimension(70, 35));
        textfield_Suffix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_SuffixFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_SuffixFocusLost(evt);
            }
        });

        label_Suffix.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Suffix.setText("Suffix");

        label_Sex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Sex.setText("Sex");

        combobox_Sex.setBackground(new java.awt.Color(40, 40, 40));
        combobox_Sex.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        combobox_Sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        combobox_Sex.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        combobox_Sex.setLightWeightPopupEnabled(false);
        combobox_Sex.setMaximumSize(new java.awt.Dimension(70, 35));
        combobox_Sex.setMinimumSize(new java.awt.Dimension(70, 35));
        combobox_Sex.setPreferredSize(new java.awt.Dimension(70, 35));
        combobox_Sex.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combobox_SexFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combobox_SexFocusLost(evt);
            }
        });

        label_Birthday.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Birthday.setText("Birthday");

        textfield_BDAY_YEAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_BDAY_YEAR.setText(" ");
        textfield_BDAY_YEAR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_BDAY_YEAR.setMaximumSize(new java.awt.Dimension(70, 35));
        textfield_BDAY_YEAR.setMinimumSize(new java.awt.Dimension(70, 35));
        textfield_BDAY_YEAR.setPreferredSize(new java.awt.Dimension(70, 35));
        textfield_BDAY_YEAR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_BDAY_YEARFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_BDAY_YEARFocusLost(evt);
            }
        });

        textfield_BDAY_MONTH.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_BDAY_MONTH.setText(" ");
        textfield_BDAY_MONTH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_BDAY_MONTH.setMaximumSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_MONTH.setMinimumSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_MONTH.setPreferredSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_MONTH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_BDAY_MONTHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_BDAY_MONTHFocusLost(evt);
            }
        });

        textfield_BDAY_DAY.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_BDAY_DAY.setText(" ");
        textfield_BDAY_DAY.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_BDAY_DAY.setMaximumSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_DAY.setMinimumSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_DAY.setPreferredSize(new java.awt.Dimension(50, 35));
        textfield_BDAY_DAY.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_BDAY_DAYFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_BDAY_DAYFocusLost(evt);
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
        textfield_HouseNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_HouseNumber.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_HouseNumber.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_HouseNumber.setPreferredSize(new java.awt.Dimension(120, 35));
        textfield_HouseNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_HouseNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_HouseNumberFocusLost(evt);
            }
        });

        textfield_Barangay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Barangay.setText("337");
        textfield_Barangay.setToolTipText("");
        textfield_Barangay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_Barangay.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Barangay.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Barangay.setPreferredSize(new java.awt.Dimension(120, 35));
        textfield_Barangay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_BarangayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_BarangayFocusLost(evt);
            }
        });

        label_Barangay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Barangay.setText("Barangay");

        textfield_Municipality.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Municipality.setText("City Of Manila");
        textfield_Municipality.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_Municipality.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Municipality.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Municipality.setPreferredSize(new java.awt.Dimension(120, 35));
        textfield_Municipality.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_MunicipalityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_MunicipalityFocusLost(evt);
            }
        });

        label_Municipality.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Municipality.setText("City/Municipality");

        textfield_Region.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Region.setText("National Capital Region");
        textfield_Region.setToolTipText("");
        textfield_Region.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_Region.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Region.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Region.setPreferredSize(new java.awt.Dimension(120, 35));
        textfield_Region.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_RegionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_RegionFocusLost(evt);
            }
        });

        label_Region.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Region.setText("Region");

        textfield_District.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_District.setText("3");
        textfield_District.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_District.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_District.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_District.setPreferredSize(new java.awt.Dimension(120, 35));
        textfield_District.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_DistrictFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_DistrictFocusLost(evt);
            }
        });

        textfield_Province.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Province.setText("Metro Manila");
        textfield_Province.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_Province.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Province.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Province.setPreferredSize(new java.awt.Dimension(120, 35));
        textfield_Province.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_ProvinceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_ProvinceFocusLost(evt);
            }
        });

        label_Province.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Province.setText("Province");
        label_Province.setToolTipText("");

        label_District.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_District.setText("District");

        label_Zone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Zone.setText("Zone");
        label_Zone.setToolTipText("");

        textfield_Zone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Zone.setText("34");
        textfield_Zone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_Zone.setMaximumSize(new java.awt.Dimension(120, 35));
        textfield_Zone.setMinimumSize(new java.awt.Dimension(120, 35));
        textfield_Zone.setPreferredSize(new java.awt.Dimension(120, 35));
        textfield_Zone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_ZoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_ZoneFocusLost(evt);
            }
        });

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

        panel_SecondPanel.setBackground(new java.awt.Color(51, 51, 51));
        panel_SecondPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_SecondPanel.setMaximumSize(new java.awt.Dimension(340, 670));
        panel_SecondPanel.setMinimumSize(new java.awt.Dimension(340, 670));
        panel_SecondPanel.setPreferredSize(new java.awt.Dimension(340, 670));
        panel_SecondPanel.setRequestFocusEnabled(false);

        label_PhoneNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_PhoneNum.setText("Phone Number");

        textfield_PhoneNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_PhoneNum.setText(" ");
        textfield_PhoneNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_PhoneNum.setMaximumSize(new java.awt.Dimension(300, 35));
        textfield_PhoneNum.setMinimumSize(new java.awt.Dimension(300, 35));
        textfield_PhoneNum.setPreferredSize(new java.awt.Dimension(300, 35));
        textfield_PhoneNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_PhoneNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_PhoneNumFocusLost(evt);
            }
        });

        label_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_Email.setText("Email");

        textfield_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textfield_Email.setText(" ");
        textfield_Email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        textfield_Email.setMaximumSize(new java.awt.Dimension(300, 35));
        textfield_Email.setMinimumSize(new java.awt.Dimension(300, 35));
        textfield_Email.setPreferredSize(new java.awt.Dimension(300, 35));
        textfield_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_EmailFocusLost(evt);
            }
        });

        label_Demographic.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Demographic.setText("Demographic");

        label_CivilStats.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_CivilStats.setText("Civil Status");

        combobox_CivilStat.setBackground(new java.awt.Color(40, 40, 40));
        combobox_CivilStat.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        combobox_CivilStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "Divorced", "Separated" }));
        combobox_CivilStat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        combobox_CivilStat.setMaximumSize(new java.awt.Dimension(300, 35));
        combobox_CivilStat.setMinimumSize(new java.awt.Dimension(300, 35));
        combobox_CivilStat.setPreferredSize(new java.awt.Dimension(300, 35));
        combobox_CivilStat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combobox_CivilStatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combobox_CivilStatFocusLost(evt);
            }
        });

        label_YouthClass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_YouthClass.setText("Youth Class");

        combobox_YouthClass.setBackground(new java.awt.Color(40, 40, 40));
        combobox_YouthClass.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        combobox_YouthClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Child Youth", "Youth Core", "Young Adult" }));
        combobox_YouthClass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        combobox_YouthClass.setMaximumSize(new java.awt.Dimension(300, 35));
        combobox_YouthClass.setMinimumSize(new java.awt.Dimension(300, 35));
        combobox_YouthClass.setPreferredSize(new java.awt.Dimension(300, 35));
        combobox_YouthClass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combobox_YouthClassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combobox_YouthClassFocusLost(evt);
            }
        });

        label_WorkStat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_WorkStat.setText("Work Status");

        combobox_WorkStat.setBackground(new java.awt.Color(40, 40, 40));
        combobox_WorkStat.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        combobox_WorkStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employed", "Sel-Employed", "Unemployed" }));
        combobox_WorkStat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        combobox_WorkStat.setMaximumSize(new java.awt.Dimension(300, 35));
        combobox_WorkStat.setMinimumSize(new java.awt.Dimension(300, 35));
        combobox_WorkStat.setPreferredSize(new java.awt.Dimension(300, 35));
        combobox_WorkStat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combobox_WorkStatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combobox_WorkStatFocusLost(evt);
            }
        });

        label_EducAttain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_EducAttain.setText("Highest Educational Attainment");
        label_EducAttain.setToolTipText("");

        combobox_EducAttain.setBackground(new java.awt.Color(40, 40, 40));
        combobox_EducAttain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elementary", "High-School", "Senior High-School", "College", " " }));
        combobox_EducAttain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 30, 30), 1, true));
        combobox_EducAttain.setMaximumSize(new java.awt.Dimension(300, 35));
        combobox_EducAttain.setMinimumSize(new java.awt.Dimension(300, 35));
        combobox_EducAttain.setPreferredSize(new java.awt.Dimension(300, 35));
        combobox_EducAttain.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combobox_EducAttainFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combobox_EducAttainFocusLost(evt);
            }
        });

        label_SKvoter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_SKvoter.setText("Registered SK Voter");
        label_SKvoter.setToolTipText("");

        radiobutton_YES_SKvoter.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        radiobutton_YES_SKvoter.setText("Yes");
        radiobutton_YES_SKvoter.setBorder(null);
        radiobutton_YES_SKvoter.setFocusPainted(false);
        radiobutton_YES_SKvoter.setPreferredSize(new java.awt.Dimension(45, 35));
        radiobutton_YES_SKvoter.setRolloverEnabled(false);
        radiobutton_YES_SKvoter.setVerifyInputWhenFocusTarget(false);
        radiobutton_YES_SKvoter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radiobutton_YES_SKvoterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                radiobutton_YES_SKvoterFocusLost(evt);
            }
        });

        radiobutton_NO_SKvoter.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        radiobutton_NO_SKvoter.setText("No");
        radiobutton_NO_SKvoter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        radiobutton_NO_SKvoter.setContentAreaFilled(false);
        radiobutton_NO_SKvoter.setFocusPainted(false);
        radiobutton_NO_SKvoter.setFocusTraversalPolicyProvider(true);
        radiobutton_NO_SKvoter.setPreferredSize(new java.awt.Dimension(45, 35));
        radiobutton_NO_SKvoter.setRolloverEnabled(false);
        radiobutton_NO_SKvoter.setVerifyInputWhenFocusTarget(false);
        radiobutton_NO_SKvoter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radiobutton_NO_SKvoterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                radiobutton_NO_SKvoterFocusLost(evt);
            }
        });

        radiobutton_NO_NTNLvoter.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        radiobutton_NO_NTNLvoter.setText("No");
        radiobutton_NO_NTNLvoter.setBorder(null);
        radiobutton_NO_NTNLvoter.setFocusPainted(false);
        radiobutton_NO_NTNLvoter.setFocusTraversalPolicyProvider(true);
        radiobutton_NO_NTNLvoter.setPreferredSize(new java.awt.Dimension(45, 35));
        radiobutton_NO_NTNLvoter.setRolloverEnabled(false);
        radiobutton_NO_NTNLvoter.setVerifyInputWhenFocusTarget(false);

        radiobutton_YES_NTNLvoter.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        radiobutton_YES_NTNLvoter.setText("Yes");
        radiobutton_YES_NTNLvoter.setBorder(null);
        radiobutton_YES_NTNLvoter.setContentAreaFilled(false);
        radiobutton_YES_NTNLvoter.setFocusPainted(false);
        radiobutton_YES_NTNLvoter.setPreferredSize(new java.awt.Dimension(45, 35));
        radiobutton_YES_NTNLvoter.setRolloverEnabled(false);
        radiobutton_YES_NTNLvoter.setVerifyInputWhenFocusTarget(false);

        label_NTNLvoter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_NTNLvoter.setText("Registered National Voter");
        label_NTNLvoter.setToolTipText("");

        button_EditInfo.setBackground(javax.swing.UIManager.getDefaults().getColor("Objects.Green"));
        button_EditInfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_EditInfo.setText("Confirm Edit");
        button_EditInfo.setMaximumSize(new java.awt.Dimension(300, 35));
        button_EditInfo.setMinimumSize(new java.awt.Dimension(300, 35));
        button_EditInfo.setPreferredSize(new java.awt.Dimension(300, 35));
        button_EditInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EditInfoActionPerformed(evt);
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
                        .addContainerGap())
                    .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                        .addGroup(panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_EditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                                .addComponent(radiobutton_YES_NTNLvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radiobutton_NO_NTNLvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_NTNLvoter, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                        .addGroup(panel_SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_SecondPanelLayout.createSequentialGroup()
                                .addComponent(radiobutton_YES_SKvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radiobutton_NO_SKvoter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_SKvoter, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(121, Short.MAX_VALUE))))
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
                .addComponent(button_EditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panel_RRForm_Container.setInheritsPopupMenu(true);

        label_Edit.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Edit.setText("Edit");

        label_Resident.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Resident.setText("Resident");

        label_Form.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        label_Form.setText("Information");

        javax.swing.GroupLayout panel_RRForm_ContainerLayout = new javax.swing.GroupLayout(panel_RRForm_Container);
        panel_RRForm_Container.setLayout(panel_RRForm_ContainerLayout);
        panel_RRForm_ContainerLayout.setHorizontalGroup(
            panel_RRForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RRForm_ContainerLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panel_RRForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Resident)
                    .addComponent(label_Edit)
                    .addComponent(label_Form))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_RRForm_ContainerLayout.setVerticalGroup(
            panel_RRForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RRForm_ContainerLayout.createSequentialGroup()
                .addComponent(label_Edit)
                .addGap(0, 0, 0)
                .addComponent(label_Resident)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_RRForm_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177))
                            .addComponent(panel_FirstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                            .addComponent(panel_SecondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void myInitComponents() {
        skGroup.add(radiobutton_YES_SKvoter);
        skGroup.add(radiobutton_NO_SKvoter);
        natGroup.add(radiobutton_YES_NTNLvoter);
        natGroup.add(radiobutton_NO_NTNLvoter);
        
        try {
            if (resToEdit.next()) {
                iD = resToEdit.getString("res_id");
                addressId = resToEdit.getString("address_id");
                demoID = resToEdit.getString("demo_id");
                String[] birthdate = resToEdit.getString("birthdate").split("-");
                
                textfield_Surname.setText(resToEdit.getString("last_Name"));
                textfield_FirstName.setText(resToEdit.getString("first_Name"));
                textfield_MiddleInitial.setText(resToEdit.getString("middle_initial"));
                combobox_Sex.setSelectedItem(resToEdit.getString("sex"));
                textfield_PhoneNum.setText(resToEdit.getString("contact_num"));
                textfield_BDAY_DAY.setText(birthdate[2]);
                textfield_BDAY_MONTH.setText(birthdate[1]);
                textfield_BDAY_YEAR.setText(birthdate[0]);
                textfield_HouseNumber.setText(resToEdit.getString("house_num"));
                textfield_Email.setText(resToEdit.getString("email"));
                
                combobox_CivilStat.setSelectedItem(resToEdit.getString("civil_stat"));
                combobox_EducAttain.setSelectedItem(resToEdit.getString("educ_background"));
                combobox_WorkStat.setSelectedItem(resToEdit.getString("work_stat"));
                combobox_YouthClass.setSelectedItem(resToEdit.getString("Youth_Class"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void label_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HomeMouseClicked

    }//GEN-LAST:event_label_HomeMouseClicked

    private void label_AddResidentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_AddResidentMouseClicked
    this.dispose();
      addResident_page addResident_page = new addResident_page(user);        // TODO add your handling code here:
    }//GEN-LAST:event_label_AddResidentMouseClicked

    private void label_BasicTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_BasicTableMouseClicked
    this.dispose();
      basicTable_page basicTable_page = new basicTable_page(user);         // TODO add your handling code here:
    }//GEN-LAST:event_label_BasicTableMouseClicked

    private void label_AdvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_AdvTableMouseClicked
    this.dispose();
    new basicTable_page(user);       // TODO add your handling code here:
    }//GEN-LAST:event_label_AdvTableMouseClicked

    private void textfield_SurnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_SurnameFocusGained
        textfield_Surname.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_Surname.setText("");
    }//GEN-LAST:event_textfield_SurnameFocusGained

    private void textfield_SurnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_SurnameFocusLost
        textfield_Surname.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_SurnameFocusLost

    private void textfield_FirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_FirstNameFocusGained
        textfield_FirstName.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_FirstName.setText("");
    }//GEN-LAST:event_textfield_FirstNameFocusGained

    private void textfield_FirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_FirstNameFocusLost
        textfield_FirstName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_FirstNameFocusLost

    private void textfield_MiddleInitialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_MiddleInitialFocusGained
        textfield_MiddleInitial.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_MiddleInitial.setText("");
    }//GEN-LAST:event_textfield_MiddleInitialFocusGained

    private void textfield_MiddleInitialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_MiddleInitialFocusLost
        textfield_MiddleInitial.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_MiddleInitialFocusLost

    private void textfield_SuffixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_SuffixFocusGained
        textfield_Suffix.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_Suffix.setText("");
    }//GEN-LAST:event_textfield_SuffixFocusGained

    private void textfield_SuffixFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_SuffixFocusLost
        textfield_Suffix.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_SuffixFocusLost

    private void combobox_SexFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_SexFocusGained
        combobox_Sex.setBorder(BorderFactory.createLineBorder(Color.pink));
    }//GEN-LAST:event_combobox_SexFocusGained

    private void combobox_SexFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_SexFocusLost
        combobox_Sex.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_combobox_SexFocusLost

    private void textfield_BDAY_YEARFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_BDAY_YEARFocusGained
        textfield_BDAY_YEAR.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_PhoneNum.setText("");
    }//GEN-LAST:event_textfield_BDAY_YEARFocusGained

    private void textfield_BDAY_YEARFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_BDAY_YEARFocusLost
        textfield_BDAY_YEAR.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_BDAY_YEARFocusLost

    private void textfield_BDAY_MONTHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_BDAY_MONTHFocusGained
        textfield_BDAY_MONTH.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_BDAY_MONTH.setText("");
    }//GEN-LAST:event_textfield_BDAY_MONTHFocusGained

    private void textfield_BDAY_MONTHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_BDAY_MONTHFocusLost
        textfield_BDAY_MONTH.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_BDAY_MONTHFocusLost

    private void textfield_BDAY_DAYFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_BDAY_DAYFocusGained
        textfield_BDAY_DAY.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_BDAY_DAY.setText("");
    }//GEN-LAST:event_textfield_BDAY_DAYFocusGained

    private void textfield_BDAY_DAYFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_BDAY_DAYFocusLost
        textfield_BDAY_DAY.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_BDAY_DAYFocusLost

    private void textfield_HouseNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_HouseNumberFocusGained
        textfield_HouseNumber.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_HouseNumber.setText("");
        didAddressChange = true;
    }//GEN-LAST:event_textfield_HouseNumberFocusGained

    private void textfield_HouseNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_HouseNumberFocusLost
        textfield_HouseNumber.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_HouseNumberFocusLost

    private void textfield_BarangayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_BarangayFocusGained
        textfield_Barangay.setBorder(BorderFactory.createLineBorder(Color.pink));
    }//GEN-LAST:event_textfield_BarangayFocusGained

    private void textfield_BarangayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_BarangayFocusLost
        textfield_Barangay.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_BarangayFocusLost

    private void textfield_MunicipalityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_MunicipalityFocusGained
        textfield_Municipality.setBorder(BorderFactory.createLineBorder(Color.pink));
    }//GEN-LAST:event_textfield_MunicipalityFocusGained

    private void textfield_MunicipalityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_MunicipalityFocusLost
        textfield_Municipality.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_MunicipalityFocusLost

    private void textfield_RegionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_RegionFocusGained
        textfield_Region.setBorder(BorderFactory.createLineBorder(Color.pink));
    }//GEN-LAST:event_textfield_RegionFocusGained

    private void textfield_RegionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_RegionFocusLost
        textfield_Region.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_RegionFocusLost

    private void textfield_ProvinceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_ProvinceFocusGained
        textfield_Province.setBorder(BorderFactory.createLineBorder(Color.pink));
    }//GEN-LAST:event_textfield_ProvinceFocusGained

    private void textfield_ProvinceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_ProvinceFocusLost
        textfield_Province.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_ProvinceFocusLost

    private void textfield_DistrictFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_DistrictFocusGained
        textfield_District.setBorder(BorderFactory.createLineBorder(Color.pink));
    }//GEN-LAST:event_textfield_DistrictFocusGained

    private void textfield_DistrictFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_DistrictFocusLost
        textfield_District.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_DistrictFocusLost

    private void textfield_ZoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_ZoneFocusGained
        textfield_Zone.setBorder(BorderFactory.createLineBorder(Color.pink));
    }//GEN-LAST:event_textfield_ZoneFocusGained

    private void textfield_ZoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_ZoneFocusLost
        textfield_Zone.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_ZoneFocusLost

    private void button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelActionPerformed
        this.dispose();
        new home_page(user);
    }//GEN-LAST:event_button_CancelActionPerformed

    private void radiobutton_NO_SKvoterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radiobutton_NO_SKvoterFocusLost
        radiobutton_NO_SKvoter.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_radiobutton_NO_SKvoterFocusLost

    private void radiobutton_NO_SKvoterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radiobutton_NO_SKvoterFocusGained
        radiobutton_NO_SKvoter.setBorder(BorderFactory.createLineBorder(Color.pink));
    }//GEN-LAST:event_radiobutton_NO_SKvoterFocusGained

    private void radiobutton_YES_SKvoterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radiobutton_YES_SKvoterFocusLost
        radiobutton_YES_SKvoter.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_radiobutton_YES_SKvoterFocusLost

    private void radiobutton_YES_SKvoterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radiobutton_YES_SKvoterFocusGained
        radiobutton_YES_SKvoter.setBorder(BorderFactory.createLineBorder(Color.pink));
    }//GEN-LAST:event_radiobutton_YES_SKvoterFocusGained

    private void combobox_EducAttainFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_EducAttainFocusLost
        combobox_EducAttain.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_combobox_EducAttainFocusLost

    private void combobox_EducAttainFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_EducAttainFocusGained
        combobox_EducAttain.setBorder(BorderFactory.createLineBorder(Color.pink));
        didDemoChange = true;
    }//GEN-LAST:event_combobox_EducAttainFocusGained

    private void combobox_WorkStatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_WorkStatFocusLost
        combobox_WorkStat.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_combobox_WorkStatFocusLost

    private void combobox_WorkStatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_WorkStatFocusGained
        combobox_WorkStat.setBorder(BorderFactory.createLineBorder(Color.pink));
        didDemoChange = true;
    }//GEN-LAST:event_combobox_WorkStatFocusGained

    private void combobox_YouthClassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_YouthClassFocusLost
        combobox_YouthClass.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_combobox_YouthClassFocusLost

    private void combobox_YouthClassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_YouthClassFocusGained
        combobox_YouthClass.setBorder(BorderFactory.createLineBorder(Color.pink));
        didDemoChange = true;
    }//GEN-LAST:event_combobox_YouthClassFocusGained

    private void combobox_CivilStatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_CivilStatFocusLost
        combobox_CivilStat.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_combobox_CivilStatFocusLost

    private void combobox_CivilStatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_CivilStatFocusGained
        combobox_CivilStat.setBorder(BorderFactory.createLineBorder(Color.pink));
        didDemoChange = true;
    }//GEN-LAST:event_combobox_CivilStatFocusGained

    private void textfield_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_EmailFocusLost
        textfield_Email.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_EmailFocusLost

    private void textfield_EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_EmailFocusGained
        textfield_Email.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_Email.setText("");
    }//GEN-LAST:event_textfield_EmailFocusGained

    private void textfield_PhoneNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_PhoneNumFocusLost
        textfield_PhoneNum.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }//GEN-LAST:event_textfield_PhoneNumFocusLost

    private void textfield_PhoneNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_PhoneNumFocusGained
        textfield_PhoneNum.setBorder(BorderFactory.createLineBorder(Color.pink));
        textfield_PhoneNum.setText("");
    }//GEN-LAST:event_textfield_PhoneNumFocusGained

    private void button_EditInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EditInfoActionPerformed
        String surname = checkIfMissing(textfield_Surname);
        String firstname = checkIfMissing(textfield_FirstName);
        String initial = checkIfMissing(textfield_MiddleInitial);
        String suffix = textfield_Suffix.getText();
        String day = checkIfMissing(textfield_BDAY_DAY);
        String month = checkIfMissing(textfield_BDAY_MONTH);
        String year = checkIfMissing(textfield_BDAY_YEAR);

        String birthdate = year + "-" + month + "-" + day;

        String housenum = checkIfMissing(textfield_HouseNumber);
        String brgy = checkIfMissing(textfield_Barangay);
        String municipal = checkIfMissing(textfield_Municipality);
        String region = checkIfMissing(textfield_Region);
        String province = checkIfMissing(textfield_Province);
        String distr = checkIfMissing(textfield_District); // REWORK!! make zone, district, and barangay as only integers
        String zone = checkIfMissing(textfield_Zone);
        String number = textfield_PhoneNum.getText();
        String email = textfield_Email.getText();

        String sex = (String) combobox_Sex.getSelectedItem();
        String civStat = (String) combobox_CivilStat.getSelectedItem();
        String youthClass = (String) combobox_YouthClass.getSelectedItem();
        String workStat = (String) combobox_WorkStat.getSelectedItem();
        String educAttain = (String) combobox_EducAttain.getSelectedItem();

        boolean isSkVoter = radiobutton_YES_SKvoter.isSelected() ? true : false;
        boolean isNatVoter = radiobutton_YES_NTNLvoter.isSelected() ? true : false;

        String skVoterID = "2";
        String natVoterID = "2";
        if (isSkVoter) {
            skVoterID = "1";
        }

        if (isNatVoter) {
            natVoterID = "1";
        }

        if (fieldIsMissing) {
            JOptionPane.showMessageDialog(rootPane, "Fields cannot be empty");
        } else {
            try {
                Connection conn = user.connect();

                String sqlUpdate = "UPDATE `resident` SET `first_name`=?, `middle_initial`=?, `last_name`=?, "
                        + "`birthdate`=?, `sex`=?, `contact_num`=?, `email`=?, `address_id`=?, `demo_id`=? WHERE res_id=?";
                PreparedStatement psUpdate = conn.prepareStatement(sqlUpdate);

                psUpdate.setString(1, firstname);
                psUpdate.setString(2, initial);
                psUpdate.setString(3, surname);
                psUpdate.setString(4, birthdate);
                psUpdate.setString(5, sex); // REWORK!! add suffix sa database
                psUpdate.setString(6, number);
                psUpdate.setString(7, email);
                System.out.println("CHECKPOINT 4");
                // logic for getting the address ID

                if (didAddressChange) {
                    System.out.println("address has changed");
                    String sqlCheckIfAddressExists = "SELECT `address_id` FROM `address` WHERE zone=? AND district=? AND house_num=?";

                    PreparedStatement psCheckIfAddressExists = conn.prepareStatement(sqlCheckIfAddressExists);
                    psCheckIfAddressExists.setString(1, zone);
                    psCheckIfAddressExists.setString(2, distr);
                    psCheckIfAddressExists.setString(3, housenum);

                    ResultSet rsCheckIfAddressExists = psCheckIfAddressExists.executeQuery();

                    String addID = "";
                    boolean doesAdIdExist = true;
                    System.out.println("CHECKPOINT 5");

                    if (rsCheckIfAddressExists.next()) {
                        addID = rsCheckIfAddressExists.getString("address_id");
                        System.out.println("address: " + doesAdIdExist);
                    } else {
                        doesAdIdExist = false;
                    }
                    if (doesAdIdExist) {
                        System.out.println("ALREDY EXISTS");
                        System.out.println(addID);
                        psUpdate.setInt(8, Integer.parseInt(addID));
                    } else {
                        String sqlAddressRegister = "INSERT INTO `address`(`address_id`, `region`, `province`, `municipality`, `barangay`, `zone`, `house_num`, `district`) VALUES (?,?,?,?,?,?,?,?)";
                        PreparedStatement psAddressRegister = conn.prepareStatement(sqlAddressRegister);
                        psAddressRegister.setInt(1, Integer.parseInt((zone + housenum + distr).trim()));
                        psAddressRegister.setString(2, region);
                        psAddressRegister.setString(3, province);
                        psAddressRegister.setString(4, municipal);
                        psAddressRegister.setString(5, brgy);
                        psAddressRegister.setString(6, zone);
                        psAddressRegister.setString(7, housenum);
                        psAddressRegister.setString(8, distr);
                        psAddressRegister.execute();
                        psUpdate.setInt(8, Integer.parseInt(zone + housenum + distr));
                        System.out.println("Address not exist :((");
                    }
                } else {
                    System.out.println("Address not change :((");
                    psUpdate.setInt(8, Integer.parseInt(addressId));
                }

                String skVoter = isSkVoter ? "Yes" : "No";
                String natVoter = isNatVoter ? "Yes" : "No";

                int age = ageCalculator(year, month, day);
                String ythAge;
                if (age < 15) {
                    ythAge = "Children";
                } else if (age >= 15 && age <= 17) {
                    ythAge = "Child youth";
                } else if (age >= 18 && age <= 24) {
                    ythAge = "Core youth";
                } else if (age >= 25 && age <= 30) {
                    ythAge = "Adult youth";
                } else {
                    ythAge = "Old and Decrepit";
                }
                
                if (didDemoChange) { // REWORK!!! didDemoChange currently doesnt work, same with didAddressChange
                    System.out.println("CHECKPOINT 6");
                    demoID = demoIdPicker(combobox_Sex) + demoIdPicker(combobox_YouthClass) + demoIdPicker(combobox_WorkStat)
                            + demoIdPicker(combobox_EducAttain) + skVoterID + natVoterID;
                    // logic for getting the Demographic ID
                    String sqlCheckIfDemoExists = "SELECT `demo_id` FROM `demographic` WHERE demo_id=?";

                    PreparedStatement psCheckIfDemoExists = conn.prepareStatement(sqlCheckIfDemoExists);
                    psCheckIfDemoExists.setString(1, demoID);

                    ResultSet rsCheckIfDemoExists = psCheckIfDemoExists.executeQuery();
                    System.out.println("CHECKPOINT 7");

                    if (rsCheckIfDemoExists.next()) {
                        demoID = rsCheckIfDemoExists.getString("demo_id");
                        psUpdate.setInt(9, Integer.parseInt(demoID));
                    } else {
                        String sqlDemoRegister = "INSERT INTO `demographic`(`demo_id`, `civil_stat`, `youthAge_grp`, "
                                + "`educ_background`, `youth_class`, `work_stat`, `reg_SKVoter`, `reg_natVoter`) VALUES (?,?,?,?,?,?,?,?)";

                        PreparedStatement psDemoRegister = conn.prepareStatement(sqlDemoRegister);
                        psDemoRegister.setString(1, demoID);
                        psDemoRegister.setString(2, civStat);
                        psDemoRegister.setString(3, ythAge);
                        psDemoRegister.setString(4, educAttain);
                        psDemoRegister.setString(5, youthClass);
                        psDemoRegister.setString(6, workStat);
                        psDemoRegister.setString(7, skVoter);
                        psDemoRegister.setString(8, natVoter);
                        psUpdate.setInt(9, Integer.parseInt(demoID));
                        psDemoRegister.execute();

                    }
                } else {
                    psUpdate.setInt(9, Integer.parseInt(demoID));
                }
                psUpdate.setString(10, iD);
                System.out.println("CHECKPOINT 8");
                
                psUpdate.executeUpdate();
                // REWORK!!! make a new window instead (internal message box if possible) na dynamically changes like kung ano info ilagay ni tanga
                JOptionPane.showMessageDialog(rootPane, "Successfully registered");
                lastInsertedName = firstname;
            } catch (Exception err) {
                JOptionPane.showMessageDialog(rootPane, err);
            }
        }
    }//GEN-LAST:event_button_EditInfoActionPerformed

    public static int ageCalculator(String year, String month, String day) {
        LocalDate dob = LocalDate.parse(year + "-" + month + "-" + day);
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public static String checkIfMissing(JTextField textfield) {
        if (textfield.getText().equals("")) {
            fieldIsMissing = true;
            return null;
        }
        else {
            return textfield.getText().trim();
        }
    }

    class MyIntFilter extends DocumentFilter {

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string,
                javax.swing.text.AttributeSet attr) throws BadLocationException {

            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.insert(offset, string);

            if (test(sb.toString())) {
                super.insertString(fb, offset, string, attr);
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERROR1");
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
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
                javax.swing.text.AttributeSet attrs) throws BadLocationException {

            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.replace(offset, offset + length, text);

            if (test(sb.toString())) {
                super.replace(fb, offset, length, text, attrs);
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERROR2");
            }

        }
    }

    public static Boolean checkIfNew(String newString, String ogString) {
        if (ogString.equals(newString)) {
            return false;
        }
        return true;
    }

    public static String demoIdPicker(JComboBox comboBox) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (comboBox.getSelectedIndex() == i) {
                return String.valueOf(i+1);
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cancel;
    private javax.swing.JButton button_EditInfo;
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
    private javax.swing.JLabel label_Edit;
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
