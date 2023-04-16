package com.ram.jdbc;
import java.sql.*;
public class jdbcDemo1 {
    public static void main(String args[]) throws Exception{
        String driver = "com.mysql.cj.jdbc.";
        String jdbc_urls = "jdbc:mysql:thin:@localhost:1521:XE";
        String users = "scott";
        String pwds = "tiger";
        String sql_query = "CREATE TABLE emp_table1(eno Int,ename VARCHAR(10),first_name VARCHAR(10),last_name VARCHAR(10))";

        Class.forName(driver);
        Connection con = DriverManager.getConnection(jdbc_urls,users,pwds);
        Statement st = con.createStatement();
        st.executeQuery(sql_query);
        System.out.println("Table created successfully");
        con.close();

    }
}