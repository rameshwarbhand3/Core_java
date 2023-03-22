package com.ram.datetime;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {
    public static void main(String args[]){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);
    }
}
