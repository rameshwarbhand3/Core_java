package com.ram.exam23mar2023;

class A {
    int i = 10;
    static int j = 10;
}

public class Example1 {
    public static void main(String args[]) {
        A a1 = new A();
        System.out.println(a1.i + " " + a1.j);
        a1.i = a1.i + 1;
        a1.j = a1.j + 1;
        A.j= A.j+1;
        A a2 = new A();
        System.out.println(a1.i + " " + a1.j);

        System.out.println(a2.i + " " + a2.j);
    }
}