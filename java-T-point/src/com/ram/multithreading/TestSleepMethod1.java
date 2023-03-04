package com.ram.multithreading;

public class TestSleepMethod1 extends Thread {
    public void run(){
        for(int i =1 ;i<5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestSleepMethod1 m1 = new TestSleepMethod1();
        TestSleepMethod1 m2 = new TestSleepMethod1();
        m1.start();
        m2.start();
    }
}
