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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
// NOTE!!! ctrl f REWORK para malaman kung ano mga dapat baguhin
public class BasicView_BasicTable {
	
	private JFrame frame;
	private JTextField textField_Searchbar;
	private JTable table;
	private JTable table1;
	private DBManager user;

	private boolean bscORadv = true;

	public BasicView_BasicTable(DBManager user) {
		this.user = user;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(44, 44, 44));
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(44, 44, 44));
		frame.setVisible(true);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel_sidePanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_sidePanel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_sidePanel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_sidePanel, 681, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_sidePanel, 130, SpringLayout.WEST, frame.getContentPane());
		panel_sidePanel.setBackground(new Color(22, 22, 22));
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

		JPanel panel_TopLeft = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_TopLeft, 11, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_TopLeft, 140, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_TopLeft, 81, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_TopLeft, 478, SpringLayout.WEST, frame.getContentPane());
		panel_TopLeft.setBackground(new Color(255, 195, 0));
		frame.getContentPane().add(panel_TopLeft);
		panel_TopLeft.setLayout(null);

		JLabel lbl_topleft_ShowingData = new JLabel("SHOWING DATA OF RESIDENTS");
		lbl_topleft_ShowingData.setBounds(10, 11, 318, 29);
		lbl_topleft_ShowingData.setFont(new Font("Arial", Font.BOLD, 15));
		panel_TopLeft.add(lbl_topleft_ShowingData);

		JLabel lbl_topleft_LastUpdated = new JLabel("LAST UPDATED: ");
		lbl_topleft_LastUpdated.setBackground(new Color(45, 45, 45));
		lbl_topleft_LastUpdated.setBounds(10, 35, 318, 24);
		lbl_topleft_LastUpdated.setFont(new Font("Arial", Font.BOLD, 14));
		panel_TopLeft.add(lbl_topleft_LastUpdated);

		JPanel panel_TopRight = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_TopRight, 11, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_TopRight, 555, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_TopRight, 81, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_TopRight, 1054, SpringLayout.WEST, frame.getContentPane());
		panel_TopRight.setBackground(new Color(255, 195, 0));
		frame.getContentPane().add(panel_TopRight);
		panel_TopRight.setLayout(null);

		JLabel lbl_topright_BarangayName = new JLabel("BARANGAY");
		lbl_topright_BarangayName.setBounds(10, 0, 489, 38);
		lbl_topright_BarangayName.setFont(new Font("Arial", Font.BOLD, 26));
		panel_TopRight.add(lbl_topright_BarangayName);

		textField_Searchbar = new JTextField();
		textField_Searchbar.setBounds(10, 38, 155, 25);
		panel_TopRight.add(textField_Searchbar);
		textField_Searchbar.setColumns(10);

		JScrollPane scrollPane_BasicView = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane_BasicView, 92, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane_BasicView, 137, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane_BasicView, 767, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane_BasicView, 1054, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(scrollPane_BasicView);

		JScrollPane scrollPane_TableScroll = new JScrollPane();
		scrollPane_TableScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_TableScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_BasicView.setViewportView(scrollPane_TableScroll);

		table = new JTable();
		table.setVisible(bscORadv);
		table.setBorder(null);
		table.setSurrendersFocusOnKeystroke(true);
		scrollPane_TableScroll.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setFont(new Font("Tall Dark And Handsome", Font.PLAIN, 17));
		table.setModel(new DefaultTableModel(
				new Object[][] {
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
				},
				new String[] {
						"ID", "Surname", "First Name", "Middle Initial", "Suffix", "Sex", "Number", "Address"
				}
				) {
			Class[] columnTypes = new Class[] {
					Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(70);
		table.getColumnModel().getColumn(4).setPreferredWidth(45);
		table.getColumnModel().getColumn(5).setPreferredWidth(45);
		table.getColumnModel().getColumn(6).setPreferredWidth(90);
		table.getColumnModel().getColumn(7).setResizable(false);
		table.getColumnModel().getColumn(7).setPreferredWidth(150);
		
		table1 = new JTable();
		table1.setBorder(null);
		table1.setSurrendersFocusOnKeystroke(true);
		table1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table1.setFont(new Font("Tall Dark And Handsome", Font.PLAIN, 17));
		table1.setModel(new DefaultTableModel(
			new Object[][] {
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
			},
			new String[] {
				"ID", "Full Name", "Birthdate", "Youth Class", "Employed", "SK Voter", "National Voter", "Address"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table1.getColumnModel().getColumn(0).setPreferredWidth(85);
		table1.getColumnModel().getColumn(1).setPreferredWidth(120);
		table1.getColumnModel().getColumn(2).setPreferredWidth(120);
		table1.getColumnModel().getColumn(3).setPreferredWidth(80);
		table1.getColumnModel().getColumn(4).setPreferredWidth(60);
		table1.getColumnModel().getColumn(5).setPreferredWidth(60);
		table1.getColumnModel().getColumn(6).setPreferredWidth(80);
		table1.getColumnModel().getColumn(7).setResizable(false);
		table1.getColumnModel().getColumn(7).setPreferredWidth(150);
		
		
		JToggleButton tglbtn_Advanced = new JToggleButton("Advanced");
		tglbtn_Advanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bscORadv) {
					scrollPane_TableScroll.setViewportView(table1);
					bscORadv = false;
				}				
			}
		});
		tglbtn_Advanced.setFont(new Font("Arial", Font.PLAIN, 11));
		tglbtn_Advanced.setBackground(new Color(255, 255, 255));
		tglbtn_Advanced.setBounds(345, 38, 100, 25);
		panel_TopRight.add(tglbtn_Advanced);

		JToggleButton tglbtn_BasicView = new JToggleButton("Basic View");
		tglbtn_BasicView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!bscORadv) {
					scrollPane_TableScroll.setViewportView(table);
					bscORadv = true;
				}
			}
		});
		tglbtn_BasicView.setFont(new Font("Arial", Font.PLAIN, 11));
		tglbtn_BasicView.setBackground(new Color(255, 255, 255));
		tglbtn_BasicView.setBounds(247, 38, 100, 25);
		panel_TopRight.add(tglbtn_BasicView);
		
		JButton btn_Search = new JButton("Search");
		btn_Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String searchText = textField_Searchbar.getText();
					
					String sqlFetch = "SELECT * FROM `resident` INNER JOIN address ON resident.Address_ID=address.Address_ID WHERE First_Name=? OR Last_Name=?";
					
					Connection conn = user.connect();
					PreparedStatement ps = conn.prepareStatement(sqlFetch);
					ps.setString(1, searchText);
					ps.setString(2, searchText);
		
					ResultSet rs =  ps.executeQuery();
					int rowCounter = 0;
					// REWORK!!! Scrap this idea, what i should do instead is regardless sa value ng bscORadv, ilagay parin sa both tables, para
					// pag mag switch ng view from basic to advanced, nakalagay na agad yung values, to make it seamless.
					if (bscORadv) {
						while (rs.next()) {
							String iD = rs.getString("Res_ID");
							String surname = rs.getString("Last_Name");
							String firstName = rs.getString("First_Name");
							String initial = rs.getString("Mid_Initial");
							String suffix = rs.getString("Suffix");
							String sex = rs.getString("Sex");
							String number = rs.getString("Contact_Num");
							String address = rs.getString("Region") + " " + rs.getString("City/Municipality") + " " + rs.getString("Barangay");
							
							String tblData[] = {iD, surname, firstName, initial, suffix, sex, number, address};
							System.out.println("LALALALALA");
							System.out.println(surname);
							DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
							tblModel.insertRow(rowCounter, tblData);
							rowCounter++;
						}
					}
					else {
						while (rs.next()) {
							
						}
					}
				}
				catch (Exception err) {
					JOptionPane.showMessageDialog(btn_Search, err);
				}
				
			}
		});
		btn_Search.setBackground(new Color(255, 255, 255));
		btn_Search.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_Search.setBounds(161, 38, 76, 25);
		panel_TopRight.add(btn_Search);
		
		frame.setBounds(100, 100, 1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			
	}
}