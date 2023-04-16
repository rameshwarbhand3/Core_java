package com.ram.jdbc;
import java.sql.*;
import java.util.*;
public class JdbcDemo5 {
    public static void main(String args[]) throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        String jdbc_urls = "jdbc:mysql://localhost:3306/emp_db";
        String user = "root";
        String pwd = "root";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(jdbc_urls,user,pwd);
        Statement st = con.createStatement();
        String sql_query = "select id,first_name from Employee";
        ResultSet rs = st.executeQuery(sql_query);
        System.out.println("id\tfirst_name");
        System.out.println("-------------------------");
        while (rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
        }
        con.close();
    }
}