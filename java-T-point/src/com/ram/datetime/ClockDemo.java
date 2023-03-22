package com.ram.datetime;
import java.time.*;
public class ClockDemo {
    public static void main(String args[]){
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());
        System.out.println(c.instant());
    }
}