package insight_pawpatrol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginPage {
	private JFrame frame;
	private JTextField textField_Username;
	private JTextField textField_Password;
	private boolean successfulConn = false;
	private int clearanceLvl;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(22, 22, 22));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(508, 0, 556, 681);
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblInsightTitle = new JLabel("Insight");
		lblInsightTitle.setBounds(103, 85, 355, 65);
		lblInsightTitle.setBackground(new Color(0, 0, 0));
		panel.add(lblInsightTitle);
		lblInsightTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsightTitle.setFont(new Font("Quando", Font.BOLD, 54));
		lblInsightTitle.setForeground(new Color(0, 0, 0));
		
		JPanel panelLoginPanel = new JPanel();
		panelLoginPanel.setBounds(107, 213, 354, 227);
		panel.add(panelLoginPanel);
		panelLoginPanel.setBackground(new Color(255, 195, 0));
		panelLoginPanel.setLayout(null);
		
		textField_Username = new JTextField();
		textField_Username.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_Username.setBounds(27, 32, 301, 40);
		panelLoginPanel.add(textField_Username);
		textField_Username.setColumns(10);
		
		textField_Password = new JTextField();
		textField_Password.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_Password.setColumns(10);
		textField_Password.setBounds(27, 92, 301, 40);
		panelLoginPanel.add(textField_Password);
		
		JButton btn_Login = new JButton("Sign In");
		btn_Login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					String username = textField_Username.getText();
					String password = textField_Password.getText();
					DBManager manager = new DBManager();
					
					String sqlFetch = "SELECT * FROM `brgy credentials` WHERE username=?";
					
					Connection conn = manager.connect();
					PreparedStatement ps = conn.prepareStatement(sqlFetch);
					ps.setString(1, username);
					
					ResultSet rs =  ps.executeQuery();
					while (rs.next()) {
						String username1 = rs.getString("Username");
						System.out.println(username1);
						System.out.println("hey");
						if (username.equals(username1)) {
							System.out.println("correct user");
							String password1 = rs.getString("Password");
							if (password.equals(password1)) {
								clearanceLvl = rs.getInt("Clearance_Lvl");
								System.out.println("Connected");
								successfulConn = true;
								break;
							}
							
							else {
								System.out.println("WRONGPASSWORD");
								break;
							}
						}
					}
					if (successfulConn) {
						if (clearanceLvl == 1) {
							
							manager.setUsername("root"); // implement a way to make specific perms
							manager.setPassword("5wLCmVS9Q2Z4tvVp");
							frame.dispose();
							new BasicView_BasicTable(manager);
						}
					}
						
				} 
				catch (Exception err) {
					JOptionPane.showMessageDialog(null, err);
				}
				
				
			}
		});
		btn_Login.setFont(new Font("Arial", Font.PLAIN, 14));
		btn_Login.setForeground(new Color(255, 255, 255));
		btn_Login.setBackground(new Color(41, 139, 37));
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Login.setBounds(27, 153, 301, 40);
		panelLoginPanel.add(btn_Login);
		
		JLabel lblSignIn = new JLabel("Sign In");
		lblSignIn.setBounds(106, 162, 355, 65);
		lblSignIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignIn.setForeground(new Color(0, 0, 0));
		lblSignIn.setFont(new Font("Arial", Font.ITALIC, 20));
		panel.add(lblSignIn);
		frame.setBackground(new Color(22, 22, 22));
		frame.setBounds(100, 100, 1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}