package com.ram.propertiesFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDemo {
    public static void main(String args[]) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("driverClassName", "oracle.jdbc.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:XE");
        prop.setProperty("userName", "System");
        prop.setProperty("password", "Durga");
        FileOutputStream fout = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/propertiesFile/db.properties");
        prop.store(fout, "jdbc parameters");
        System.out.println("Data successfully added to the file");
        fout.close();
    }
}