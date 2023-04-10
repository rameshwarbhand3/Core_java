package com.ram.java_8_features.interfacePrivateMethod;
interface Sayable{
    default void say(){
        saySomething();
        sayPolitely();
    }
    private void saySomething(){
        System.out.println("This is a private method");
    }
    private static void sayPolitely(){
        System.out.println("This is a static method");
    }
}
public class Demo2 implements Sayable{
    public static void main(String args[]){
        Sayable s = new Demo2();
        s.say();
    }
}