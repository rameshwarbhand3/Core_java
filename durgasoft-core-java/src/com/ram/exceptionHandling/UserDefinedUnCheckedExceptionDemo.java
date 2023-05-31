package com.ram.exceptionHandling;

public class UserDefinedUnCheckedExceptionDemo {
    public static void main(String[] args) {
        testUnCheckedException();
    }

    static void testUnCheckedException() {
        System.out.println("test unchecked exception demo");
        throw new MyUnCheckedException("this is un checked exception");
    }
}
