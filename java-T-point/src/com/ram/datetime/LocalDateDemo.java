package com.ram.datetime;
import java.time.*;
public class LocalDateDemo {
    public static void main(String args[]){
        LocalDate date = LocalDate.now();
        System.out.println("Today : "+ date);
        LocalDate yesterday = date.minusDays(1);
        System.out.println("Yesterday : "+ yesterday);
        LocalDate tommarrow = date.plusDays(2);
        System.out.println("Tommarrow : "+ tommarrow);

        String dInStr = "2011-09-01";
        LocalDate d1 = LocalDate.parse(dInStr);
        System.out.println("String to LocalDate : " + d1);
    }
}