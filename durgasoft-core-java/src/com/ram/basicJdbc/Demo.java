package com.ram.basicJdbc;
class A{
    void m1(){
        System.out.println("m1-A");
    }
}
class B extends A{
    void m1(){
        System.out.println("m1-B");
    }
}
public class Demo{
    public static void main(String args[]){
        A a = new B();
        B b =  (B) a;
        System.out.println("program run successfully");

    }
}