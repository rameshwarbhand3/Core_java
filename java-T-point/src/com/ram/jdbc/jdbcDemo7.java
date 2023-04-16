package com.ram.jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcDemo7 {
    public static void main(String args[]) throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        String jdbc_urls = "jdbc:mysql://localhost:3306/emp_db";
        String user = "root";
        String pwd = "root";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(jdbc_urls,user,pwd);
        Statement st = con.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        String sql_query = "SELECT * FROM(select id,first_name,salary,rank() over (order by salary DESC) ranking from Employee)
                where ranking="+num;
        ResultSet rs = st.executeQuery(sql_query);

        while (rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }
        con.close();
    }
    }
}