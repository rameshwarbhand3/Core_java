package com.ram.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo3 {
    public static void main(String args[])throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        String jdbc_urls = "jdbc:mysql://localhost:3306/emp_db";
        String user = "root";
        String pwds = "root";

        Class.forName(driver);
        Connection con = DriverManager.getConnection(jdbc_urls,user,pwds);
        Statement st = con.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cutoff salary : ");
        int cutoff = sc.nextInt();
        String sql_query = String.format("delete from Employee where salary>=%d",cutoff);
        int updateCount = st.executeUpdate(sql_query);
        System.out.println("The number rows deleted : "+updateCount);
        System.out.println("Rows deleted successfully : ");
        con.close();
    }
}