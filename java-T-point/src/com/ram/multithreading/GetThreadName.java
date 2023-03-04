package com.ram.multithreading;
public class GetThreadName extends Thread{
    public void run(){
        System.out.println("Task first is printed by :"+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        System.out.println("Hello is printed by : "+Thread.currentThread().getName());
        GetThreadName t = new GetThreadName();
        t.setName("ram");
        t.start();
        GetThreadName t1 = new GetThreadName();
        t1.setName("java");
        t1.start();
    }
}