package com.ram.java_8_features.functional_interface;
interface Doable{
    default void doIt(){
        System.out.println("do it now");
    }
}
interface Sayable extends Doable{
    public void say(String msg);
}
public class FunctionalInterfaceDemo2 implements  Sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String args[]){
        Sayable sayable = new FunctionalInterfaceDemo2();
        sayable.say("Hello java");
        sayable.doIt();
    }
}