package com.ram.basicJdbc;

import java.sql.*;

public class EmpDbSample {

    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "emp_db";
    public static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
    private static final String DB_USER_NAME = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Class.forName(DRIVER_CLASS_NAME);
            //here emp_db is database name, root is username and password
            Connection con = DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Employee");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
            }
            //System.out.println("inserting records to db");
            //stmt.execute("insert into Employee values(3, 'pranjal', 20000)");
//            PreparedStatement preparedStatement = con.prepareStatement("insert into Employee values(?,?,?)");
//            preparedStatement.setInt(1, 4);
//            preparedStatement.setString(2, "Shubham");
//            preparedStatement.setInt(3, 14000);
//            preparedStatement.execute();
//            System.out.println("records inserted to db successfully");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}  