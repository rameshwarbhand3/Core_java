package com.ram.multithreading;

class Thread4 extends Thread{
    String str;
    Thread4(String str){
        this.str = str;
    }
    @Override
    public void run() {
        str = str.concat("Software ");
        str = str.concat("Solutions");
        System.out.println(str);
    }
}
class Thread5 extends Thread{
    String str;
    Thread5(String str){
        this.str = str;
    }
    @Override
    public void run() {
        str = str.concat("Software ");
        str = str.concat("Solutions");
        System.out.println(str);
    }
}
class Thread6 extends Thread{
    String str;
    Thread6(String str){
        this.str = str;
    }
    @Override
    public void run() {
        str = str.concat("Software ");
        str = str.concat("Solutions");
        System.out.println(str);
    }
}
public class ThreadSafeDemo {
    public static void main(String[] args) {
        String str = new String("Durga ");
        Thread4 thread4 = new Thread4(str);
        Thread5 thread5 = new Thread5(str);
        Thread6 thread6 = new Thread6(str);


        thread4.setName("Thread-1");
        thread5.setName("Thread-2");
        thread6.setName("Thread-3");


        thread4.start();
        thread5.start();
        thread6.start();
    }
}

