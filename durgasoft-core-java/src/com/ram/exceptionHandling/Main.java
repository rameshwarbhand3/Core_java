package com.ram.exceptionHandling;

public class Main {
    public static void main(String args[]) {
        try {
            float f = 100 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
            System.out.println(e);
            System.out.println();
            System.out.println(e.getMessage());

        }finally {

        }
    }
}
