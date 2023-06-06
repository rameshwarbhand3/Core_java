package com.ram.multithreading;

public class DaemonThreadDemo extends Thread {
    @Override
    public void run(){
        while(true){
            System.out.println("garbage collector thread : ");
        }
    }
}
 class Main3{
    public static void main(String args[]){
        DaemonThreadDemo daemonThreadDemo = new DaemonThreadDemo();
        daemonThreadDemo.setDaemon(true);
        daemonThreadDemo.start();
        for(int i = 0;i<10;i++){
            System.out.println("JVM thread :");
        }
    }
}
