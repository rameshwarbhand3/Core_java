package com.ram.java_8_features.functional_interface;
interface Sayable3{
    void say();
}
public class FunctionalInterfaceDemo implements Sayable3{
    public void say(){
        System.out.println("say method");
    }
    public static void main(String args[]){
        Sayable3 sayable = new FunctionalInterfaceDemo();
        sayable.say();
    }
}