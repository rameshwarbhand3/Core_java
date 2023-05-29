package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DBConfig {
    private final String driver;
    private final String jdbcUrl;
    private final String user;
    private final String pwd;

    public DBConfig() {
        final Properties properties = loadProperties();
        this.driver = properties.getProperty("driverClassName");
        this.jdbcUrl = properties.getProperty("url");
        this.user = properties.getProperty("username");
        this.pwd = properties.getProperty("password");
    }


    private Properties loadProperties() {
        try {
            File file = new File(this.getClass().getResource("/application.properties").toURI());
            FileInputStream fis = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fis);
            return prop;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getDriver() {
        return driver;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }
}
