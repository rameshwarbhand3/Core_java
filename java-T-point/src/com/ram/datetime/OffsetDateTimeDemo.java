package com.ram.datetime;
import java.time.*;
public class OffsetDateTimeDemo {
    public static void main(String args[]){
        OffsetDateTime dt = OffsetDateTime.now();
        System.out.println(dt.getDayOfMonth());
    }
}