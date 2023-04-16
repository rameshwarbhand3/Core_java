package com.ram.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo6 {
    public static void main(String args[]) throws Exception{
    String driver = "com.mysql.cj.jdbc.Driver";
    String jdbc_urls = "jdbc:mysql://localhost:3306/emp_db";
    String user = "root";
    String pwd = "root";
        Class.forName(driver);
    Connection con = DriverManager.getConnection(jdbc_urls,user,pwd);
    Statement st = con.createStatement();
    String sql_query = "select min(salary) from Employee";
    ResultSet rs = st.executeQuery(sql_query);
        while (rs.next()){
        System.out.println("The max salary of Employee:"+rs.getInt(1));
    }
        con.close();
}
}