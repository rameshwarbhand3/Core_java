package com.ram.exceptionHandling;

public class UserDefinedCheckedExceptionDemo {
    public static void main(String[] args) throws MyCheckedException {
        testCheckedException();
    }

    static void testCheckedException() throws MyCheckedException {
        System.out.println("test checked exception demo");
        throw new MyCheckedException("this checked exception");
    }
}
