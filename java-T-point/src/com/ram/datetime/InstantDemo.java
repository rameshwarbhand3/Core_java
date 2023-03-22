package com.ram.datetime;
import java.time.*;
public class InstantDemo {
    public static void main(String args[]){
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}