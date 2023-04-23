package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Rename anything - shift+fn+f6
//Find and select multiple occurrences of word - ctrl+Alt+shift+J
//Multiple cursors and multiline edit - ctrl+ctrl(hold)+ arrow
//Override and implement all the methods of DBConnectionUtil here to create and close db connection
public class DatabaseConnectionManager implements DBConnectionUtil {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/questiondb";
    private static final String user = "root";
    private static final String pwd = "root";
    private Connection connection;

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        connection = DriverManager.getConnection(jdbcUrl, user, pwd);
        return connection;
    }

    @Override
    public void closeConnection() throws SQLException {

        connection.close();
    }
}
