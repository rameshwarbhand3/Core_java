package com.ram.java_8_features.lambdaexpressions;

interface Drawable{
    public void draw();
}
//without lambda expressions.
public class Lambda_ExpressionsDemo {
    public static void main(String args[]){
        int width = 10;
//        Drawable d = new Drawable() {
//            public void draw() {
//                System.out.println("Drawing" + width);
//            }
//        };
//        d.draw();

        //using lambda expressions.
        Drawable d2 =()->{
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}