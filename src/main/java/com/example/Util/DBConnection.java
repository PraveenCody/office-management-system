package com.example.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private final static String url = "jdbc:mysql://localhost:3306/info";
    private final static String name = "root";
    private final static String pass = "Root@123";

    public static Connection getConn() throws SQLException{

        try {
            Connection conn = DriverManager.getConnection(url,name,pass);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
