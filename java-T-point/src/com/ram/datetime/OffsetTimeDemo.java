package com.ram.datetime;
import java.time.*;
public class OffsetTimeDemo {
    public static void main(String args[]){
        OffsetTime offset = OffsetTime.now();
        int h = offset.getHour();
        int m = offset.getMinute();
        System.out.println(h+".."+m);
    }
}