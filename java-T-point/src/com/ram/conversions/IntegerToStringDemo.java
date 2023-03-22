package com.ram.conversions;

public class IntegerToStringDemo {
    public static void main(String args[]) {
        //Using valueof() method
        int i = 200;
        String s = String.valueOf(i);
        System.out.println(i + 100);//300 because + is binary plus operator
        System.out.println(s + 100);

        //Using toString() method
        int j = 200;
        String str = Integer.toString(j);
        System.out.println(j + 100);//300 because + is binary plus operator
        System.out.println(str + 100);

        //Using format() method
        int k=200;
        String s1=String.format("%d",k);
        System.out.println(s1);

    }
}