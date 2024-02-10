package insight_pawpatrol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class RegisterUser {

	private JFrame frame;

	private boolean bscORadv = true;
	private JTextField textField_Surname;
	private JTextField textField_Firstname;
	private JTextField textField_Middlename;
	private JTextField textField_Suffix;
	private JTextField textField_Day;
	private JTextField textField_Month;
	private JTextField textField_Year;
	private JTextField textField_HouseNum;
	private JTextField textField_Barangay;
	private JTextField textField_CityMunici;
	private JTextField textField_Region;
	private JTextField textField_Province;
	private JTextField textField_District;
	private JTextField textField_Zone;
	private JTextField textField_PhoneNumber;
	private JTextField textField_Email;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterUser window = new RegisterUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(44, 44, 44));
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(44, 44, 44));
		frame.getContentPane().setLayout(null);
		
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
		
		textField_Surname = new JTextField();
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
		
		textField_Firstname = new JTextField();
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
		
		textField_Middlename = new JTextField();
		textField_Middlename.setColumns(10);
		textField_Middlename.setBounds(0, 15, 199, 35);
		panel_MiddlenameAndSuffix.add(textField_Middlename);
		
		JLabel lbl_Middlename = new JLabel("Middlename");
		lbl_Middlename.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Middlename.setBounds(0, 0, 199, 14);
		panel_MiddlenameAndSuffix.add(lbl_Middlename);
		
		textField_Suffix = new JTextField();
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
		
		textField_Day = new JTextField();
		textField_Day.setColumns(10);
		textField_Day.setBounds(0, 15, 50, 35);
		panel_Birthdate.add(textField_Day);
		
		JLabel lbl_Birthdate = new JLabel("Birthdate (DD-MM-YYYY)");
		lbl_Birthdate.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Birthdate.setBounds(0, 0, 230, 14);
		panel_Birthdate.add(lbl_Birthdate);
		
		textField_Month = new JTextField();
		textField_Month.setColumns(10);
		textField_Month.setBounds(60, 15, 50, 35);
		panel_Birthdate.add(textField_Month);
		
		textField_Year = new JTextField();
		textField_Year.setColumns(10);
		textField_Year.setBounds(120, 15, 86, 35);
		panel_Birthdate.add(textField_Year);
		
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
		
		textField_HouseNum = new JTextField();
		textField_HouseNum.setColumns(10);
		textField_HouseNum.setBounds(0, 15, 135, 35);
		panel_HouseNumANDBarangay.add(textField_HouseNum);
		
		JLabel lbl_HouseNum = new JLabel("House Number");
		lbl_HouseNum.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_HouseNum.setBounds(0, 0, 120, 14);
		panel_HouseNumANDBarangay.add(lbl_HouseNum);
		
		textField_Barangay = new JTextField();
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
		
		textField_CityMunici = new JTextField();
		textField_CityMunici.setColumns(10);
		textField_CityMunici.setBounds(0, 15, 135, 35);
		panel_CityANDRegion.add(textField_CityMunici);
		
		JLabel lbl_CityMunici = new JLabel("City / Municipality");
		lbl_CityMunici.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_CityMunici.setBounds(0, 0, 135, 14);
		panel_CityANDRegion.add(lbl_CityMunici);
		
		textField_Region = new JTextField();
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
		
		textField_Province = new JTextField();
		textField_Province.setColumns(10);
		textField_Province.setBounds(0, 15, 135, 35);
		panel_ProvinceANDDistrict.add(textField_Province);
		
		JLabel lbl_Province = new JLabel("Province");
		lbl_Province.setFont(new Font("Arial", Font.PLAIN, 13));
		lbl_Province.setBounds(0, 0, 135, 14);
		panel_ProvinceANDDistrict.add(lbl_Province);
		
		textField_District = new JTextField();
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
		
		textField_Zone = new JTextField();
		textField_Zone.setColumns(10);
		textField_Zone.setBounds(0, 15, 135, 35);
		panel_Zone.add(textField_Zone);
		
		JLabel lbl_Zone = new JLabel("Province");
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
		
		textField_PhoneNumber = new JTextField();
		textField_PhoneNumber.setColumns(10);
		textField_PhoneNumber.setBounds(0, 15, 280, 35);
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
		
		textField_Email = new JTextField();
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
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(41, 139, 37));
		btnNewButton.setBounds(10, 418, 280, 35);
		panel_Demographic.add(btnNewButton);
		frame.setBounds(100, 100, 1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
