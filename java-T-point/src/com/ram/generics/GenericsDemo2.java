package com.ram.generics;
class MyGen <T>{
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return obj;
    }
}
public class GenericsDemo2 {
    public static void main(String args[]){
        MyGen<Integer> m = new MyGen<Integer>();
        m.add(20);
        System.out.println(m.get());
    }
}