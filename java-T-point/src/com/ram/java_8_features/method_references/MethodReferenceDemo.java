package com.ram.java_8_features.method_references;
interface Sayable{
    void say();
}
public class MethodReferenceDemo {
    public static void saySmething(){
        System.out.println("This is a static method");
    }
    public static void main(String args[]){
        Sayable sayable = MethodReferenceDemo::saySmething;
        sayable.say();
    }
}