package com.ram.annotations;
import java.lang.annotation.Documented;

import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;

// User-defined annotation

@Documented

@Retention(RetentionPolicy.RUNTIME)

@ interface AnnotationDemo

{

    String Developer() default "Ravi";

    String Expirydate();

} // will be retained at runtime

// Driver class that uses @AnnotationDemo

public class CustoAnnotationsDemo

{

    @AnnotationDemo(Developer="Ravi", Expirydate="26-03-2020")

    void fun1()

    {

        System.out.println("Demo method 1");

    }

    @AnnotationDemo(Developer="Kiran", Expirydate="26-03-2021")

    void fun2()

    {

        System.out.println("Demo method 2");

    }

    public static void main(String args[])

    {

        System.out.println("Welcome");

    }

}