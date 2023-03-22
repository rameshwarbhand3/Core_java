package com.ram.datetime;
import java.util.*;
public class CalenderDemo {
    public static void main(String args[]){
        Calendar calendar = Calendar.getInstance();
        System.out.println("present day,date and time is : "+calendar.getTime());
        System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("At present Calendar's Year: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DAY_OF_MONTH));
    }
}