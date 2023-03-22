package com.ram.datetime;
import java.time.*;
public class LocalTimeDemo {
    public static void main(String args[]){
        LocalTime time = LocalTime.now();
        System.out.println("Time is : "+time);

        LocalTime time1 = LocalTime.of(10,40,12);
        System.out.println(time1);
        LocalTime time2=time1.minusHours(2);
        LocalTime time3=time2.plusMinutes(18);
        System.out.println(time3);

    }
}