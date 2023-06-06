package com.ram.multithreading;

class A1{
    synchronized void m1(){
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class Thread1 extends Thread{
    A1 a;
    Thread1(A1 a){
        this.a = a;
    }
    @Override
    public void run() {
        a.m1();
    }
}
class Thread2 extends Thread{
    A1 a;
    Thread2(A1 a){
        this.a = a;
    }
    @Override
    public void run() {
        a.m1();
    }
}
class Thread3 extends Thread{
    A1 a;
    Thread3(A1 a){
        this.a = a;
    }
    @Override
    public void run() {
        a.m1();
    }
}
public class SynchronizedMethodDemo {
    public static void main(String[] args) {
        A1 a = new A1();


        Thread1 t1 = new Thread1(a);
        Thread2 t2 = new Thread2(a);
        Thread3 t3 = new Thread3(a);


        t1.setName("AAA");
        t2.setName("BBB");
        t3.setName("CCC");


        t1.start();
        t2.start();
        t3.start();




    }
}

