package com.ram.java_8_features.dafault_methods;
abstract class Abstractclass{
    public Abstractclass(){
        System.out.println("This is a abstract class");
    }
    abstract int add(int a,int b);//Abstract method.
    int sub(int a,int b){    //Instance method.
        return a-b;
    }
    static int multiply(int a,int b){ //static method
        return a*b;
    }

}

public class DefaultMethodsDemo1 extends Abstractclass {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        DefaultMethodsDemo1 demo = new DefaultMethodsDemo1();
      int result =   demo.add(10, 20);
       int result1 =  demo.sub(20, 10);
        int result2 = Abstractclass.multiply(10, 20);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}