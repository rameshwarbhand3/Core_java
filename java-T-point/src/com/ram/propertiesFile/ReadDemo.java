package com.ram.propertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDemo {
    public static void main(String args[])throws Exception{
        FileInputStream fis = new FileInputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/propertiesFile/db.properties");
        Properties prop  = new Properties();
        prop.load(fis);
        System.out.println("Jdbc parameters :");
        System.out.println("Driver Class Name : "+prop.getProperty("driverClassName"));
        System.out.println("Url : "+prop.getProperty("url"));
        System.out.println("userName : "+prop.getProperty("userName"));
        System.out.println("Password : "+prop.getProperty("password"));
    }
}