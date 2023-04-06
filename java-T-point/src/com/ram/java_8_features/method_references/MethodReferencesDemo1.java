package com.ram.java_8_features.method_references;
interface Sayable1{
    void say();
}
public class MethodReferencesDemo1 {
    public void saySomething(){
        System.out.println("This is a non-static method");
    }
    public static void main(String args[]){
        MethodReferencesDemo1 method =  new MethodReferencesDemo1();
        Sayable1 sayable2  = method::saySomething;
        sayable2.say();
//creating anonymous class
        Sayable1 sayable1 = new MethodReferencesDemo1()::saySomething;
        sayable1.say();
    }
}