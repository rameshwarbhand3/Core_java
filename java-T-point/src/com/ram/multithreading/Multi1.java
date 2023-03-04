package com.ram.multithreading;

public class Multi1 implements Runnable {
    public void run(){
        System.out.println("System is running...");
    }
    public static void main(String args[]){
        Multi1 r = new Multi1();
        Thread t1 = new Thread(r);
        t1.start();
    }
}
