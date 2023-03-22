package com.ram.conversions;
public class LongToStringDemo {
    public static void main(String args[]){
        long l = 9881599218L;
        //Using valueOf method
        String s = String.valueOf(l);
        System.out.println(s);
        //Using toString method
        String s1 = Long.toString(l);
        System.out.println(s1);
    }
}