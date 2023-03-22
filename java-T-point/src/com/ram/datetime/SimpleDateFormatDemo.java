package com.ram.datetime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDateFormatDemo {
    public static void main(String args[]) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String strdate = formatter.format(date);
        System.out.println(strdate);
        try {
            Date date1 = formatter.parse("31/03/2015");
            System.out.println("Date is: " + date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}