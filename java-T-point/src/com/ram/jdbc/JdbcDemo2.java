package com.ram.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcDemo2 {
    public static void main(String args[]) throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String jdbc_urls = "jdbc:mysql://localhost:3306/emp_db";
        String users = "root";
        String pwds = "root";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(jdbc_urls, users, pwds);
        Statement st = con.createStatement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Employee id :");
            int id = sc.nextInt();
            System.out.println("Enter Employee first_name :");
            String first_name = sc.next();
            System.out.println("Enter Employee salary : ");
            int salary = sc.nextInt();
            String sql_query = String.format("insert into Employee values(%d,'%s',%d)",id,first_name,salary);
            st.executeUpdate(sql_query);
            System.out.println("Record inserted successfully");
            System.out.println("Do you want insert one more record ? [yes/No]");
            String option = sc.next();
            if (option.equalsIgnoreCase("No")) {
                break;
            }
            con.close();
        }

    }
}