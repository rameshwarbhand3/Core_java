package com.ram.jdbc;
import java.sql.*;
public class JdbcDemo1 {
    public static void main(String args[]) throws Exception{
        String driver =  "com.mysql.cj.jdbc.Driver";
        String jdbc_urls = "jdbc:mysql://localhost:3306/testDb";
        String users = "root";
        String pwds = "root";
        String sql_query = "CREATE TABLE emp(eno Int,ename VARCHAR(10),first_name VARCHAR(10),last_name VARCHAR(10))";

        Class.forName(driver);
        Connection con1 = DriverManager.getConnection(jdbc_urls,users,pwds);
        Statement st = con1.createStatement();
        st.executeUpdate(sql_query);
        System.out.println("Table created successfully");
        con1.close();

    }
}