package com.ram.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo4 {
    public static void main(String args[]) throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        String jdbc_urls = "jdbc:mysql://localhost:3306/emp_db";
        String user = "root";
        String  pwds = "root";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(jdbc_urls,user,pwds);
        Statement st = con.createStatement();
        String sql_query = "select * from Employee where salary>200";
        ResultSet rs = st.executeQuery(sql_query);
        System.out.println("id\tfirst_name\tsalary");
        System.out.println("----------------------------");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }
        con.close();
    }
}