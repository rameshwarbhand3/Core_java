package com.ram.multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable r = () ->  System.out.println("This is new thread "+Thread.currentThread().getName());
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is new thread "+Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(r);
        t.start();
        System.out.println("This is main thread " + Thread.currentThread().getName());
    }
}
