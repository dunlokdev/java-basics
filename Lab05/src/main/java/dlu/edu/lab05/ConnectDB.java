/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dlu.edu.lab05;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author myloc
 */
public class ConnectDB {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String username = "sa";
            String password = "123";
            String connectionUrl = "jdbc:sqlserver://localhost:1433; databaseName=Product;encrypt=true;trustServerCertificate=true;";
            connection = DriverManager.getConnection(connectionUrl, username, password);
            System.out.println("Connect to database is successful !");
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
