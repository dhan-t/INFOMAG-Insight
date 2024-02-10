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

public class AdminView_BasicTable_page {

	private JFrame frame;
	private JTextField textField_Searchbar;
	private JTable table;

	private boolean bscORadv = true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView_BasicTable_page window = new AdminView_BasicTable_page();
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
	public AdminView_BasicTable_page() {
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
		
		JButton btn_RegisterUser = new JButton("Register");
		btn_RegisterUser.setForeground(new Color(255, 255, 255));
		btn_RegisterUser.setFont(new Font("Arial", Font.BOLD, 14));
		btn_RegisterUser.setBackground(new Color(41, 139, 37));
		btn_RegisterUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_RegisterUser.setBounds(10, 92, 110, 42);
		panel_sidePanel.add(btn_RegisterUser);
		
		JButton btn_UpdateInfo = new JButton("Update");
		btn_UpdateInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_UpdateInfo.setForeground(new Color(255, 255, 255));
		btn_UpdateInfo.setFont(new Font("Arial", Font.BOLD, 14));
		btn_UpdateInfo.setBackground(new Color(56, 56, 56));
		btn_UpdateInfo.setBounds(12, 145, 110, 42);
		panel_sidePanel.add(btn_UpdateInfo);
		
		JButton btn_DeleteInfo = new JButton("Remove");
		btn_DeleteInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_DeleteInfo.setForeground(new Color(255, 255, 255));
		btn_DeleteInfo.setFont(new Font("Arial", Font.BOLD, 14));
		btn_DeleteInfo.setBackground(new Color(219, 43, 57));
		btn_DeleteInfo.setBounds(11, 200, 110, 42);
		panel_sidePanel.add(btn_DeleteInfo);
		
		JPanel panel_TopLeft = new JPanel();
		panel_TopLeft.setBackground(new Color(255, 195, 0));
		panel_TopLeft.setBounds(140, 11, 338, 70);
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
		panel_TopRight.setBackground(new Color(255, 195, 0));
		panel_TopRight.setBounds(555, 11, 499, 70);
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
		
		JButton btn_Search = new JButton("Search");
		btn_Search.setBackground(new Color(255, 255, 255));
		btn_Search.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_Search.setBounds(161, 38, 76, 25);
		panel_TopRight.add(btn_Search);
		
		JToggleButton tglbtn_Advanced = new JToggleButton("Advanced");
		tglbtn_Advanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bscORadv = false;
			}
		});
		tglbtn_Advanced.setFont(new Font("Arial", Font.PLAIN, 11));
		tglbtn_Advanced.setBackground(new Color(255, 255, 255));
		tglbtn_Advanced.setBounds(345, 38, 100, 25);
		panel_TopRight.add(tglbtn_Advanced);
		
		JToggleButton tglbtn_BasicView = new JToggleButton("Basic View");
		tglbtn_BasicView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bscORadv = true;
			}
		});
		tglbtn_BasicView.setFont(new Font("Arial", Font.PLAIN, 11));
		tglbtn_BasicView.setBackground(new Color(255, 255, 255));
		tglbtn_BasicView.setBounds(247, 38, 100, 25);
		panel_TopRight.add(tglbtn_BasicView);
		
		JScrollPane scrollPane_BasicView = new JScrollPane();
		scrollPane_BasicView.setBounds(137, 92, 917, 675);
		frame.getContentPane().add(scrollPane_BasicView);
		
		JScrollPane scrollPane_TableScroll = new JScrollPane();
		scrollPane_TableScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_TableScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_BasicView.setViewportView(scrollPane_TableScroll);
		
		table = new JTable();
		table.setVisible(bscORadv);
		table.setBorder(null);
		table.setSurrendersFocusOnKeystroke(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setFont(new Font("Tall Dark And Handsome", Font.PLAIN, 17));
		scrollPane_TableScroll.setViewportView(table);
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
		frame.setBounds(100, 100, 1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
