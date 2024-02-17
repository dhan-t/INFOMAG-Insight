package insight_pawpatrol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.print.attribute.AttributeSet;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterUser {
	private JFrame frame;

	private newTextField textField_Surname;
	private newTextField textField_Firstname;
	private newTextField textField_Middlename;
	private newTextField textField_Suffix;
	private newTextField textField_Day;
	private newTextField textField_Month;
	private newTextField textField_Year;
	private newTextField textField_HouseNum;
	private newTextField textField_Barangay;
	private newTextField textField_CityMunici;
	private newTextField textField_Region;
	private newTextField textField_Province;
	private newTextField textField_District;
	private newTextField textField_Zone;
	private newTextField textField_PhoneNumber;
	private newTextField textField_Email;
	
	private DBManager user;
	
	public RegisterUser(DBManager user) {
		this.user = user;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(44, 44, 44));
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(44, 44, 44));
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel_sidePanel = new JPanel();
		panel_sidePanel.setBackground(new Color(22, 22, 22));
		panel_sidePanel.setBounds(0, 0, 130, 681);
		frame.getContentPane().add(panel_sidePanel);
		panel_sidePanel.setLayout(null);
		
		JLabel lbl_Insight = new JLabel("Insight");
		lbl_Insight.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Insight.setForeground(new Color(255, 255, 255));
		lbl_Insight.setFont(new Font("Quando", Font.PLAIN, 25));
		lbl_Insight.setBounds(0, 11, 130, 34);
		panel_sidePanel.add(lbl_Insight);
		
		JLabel lbl_SkRecords = new JLabel("SK Records");
		lbl_SkRecords.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SkRecords.setForeground(Color.WHITE);
		lbl_SkRecords.setFont(new Font("Quando", Font.PLAIN, 14));
		lbl_SkRecords.setBounds(-1, 34, 130, 34);
		panel_sidePanel.add(lbl_SkRecords);
		
		JLabel lblNewLabel = new JLabel("Register Form");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(139, 11, 250, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_BasicDetailsTablet = new JPanel();
		panel_BasicDetailsTablet.setBackground(new Color(255, 255, 255));
		panel_BasicDetailsTablet.setBounds(140, 74, 300, 600);
		frame.getContentPane().add(panel_BasicDetailsTablet);
		panel_BasicDetailsTablet.setLayout(null);
		
		JLabel lbl_BasicDetails = new JLabel("Basic Details");
		lbl_BasicDetails.setFont(new Font("Quando", Font.PLAIN, 23));
		lbl_BasicDetails.setBounds(10, 11, 280, 43);
		panel_BasicDetailsTablet.add(lbl_BasicDetails);
		
		JPanel panel_PhotoPlaceholder = new JPanel();
		panel_PhotoPlaceholder.setBackground(new Color(25, 25, 25));
		panel_PhotoPlaceholder.setBounds(10, 53, 135, 135);
		panel_BasicDetailsTablet.add(panel_PhotoPlaceholder);
		
		// REWORK!!! add a image thingy majigy
		JButton btn_UploadPhoto = new JButton("Upload Photo");
		btn_UploadPhoto.setFont(new Font("Arial", Font.PLAIN, 13));
		btn_UploadPhoto.setBackground(new Color(255, 195, 0));
		btn_UploadPhoto.setBounds(171, 151, 119, 35);
		panel_BasicDetailsTablet.add(btn_UploadPhoto);
		
		JPanel panel_Surname = new JPanel();
		panel_Surname.setBackground(new Color(255, 255, 255));
		panel_Surname.setBounds(10, 209, 290, 50);
		panel_BasicDetailsTablet.add(panel_Surname);
		panel_Surname.setLayout(null);
		
		textField_Surname = new newTextField("Surname");
		textField_Surname.setBounds(0, 15, 280, 35);
		panel_Surname.add(textField_Surname);
		textField_Surname.setColumns(10);
			
		JLabel lbl_Surname = new JLabel("Surname");
		lbl_Surname.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Surname.setBounds(0, 0, 61, 14);
		panel_Surname.add(lbl_Surname);
		
		JPanel panel_Firstname = new JPanel();
		panel_Firstname.setLayout(null);
		panel_Firstname.setBackground(Color.WHITE);
		panel_Firstname.setBounds(10, 270, 290, 50);
		panel_BasicDetailsTablet.add(panel_Firstname);
		
		textField_Firstname = new newTextField("First Name");
		textField_Firstname.setColumns(10);
		textField_Firstname.setBounds(0, 15, 280, 35);
		panel_Firstname.add(textField_Firstname);
		
		JLabel lbl_FirstName = new JLabel("First Name");
		lbl_FirstName.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_FirstName.setBounds(0, 0, 330, 14);
		panel_Firstname.add(lbl_FirstName);
		
		JPanel panel_MiddlenameAndSuffix = new JPanel();
		panel_MiddlenameAndSuffix.setLayout(null);
		panel_MiddlenameAndSuffix.setBackground(Color.WHITE);
		panel_MiddlenameAndSuffix.setBounds(10, 331, 290, 50);
		panel_BasicDetailsTablet.add(panel_MiddlenameAndSuffix);
		
		textField_Middlename = new newTextField("Middle Name");
		textField_Middlename.setColumns(10);
		textField_Middlename.setBounds(0, 15, 199, 35);
		panel_MiddlenameAndSuffix.add(textField_Middlename);
		
		JLabel lbl_Middlename = new JLabel("Middlename");
		lbl_Middlename.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Middlename.setBounds(0, 0, 199, 14);
		panel_MiddlenameAndSuffix.add(lbl_Middlename);
		
		textField_Suffix = new newTextField("Suffix");
		textField_Suffix.setColumns(10);
		textField_Suffix.setBounds(208, 15, 68, 35);
		panel_MiddlenameAndSuffix.add(textField_Suffix);
		
		JLabel lbl_Suffix = new JLabel("Suffix");
		lbl_Suffix.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Suffix.setBounds(208, 0, 79, 14);
		panel_MiddlenameAndSuffix.add(lbl_Suffix);
		
		JPanel panel_Birthdate = new JPanel();
		panel_Birthdate.setLayout(null);
		panel_Birthdate.setBackground(Color.WHITE);
		panel_Birthdate.setBounds(10, 392, 290, 50);
		panel_BasicDetailsTablet.add(panel_Birthdate);
		
		textField_Day = new newTextField("Day");
		textField_Day.setColumns(10);
		textField_Day.setBounds(0, 15, 50, 35);
		panel_Birthdate.add(textField_Day);
		PlainDocument docDay = (PlainDocument) textField_Day.getDocument();
		docDay.setDocumentFilter(new MyIntFilter());
		
		JLabel lbl_Birthdate = new JLabel("Birthdate (DD-MM-YYYY)");
		lbl_Birthdate.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Birthdate.setBounds(0, 0, 230, 14);
		panel_Birthdate.add(lbl_Birthdate);
		
		textField_Month = new newTextField("Month");
		textField_Month.setColumns(10);
		textField_Month.setBounds(60, 15, 50, 35);
		panel_Birthdate.add(textField_Month);
		PlainDocument docMonth = (PlainDocument) textField_Month.getDocument();
		docMonth.setDocumentFilter(new MyIntFilter());
		
		textField_Year = new newTextField("Year");
		textField_Year.setColumns(10);
		textField_Year.setBounds(120, 15, 86, 35);
		panel_Birthdate.add(textField_Year);
		PlainDocument docYear = (PlainDocument) textField_Year.getDocument();
		docYear.setDocumentFilter(new MyIntFilter());
		
		JPanel panel_Sex = new JPanel();
		panel_Sex.setLayout(null);
		panel_Sex.setBackground(Color.WHITE);
		panel_Sex.setBounds(10, 453, 290, 50);
		panel_BasicDetailsTablet.add(panel_Sex);
		
		JLabel lbl_Sex = new JLabel("Sex");
		lbl_Sex.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Sex.setBounds(0, 0, 230, 14);
		panel_Sex.add(lbl_Sex);
		
		JComboBox comboBox_Sex = new JComboBox();
		comboBox_Sex.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_Sex.setBackground(new Color(255, 255, 255));
		comboBox_Sex.setModel(new DefaultComboBoxModel(new String[] {"", "Male", "Female"}));
		comboBox_Sex.setBounds(0, 15, 77, 35);
		panel_Sex.add(comboBox_Sex);
		
		JPanel panel_AddressContactTablet = new JPanel();
		panel_AddressContactTablet.setLayout(null);
		panel_AddressContactTablet.setBackground(Color.WHITE);
		panel_AddressContactTablet.setBounds(450, 74, 300, 600);
		frame.getContentPane().add(panel_AddressContactTablet);
		
		JLabel lbl_BasicDetails_1 = new JLabel("Address");
		lbl_BasicDetails_1.setFont(new Font("Quando", Font.PLAIN, 23));
		lbl_BasicDetails_1.setBounds(10, 11, 280, 43);
		panel_AddressContactTablet.add(lbl_BasicDetails_1);
		
		JPanel panel_HouseNumANDBarangay = new JPanel();
		panel_HouseNumANDBarangay.setLayout(null);
		panel_HouseNumANDBarangay.setBackground(Color.WHITE);
		panel_HouseNumANDBarangay.setBounds(10, 50, 280, 50);
		panel_AddressContactTablet.add(panel_HouseNumANDBarangay);
		
		textField_HouseNum = new newTextField("House Number");
		textField_HouseNum.setColumns(10);
		textField_HouseNum.setBounds(0, 15, 135, 35);
		panel_HouseNumANDBarangay.add(textField_HouseNum);
		PlainDocument docHouseNum = (PlainDocument) textField_HouseNum.getDocument();
		docHouseNum.setDocumentFilter(new MyIntFilter());
		
		JLabel lbl_HouseNum = new JLabel("House Number");
		lbl_HouseNum.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_HouseNum.setBounds(0, 0, 120, 14);
		panel_HouseNumANDBarangay.add(lbl_HouseNum);
		
		textField_Barangay = new newTextField("Barangay");
		textField_Barangay.setColumns(10);
		textField_Barangay.setBounds(145, 15, 135, 35);
		panel_HouseNumANDBarangay.add(textField_Barangay);
		
		JLabel lbl_Barangay = new JLabel("Barangay");
		lbl_Barangay.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Barangay.setBounds(145, 0, 135, 14);
		panel_HouseNumANDBarangay.add(lbl_Barangay);
		
		JPanel panel_CityANDRegion = new JPanel();
		panel_CityANDRegion.setLayout(null);
		panel_CityANDRegion.setBackground(Color.WHITE);
		panel_CityANDRegion.setBounds(10, 111, 280, 50);
		panel_AddressContactTablet.add(panel_CityANDRegion);
		
		textField_CityMunici = new newTextField("Municipality");
		textField_CityMunici.setColumns(10);
		textField_CityMunici.setBounds(0, 15, 135, 35);
		panel_CityANDRegion.add(textField_CityMunici);
		
		JLabel lbl_CityMunici = new JLabel("City / Municipality");
		lbl_CityMunici.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_CityMunici.setBounds(0, 0, 135, 14);
		panel_CityANDRegion.add(lbl_CityMunici);
		
		textField_Region = new newTextField("Region");
		textField_Region.setColumns(10);
		textField_Region.setBounds(145, 15, 135, 35);
		panel_CityANDRegion.add(textField_Region);
		
		JLabel lbl_Region = new JLabel("Region");
		lbl_Region.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Region.setBounds(145, 0, 135, 14);
		panel_CityANDRegion.add(lbl_Region);
		
		JPanel panel_ProvinceANDDistrict = new JPanel();
		panel_ProvinceANDDistrict.setLayout(null);
		panel_ProvinceANDDistrict.setBackground(Color.WHITE);
		panel_ProvinceANDDistrict.setBounds(10, 172, 280, 50);
		panel_AddressContactTablet.add(panel_ProvinceANDDistrict);
		
		textField_Province = new newTextField("Province");
		textField_Province.setColumns(10);
		textField_Province.setBounds(0, 15, 135, 35);
		panel_ProvinceANDDistrict.add(textField_Province);
		
		JLabel lbl_Province = new JLabel("Province");
		lbl_Province.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Province.setBounds(0, 0, 135, 14);
		panel_ProvinceANDDistrict.add(lbl_Province);
		
		textField_District = new newTextField("District");
		textField_District.setColumns(10);
		textField_District.setBounds(145, 15, 135, 35);
		panel_ProvinceANDDistrict.add(textField_District);
		
		JLabel lbl_District = new JLabel("District");
		lbl_District.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_District.setBounds(145, 0, 135, 14);
		panel_ProvinceANDDistrict.add(lbl_District);
		
		JPanel panel_Zone = new JPanel();
		panel_Zone.setLayout(null);
		panel_Zone.setBackground(Color.WHITE);
		panel_Zone.setBounds(10, 233, 280, 50);
		panel_AddressContactTablet.add(panel_Zone);
		
		textField_Zone = new newTextField("Zone");
		textField_Zone.setColumns(10);
		textField_Zone.setBounds(0, 15, 135, 35);
		panel_Zone.add(textField_Zone);
		
		JLabel lbl_Zone = new JLabel("Zone");
		lbl_Zone.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Zone.setBounds(0, 0, 135, 14);
		panel_Zone.add(lbl_Zone);
		
		JLabel lbl_BasicDetails_1_1 = new JLabel("Contact Information");
		lbl_BasicDetails_1_1.setFont(new Font("Quando", Font.PLAIN, 23));
		lbl_BasicDetails_1_1.setBounds(10, 294, 280, 43);
		panel_AddressContactTablet.add(lbl_BasicDetails_1_1);
		
		JPanel panel_PhoneNumber = new JPanel();
		panel_PhoneNumber.setLayout(null);
		panel_PhoneNumber.setBackground(Color.WHITE);
		panel_PhoneNumber.setBounds(10, 332, 280, 50);
		panel_AddressContactTablet.add(panel_PhoneNumber);
		
		// REWORK!!! add a limit sa amount ng number + dapat 09 lagi simula
		textField_PhoneNumber = new newTextField("Phone Number");
		textField_PhoneNumber.setColumns(10);
		textField_PhoneNumber.setBounds(0, 15, 280, 35);
		PlainDocument docPhoneNum = (PlainDocument) textField_PhoneNumber.getDocument();
		docPhoneNum.setDocumentFilter(new MyIntFilter());
		
		panel_PhoneNumber.add(textField_PhoneNumber);
		
		JLabel lbl_PhoneNumber = new JLabel("Phone Number");
		lbl_PhoneNumber.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_PhoneNumber.setBounds(0, 0, 280, 14);
		panel_PhoneNumber.add(lbl_PhoneNumber);
		
		JPanel panel_Email = new JPanel();
		panel_Email.setLayout(null);
		panel_Email.setBackground(Color.WHITE);
		panel_Email.setBounds(10, 393, 280, 50);
		panel_AddressContactTablet.add(panel_Email);
		
		textField_Email = new newTextField("Email");
		textField_Email.setColumns(10);
		textField_Email.setBounds(0, 15, 280, 35);
		panel_Email.add(textField_Email);
		
		JLabel lbl_Email = new JLabel("Email");
		lbl_Email.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Email.setBounds(0, 0, 280, 14);
		panel_Email.add(lbl_Email);
		
		JPanel panel_Demographic = new JPanel();
		panel_Demographic.setLayout(null);
		panel_Demographic.setBackground(Color.WHITE);
		panel_Demographic.setBounds(760, 74, 300, 600);
		frame.getContentPane().add(panel_Demographic);
		
		JLabel lbl_BasicDetails_1_2 = new JLabel("Demographic");
		lbl_BasicDetails_1_2.setFont(new Font("Quando", Font.PLAIN, 23));
		lbl_BasicDetails_1_2.setBounds(10, 11, 280, 43);
		panel_Demographic.add(lbl_BasicDetails_1_2);
		
		JPanel panel_CivilStats = new JPanel();
		panel_CivilStats.setLayout(null);
		panel_CivilStats.setBackground(Color.WHITE);
		panel_CivilStats.setBounds(10, 50, 280, 50);
		panel_Demographic.add(panel_CivilStats);
		
		JLabel lbl_CivilStats = new JLabel("Civil Status");
		lbl_CivilStats.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_CivilStats.setBounds(0, 0, 120, 14);
		panel_CivilStats.add(lbl_CivilStats);
		
		JComboBox comboBox_CivilStats = new JComboBox();
		comboBox_CivilStats.setBackground(new Color(255, 255, 255));
		comboBox_CivilStats.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_CivilStats.setModel(new DefaultComboBoxModel(new String[] {"Single", "Married", "Widowed", "Divorces"}));
		comboBox_CivilStats.setBounds(0, 15, 280, 35);
		panel_CivilStats.add(comboBox_CivilStats);
		
		JPanel panel_YouthClass = new JPanel();
		panel_YouthClass.setLayout(null);
		panel_YouthClass.setBackground(Color.WHITE);
		panel_YouthClass.setBounds(10, 111, 280, 50);
		panel_Demographic.add(panel_YouthClass);
		
		JLabel lbl_YouthClass = new JLabel("Youth Class");
		lbl_YouthClass.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_YouthClass.setBounds(0, 0, 120, 14);
		panel_YouthClass.add(lbl_YouthClass);
		
		JComboBox comboBox_YouthClass = new JComboBox();
		comboBox_YouthClass.setModel(new DefaultComboBoxModel(new String[] {"Child Youth", "Youth Core", "Young Adult"}));
		comboBox_YouthClass.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_YouthClass.setBackground(Color.WHITE);
		comboBox_YouthClass.setBounds(0, 15, 280, 35);
		panel_YouthClass.add(comboBox_YouthClass);
		
		JPanel panel_WorkStatus = new JPanel();
		panel_WorkStatus.setLayout(null);
		panel_WorkStatus.setBackground(Color.WHITE);
		panel_WorkStatus.setBounds(10, 174, 280, 50);
		panel_Demographic.add(panel_WorkStatus);
		
		JLabel lbl_WorkStatus = new JLabel("Work Status");
		lbl_WorkStatus.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_WorkStatus.setBounds(0, 0, 120, 14);
		panel_WorkStatus.add(lbl_WorkStatus);
		
		JComboBox comboBox_WorkStatus = new JComboBox();
		comboBox_WorkStatus.setModel(new DefaultComboBoxModel(new String[] {"Employed", "Self-Employed", "Unemployed"}));
		comboBox_WorkStatus.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_WorkStatus.setBackground(Color.WHITE);
		comboBox_WorkStatus.setBounds(0, 15, 280, 35);
		panel_WorkStatus.add(comboBox_WorkStatus);
		
		JPanel panel_HighestEduc = new JPanel();
		panel_HighestEduc.setLayout(null);
		panel_HighestEduc.setBackground(Color.WHITE);
		panel_HighestEduc.setBounds(10, 235, 280, 50);
		panel_Demographic.add(panel_HighestEduc);
		
		JLabel lbl_HighestEduc = new JLabel("Highest Educational Attainment");
		lbl_HighestEduc.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_HighestEduc.setBounds(0, 0, 280, 14);
		panel_HighestEduc.add(lbl_HighestEduc);
		
		JComboBox comboBox_HighestEduc = new JComboBox();
		comboBox_HighestEduc.setModel(new DefaultComboBoxModel(new String[] {"Elementary", "High-School", "Senior High-School", "College"}));
		comboBox_HighestEduc.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_HighestEduc.setBackground(Color.WHITE);
		comboBox_HighestEduc.setBounds(0, 15, 280, 35);
		panel_HighestEduc.add(comboBox_HighestEduc);
		
		JPanel panel_SkVoter = new JPanel();
		panel_SkVoter.setLayout(null);
		panel_SkVoter.setBackground(Color.WHITE);
		panel_SkVoter.setBounds(10, 296, 280, 50);
		panel_Demographic.add(panel_SkVoter);
		
		JLabel lbl_SkVoter = new JLabel("Registered SK Voter");
		lbl_SkVoter.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_SkVoter.setBounds(0, 0, 280, 14);
		panel_SkVoter.add(lbl_SkVoter);
		
		JRadioButton rdbtn_SK_Yes = new JRadioButton("Yes");
		rdbtn_SK_Yes.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtn_SK_Yes.setBackground(new Color(255, 255, 255));
		rdbtn_SK_Yes.setBounds(0, 15, 80, 35);
		panel_SkVoter.add(rdbtn_SK_Yes);
		
		JRadioButton rdbtn_SK_No = new JRadioButton("No");
		rdbtn_SK_No.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtn_SK_No.setBackground(Color.WHITE);
		rdbtn_SK_No.setBounds(81, 15, 80, 35);
		panel_SkVoter.add(rdbtn_SK_No);
		
		ButtonGroup skGroup = new ButtonGroup();
		skGroup.add(rdbtn_SK_Yes);
		skGroup.add(rdbtn_SK_No);
		
		JPanel panel_NatVoter = new JPanel();
		panel_NatVoter.setLayout(null);
		panel_NatVoter.setBackground(Color.WHITE);
		panel_NatVoter.setBounds(10, 357, 280, 50);
		panel_Demographic.add(panel_NatVoter);
		
		JLabel lbl_NatVoter = new JLabel("Registered National Voter");
		lbl_NatVoter.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_NatVoter.setBounds(0, 0, 280, 14);
		panel_NatVoter.add(lbl_NatVoter);
		
		JRadioButton rdbtn_NatVoter_Yes = new JRadioButton("Yes");
		rdbtn_NatVoter_Yes.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtn_NatVoter_Yes.setBackground(Color.WHITE);
		rdbtn_NatVoter_Yes.setBounds(0, 15, 80, 35);
		panel_NatVoter.add(rdbtn_NatVoter_Yes);
		
		JRadioButton rdbtn_NatVoter_No = new JRadioButton("No");
		rdbtn_NatVoter_No.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtn_NatVoter_No.setBackground(Color.WHITE);
		rdbtn_NatVoter_No.setBounds(81, 15, 80, 35);
		panel_NatVoter.add(rdbtn_NatVoter_No);
		
		ButtonGroup natGroup = new ButtonGroup();
		natGroup.add(rdbtn_NatVoter_Yes);
		natGroup.add(rdbtn_NatVoter_No);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// REWORK!! add a feature na kahit hindi exactly tama yung ininput, basta andon yung thought ma nonormalize sya
				// for instance, sa municipality: City of Maniila nasa database, kahit manila lang ilagay nila
				// dat maging City of Manila parin
				ArrayList<newTextField> rah = new ArrayList<newTextField>();
				String surname = checkIfMissing(textField_Surname, rah);
				String firstname = checkIfMissing(textField_Firstname, rah);
				String initial = checkIfMissing(textField_Middlename, rah);
				String suffix = textField_Suffix.getText();
				String day = checkIfMissing(textField_Day, rah);
				String month = checkIfMissing(textField_Month, rah);
				String year = checkIfMissing(textField_Year, rah);
				
				String birthdate = year+"-"+month+"-"+day;
				
				String housenum = checkIfMissing(textField_HouseNum, rah);
				String brgy = checkIfMissing(textField_Barangay, rah);
				String municipal = checkIfMissing(textField_CityMunici, rah);
				String region = checkIfMissing(textField_Region, rah);
				String province = checkIfMissing(textField_Province, rah);
				String distr = checkIfMissing(textField_District, rah); // REWORK!! make zone, district, and barangay as only integers
				String zone = checkIfMissing(textField_Zone, rah);
				String number = textField_PhoneNumber.getText();
				String email = textField_Email.getText();
				
				String sex = (String) comboBox_Sex.getSelectedItem();
				String civStat = (String) comboBox_CivilStats.getSelectedItem();
				String youthClass = (String) comboBox_YouthClass.getSelectedItem();
				String workStat = (String) comboBox_WorkStatus.getSelectedItem();
				String educAttain = (String) comboBox_HighestEduc.getSelectedItem();
				
				boolean isSkVoter = rdbtn_SK_Yes.isSelected() ? true : false;
				boolean isNatVoter = rdbtn_NatVoter_Yes.isSelected() ? true : false;
				
				String skVoterID = "2";
				String natVoterID = "2";
				if (isSkVoter) skVoterID = "1";
				if (isNatVoter) natVoterID = "1";
				
				if (rah.size() > 0) {
					if (rah.size() == 1) {
						newTextField tf = rah.get(0);
						JOptionPane.showMessageDialog(btnNewButton, tf.tfName + " cannot be blank!!!");
					}
					else { // REWORK!!! make a new window instead (internal message box if possible) na dynamically changes
						String s = "";
						for (newTextField tf : rah) {
							s += tf.tfName + " ";
						}
						
						JOptionPane.showMessageDialog(btnNewButton, "The following textbox cannot be blank: ");
					}
				}
				else {
					try {				
						String sqlCheckIfRegistered = "SELECT `res_id` FROM `resident` WHERE first_name=? AND last_name=? AND birthdate=?";
						
						Connection conn = user.connect();
		
						PreparedStatement psCheckIfReg = conn.prepareStatement(sqlCheckIfRegistered);
						psCheckIfReg.setString(1, firstname);
						psCheckIfReg.setString(2, surname);
						psCheckIfReg.setString(3, year+"-"+month+"-"+day);
						
						ResultSet rs =  psCheckIfReg.executeQuery();
						
						if (rs.next()) { // REWORK?? either true or false
							JOptionPane.showMessageDialog(btnNewButton, "User already exists");
						}
						else {
							String sqlCheckHighestID  = "SELECT `res_id`FROM `resident` ORDER BY CAST(`res_id` AS UNSIGNED) DESC LIMIT 1";
							
							PreparedStatement psCheckHighestID = conn.prepareStatement(sqlCheckHighestID);
							ResultSet rsHighestID = psCheckHighestID.executeQuery();
							
							Pattern pattern = Pattern.compile("(.*-)([0-1])(\\d{4})");
							Matcher matcher = pattern.matcher(rsHighestID.getString("res_id"));
							int highestID = 0;
							while (matcher.find()) {
								highestID = Integer.parseInt(matcher.group(3));
							}
							
							highestID++;
							
							String sqlRegister = "INSERT INTO `resident`(`res_id`, `first_name`, `middle_initial`, `last_name`,"
									+ " `birthdate`, `sex`, `contact_num`, `email`, `address_id`, `demo_id`) VALUES(?,?,?,?,?,?,?,?,?,?)";
							PreparedStatement psReg = conn.prepareStatement(sqlRegister);
							
							String resID = year+"-1"+highestID; // REWORK!! palitan yung 1 ng dynamic if registered na ba or not
							psReg.setString(1, resID);
							psReg.setString(2, firstname);
							psReg.setString(3, initial);
							psReg.setString(4, surname);
							psReg.setString(5, birthdate); // REWORK!! add suffix sa database
							psReg.setString(6, sex);
							psReg.setString(7, number);
							psReg.setString(8, email);
							
							// logic for getting the address ID
							String sqlCheckIfAddressExists = "SELECT `address_id` FROM `address` WHERE zone=? AND district=? AND house_num=?";
							
							PreparedStatement psCheckIfAddressExists = conn.prepareStatement(sqlCheckIfAddressExists);
							psCheckIfAddressExists.setString(1, zone);
							psCheckIfAddressExists.setString(2, distr);
							psCheckIfAddressExists.setString(3, housenum);
							
							ResultSet rsCheckIfAddressExists = psCheckIfAddressExists.executeQuery();
							String addID = "";
							
							while(rsCheckIfAddressExists.next()) {
								if (rsCheckIfAddressExists.getString("address_id") == null) {
									psReg.setString(9, zone+housenum+distr);
									break;
								}
								else {
									addID = rsCheckIfAddressExists.getString("address_id");
									psReg.setString(9, addID);
									break;
								}
							}
							
							String demoID = demoIdPicker(comboBox_Sex) + demoIdPicker(comboBox_YouthClass)+ demoIdPicker(comboBox_WorkStatus)
							+ demoIdPicker(comboBox_HighestEduc) + skVoterID + natVoterID;
							// logic for getting the Demographic ID
							String sqlCheckIfDemoExists = "SELECT `demo_id` FROM `demographic` WHERE demo_id=?";

							PreparedStatement psCheckIfDemoExists = conn.prepareStatement(sqlCheckIfDemoExists);
							psCheckIfDemoExists.setString(1, demoID);
							
							ResultSet rsCheckIfDemoExists = psCheckIfDemoExists.executeQuery();
							
							while (rsCheckIfDemoExists.next()) {
								if (rsCheckIfDemoExists.getString("demo_id") == null) {
									psReg.setString(9, demoID);
									
									String sqlDemoRegister = "INSERT INTO `demographic`(`demo_id`, `civil_stat`, `youthAge_grp`, "
											+ "`educ_background`, `youth_class`, `work_stat`, `reg_SKVoter`, `reg_natVoter`) VALUES (?,?,?,?,?,?,?,?)";
									
									PreparedStatement psDemoRegister = conn.prepareStatement(sqlDemoRegister);
									psDemoRegister.setString(1, demoID);
									psDemoRegister.setString(2, civStat);
									psDemoRegister.setString(3, demoID);
									psDemoRegister.setString(4, educAttain);
									psDemoRegister.setString(5, demoID);
									psDemoRegister.setString(6, demoID);
									psDemoRegister.setString(7, demoID);
									psDemoRegister.setString(8, demoID);
									
									ResultSet rsDemoRegister = psDemoRegister.executeQuery();
								}
							}
							
						}
					}
					catch (Exception err) {
						JOptionPane.showMessageDialog(btnNewButton, err);
					}					
				}

			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(41, 139, 37));
		btnNewButton.setBounds(10, 418, 280, 35);
		panel_Demographic.add(btnNewButton);
		frame.setBounds(100, 100, 1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static String checkIfMissing(newTextField textfield, ArrayList<newTextField> rah) {
		if (textfield.getText() == null) {
			rah.add(textfield);
			return null;
		}
		else {
			return textfield.getText();
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
				JOptionPane.showMessageDialog(frame, "ERROR1");
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
				JOptionPane.showMessageDialog(frame, "ERROR2");
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
}

