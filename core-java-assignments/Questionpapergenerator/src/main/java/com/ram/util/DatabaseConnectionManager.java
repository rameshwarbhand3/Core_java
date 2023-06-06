package com.ram.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Rename anything - shift+fn+f6
//Find and select multiple occurrences of word - ctrl+Alt+shift+J
//Multiple cursors and multiline edit - ctrl+ctrl(hold)+ arrow
//Override and implement all the methods of DBConnectionUtil here to create and close db connection
public class DatabaseConnectionManager implements DBConnectionUtil {

    private Connection connection;

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        DBConfig dbConfig = new DBConfig();
        Class.forName(dbConfig.getDriver());
        connection = DriverManager.getConnection(dbConfig.getJdbcUrl(), dbConfig.getUser(), dbConfig.getPwd());
        return connection;
    }

    @Override
    public void closeConnection() throws SQLException {

        connection.close();
    }
}
