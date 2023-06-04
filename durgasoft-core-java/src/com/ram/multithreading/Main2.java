package com.ram.multithreading;
class WelcomeThread1 extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("welcome thread : "+i);
        }
    }
}

public class Main2 {
    public static  void main(String args[]){
        WelcomeThread1 welcomeThread = new WelcomeThread1();
        welcomeThread.start();
        try {
            welcomeThread.join();
            for(int i = 0; i < 10; i++){
                System.out.println("MainThread : "+i);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
