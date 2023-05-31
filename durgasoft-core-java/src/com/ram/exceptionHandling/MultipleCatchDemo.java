package com.ram.exceptionHandling;

public class MultipleCatchDemo {
    public static void main(String args[]) {
        final int result = testException(0);
        System.out.println(result);
    }

    private static int testException(int input) {
        try {
            float f = 10 / input;
//            Date d = null;
//            System.out.println(d.toString());
//            int[] arr = new int[]{1, 2, 3, 4};
//            System.out.println(arr[5]);
            return (int) f;
        } catch (ArithmeticException ex) {
            System.out.println("Sorry boss this is not valid operation");
        } finally {
            System.out.println("finally block");
        }
    return 0;
    }
}
