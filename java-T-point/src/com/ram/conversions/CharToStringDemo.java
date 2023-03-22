package com.ram.conversions;
public class CharToStringDemo {
    public static void main(String args[]){
        char ch = 'c';
        //Using valueOf method.
        String s = String.valueOf(ch);
        System.out.println(s);

        //Using toString method.
        String s1 = Character.toString(ch);
        System.out.println(s1);
    }
}