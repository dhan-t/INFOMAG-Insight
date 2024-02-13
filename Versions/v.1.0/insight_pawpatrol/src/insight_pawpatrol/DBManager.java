package insight_pawpatrol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class DBManager {
	String username = "";
	String password = "";
	
	private String clearanceUsername = "clearanceCheck";
	private String clearancePassword = "1234";
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public DBManager () {
		this.username = this.clearanceUsername;
		this.password = this.clearancePassword;
	}

	public Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iyouth", this.username, this.password);
			return conn;
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
}