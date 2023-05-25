package com.ram.annotations;

import java.io.*;

@interface book_data {
    String book_name() default "Effective java";

    String author() default "josses bal-och";

    int book_price() default 30;
}

@book_data


public class CustomAnnotationsDemo {
    public static void main(String args[]) {
        System.out.println("Annotations using default values");
    }
}