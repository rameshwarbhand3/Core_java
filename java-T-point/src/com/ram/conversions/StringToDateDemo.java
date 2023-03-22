package com.ram.conversions;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDateDemo {
    public static void main(String args[]) {
        try {
            String date = "31/12/2022";
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date d1 = formatter.parse(date);
            System.out.println(d1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}