package com.ram.datetime;
import java.time.*;
public class DayOfWeekDemo {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.of(5);
        System.out.println(day.name());
        System.out.println(day.ordinal());
        System.out.println(day.getValue());
    }

}