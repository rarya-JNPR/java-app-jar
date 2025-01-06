package com.example.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    // Introducing vulnerability by allowing user-controlled input
    private static final String DB_URL = System.getProperty("dbUrl", "jdbc:mysql://localhost:3306/mydatabase");
    private static final String USER = System.getProperty("dbUser", "root");
    private static final String PASSWORD = System.getProperty("dbPassword", "password");

    public Connection getConnection() throws SQLException {
        // Vulnerable to SQL Injection if DB_URL is manipulated via user input
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }
}

