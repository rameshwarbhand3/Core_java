package com.ram.java_8_features.lambdaexpressions;
interface Sayable{
    public String say(String name);
}
public class LambdaExpressionsDemo3 {
    public static void main(String args[]){
        Sayable s1 = (name)->{
            return "Hello "+name;
        };
        System.out.println(s1.say("Ram"));

        Sayable s2 = (name)->{
            return "Hello "+name;
        };
        System.out.println(s2.say("Sham"));
    }
}