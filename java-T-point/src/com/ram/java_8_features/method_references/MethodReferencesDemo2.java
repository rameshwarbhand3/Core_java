
package com.ram.java_8_features.method_references;
import java.util.function.BiFunction;
class Arithmetic{
    public int add(int a,int b){
        return a+b;
    }
}

//Here we refer add method to apply method of Bifunction interface.
public class MethodReferencesDemo2 {
    public static void main(String args[]){
        BiFunction<Integer,Integer,Integer> adder  = new Arithmetic()::add;
        int result  = adder.apply(10,20);
        System.out.println(result);
    }
}