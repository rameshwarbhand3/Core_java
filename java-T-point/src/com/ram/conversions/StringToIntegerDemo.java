package com.ram.conversions;
public class StringToIntegerDemo {
    public static void main(String args[]){
        String str = "200";
         //Using Integer.parseInt() method
        System.out.println(Integer.parseInt(str));

        //Using Integer.valueof() method
        System.out.println(Integer.valueOf(str));
    }
}