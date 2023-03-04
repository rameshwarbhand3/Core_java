package com.ram.multithreading;

public class Multi3 implements Runnable {
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String args[]){
        Multi3 m1 = new Multi3();
        Thread th1 = new Thread(m1,"My new thread");
        th1.start();
        String str = th1.getName();
        System.out.println(str);
    }
}
