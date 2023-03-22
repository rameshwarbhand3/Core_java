package com.ram.conversions;
import java.text.SimpleDateFormat;
import java.util.Date;
public  class DateToStringDemo {
    public static void main(String args[]){
            Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String s = formatter.format(date);
        System.out.println(s);
    }
}