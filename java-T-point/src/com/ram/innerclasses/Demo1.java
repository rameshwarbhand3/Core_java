package com.ram.innerclasses;
class A{
    void m1(){
        class B{
            void m2(){
                System.out.println("m2-B");
            }
            void m3(){
                System.out.println("m3-B");
            }
        }
        B b = new B();
        b.m2();
        b.m3();
    }
}
public class Demo1 {
    public static void main(String args[]){
        A a = new A();
        a.m1();
    }
}