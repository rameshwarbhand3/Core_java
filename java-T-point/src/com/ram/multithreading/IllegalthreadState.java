package com.ram.multithreading;

public class IllegalthreadState extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String args[]){
        IllegalthreadState t1 = new IllegalthreadState();
        t1.start();
        t1.start();
    }
}
