/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insight_flatlaf_revamp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author cleru
 */
public class DBManager {
    private String username = "";
    private String password = "";
    private int clearanceLvl;
    
    public int getClearanceLvl() {
        return clearanceLvl;
    }

    public void setClearanceLvl(int clearanceLvl) {
        this.clearanceLvl = clearanceLvl;
    }

    private final String clearanceUsername = "clearanceCheck";
    private final String clearancePassword = "1234";

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
