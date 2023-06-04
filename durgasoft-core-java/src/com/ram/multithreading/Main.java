package com.ram.multithreading;
class A{
    public void m1(){
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class MyThread1 extends Thread{
    A a;
    MyThread1(A a){
        this.a = a;
    }
    @Override
    public void run() {
        a.m1();
    }
}
class MyThread2 extends Thread{
    A a;
    MyThread2(A a){
        this.a = a;
    }
    @Override
    public void run() {
        a.m1();
    }
}
class MyThread3 extends Thread{
    A a;
    MyThread3(A a){
        this.a = a;
    }
    @Override
    public void run() {
        a.m1();
    }
}
 public class Main {
    public static void main(String[] args) {
        A a = new A();
        MyThread1 mt1 = new MyThread1(a);
        MyThread2 mt2 = new MyThread2(a);
        MyThread3 mt3 = new MyThread3(a);


        mt1.setName("First Thread");
        mt2.setName("Second Thread");
        mt3.setName("Third Thread");


        mt1.start();
        mt2.start();
        mt3.start();
    }
}

