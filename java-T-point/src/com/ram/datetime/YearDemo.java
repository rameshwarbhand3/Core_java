package com.ram.datetime;
import java.time.*;
public class YearDemo {
    public static void main(String args[]){
        Year yr = Year.now();
        System.out.println(yr);
        LocalDate l = yr.atDay(100);
        System.out.println(l);
        Year t = Year.of(2024);
        System.out.println(t.length());
        System.out.println(t.isLeap());
    }
}