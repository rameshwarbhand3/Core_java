package com.ram.conversions;

public class StringToCharDemo {
    public static void main(String args[]) {
        //Using charAt() method
        String s = "hello";
        for(int i = 0;i<s.length();i++){
            System.out.println("char at " + i + " index is " + s.charAt(i));
        }
        System.out.println("1st character is : " + s.charAt(0));
        //Using toCharArray method
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println("char at " + i + " index is " + ch[i]);

        }
    }
}