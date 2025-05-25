package com.lms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/lms";
    private static Connection connection = null;
    private static final Properties props = new Properties();

    static {
        props.put("user", "root");  // Change this to your MySQL username
        props.put("password", "");  // Change this to your MySQL password
        props.put("useSSL", "false");
        props.put("autoReconnect", "true");
    }

    private DBConnection() {}

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, props);
                System.out.println("Database connection established successfully!");
            } catch (ClassNotFoundException e) {
                System.err.println("MySQL JDBC Driver not found. Please add mysql-connector-java to your classpath.");
                e.printStackTrace();
            } catch (SQLException e) {
                System.err.println("Error connecting to database: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed successfully!");
            } catch (SQLException e) {
                System.err.println("Error closing database connection: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
