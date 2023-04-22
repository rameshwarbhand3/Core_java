package com.ram.jdbc;

import java.sql.*;
import java.util.Scanner;
import java.util.*;

public class JdbcDemo8 {
    public static void main(String args[]) throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String jdbc_urls = "jdbc:mysql://localhost:3306/emp_db";
        String user = "root";
        String pwd = "root";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(jdbc_urls, user, pwd);
        String sqlQuery = "insert into Employee values(?,?,?)";

        PreparedStatement pst = con.prepareStatement(sqlQuery);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter employee id : ");
            int id = sc.nextInt();
            System.out.println("Enter Employee first_name :");
            String first_name = sc.next();
            System.out.println("Enter employee salary :");
            int salary = sc.nextInt();
            pst.setInt(1, id);
            pst.setString(2, first_name);
            pst.setInt(3, salary);
            pst.executeUpdate();
            System.out.println("Record inserted successfully.");
            System.out.println("Do you want to insert one more record[yes/No]:");
            String option = sc.next();

            if (option.equalsIgnoreCase("NO")) {
                break;
            }
        }
        con.close();
    }
}