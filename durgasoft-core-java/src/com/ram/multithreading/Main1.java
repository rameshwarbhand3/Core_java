package com.ram.multithreading;

class WelcomeThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Welcome To Durga Software Solutions");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
public class Main1{
    public static void main(String[] args) {
        WelcomeThread welcomeThread = new WelcomeThread();
        welcomeThread.start();
    }
}
