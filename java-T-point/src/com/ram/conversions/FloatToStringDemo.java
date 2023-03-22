package com.ram.conversions;
public class FloatToStringDemo {
    public static void main(String args[]){
        float f = 23.6f;
        String s = String.valueOf(f);
        System.out.println(s);

        String s1 = Float.toString(f);
        System.out.println(s1);

    }
}