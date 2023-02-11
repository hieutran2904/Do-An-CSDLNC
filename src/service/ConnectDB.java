/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class ConnectDB {
    public static Connection getConnection(){
        
        try {
            Connection conn = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=DoAnCSDLNC;username=sa;password=123456");
            //conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-KJNF2QE\\SQLEXPRESS:1433;databasename=DoAnOOPKho;username=sa;password=123456");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
