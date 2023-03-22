package com.ram.conversions;
public class StringToObjectDemo {
    public static void main(String args[]) throws Exception{
        String s = "hello";

        //Using assignment operator;
        Object obj = s;
        System.out.println(obj);

        //Using Class.forName() method
        Class c = Class.forName("java.lang.String");
        System.out.println("Class name : "+ c.getName());
        System.out.println("SuperClass name : "+c.getSuperclass().getName());

    }
}