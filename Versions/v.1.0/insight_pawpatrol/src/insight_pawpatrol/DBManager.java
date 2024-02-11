package insight_pawpatrol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class DBManager {
	String username = "";
	String password = "";
	
	
	public DBManager (String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iyouth", this.username, this.password);
			System.out.println("Connected");
			return conn;
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
}