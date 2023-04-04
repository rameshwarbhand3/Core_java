package com.ram.java_8_features;
interface Sayabale{
    public String say();
}
public class Lambda_ExpressionDemo2 {
    public static void main(String args[]){
        Sayabale s = ()->{
            return "I have to say something";
        };
        System.out.println(s.say());
//        Sayable s = new Sayabale() {
//            @Override
//            public String say() {
//                return "I have to say something";
//            }
//        };
//        System.out.println(s.say());
    }
}