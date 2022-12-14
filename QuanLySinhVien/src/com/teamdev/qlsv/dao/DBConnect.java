/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teamdev.qlsv.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dunlok
 */
public class DBConnect {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String username = "sa";
            String password = "123";
            String connectionUrl = "jdbc:sqlserver://localhost:1433; databaseName=QuanLySinhVien;encrypt=true;trustServerCertificate=true;";
            connection = DriverManager.getConnection(connectionUrl, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
