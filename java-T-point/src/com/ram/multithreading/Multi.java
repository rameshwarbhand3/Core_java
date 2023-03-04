package com.ram.multithreading;

public class Multi extends Thread {
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String args[]){
        Multi m = new Multi();
        m.start();
    }
}
