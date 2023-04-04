package com.ram.generics;

import java.util.ArrayList;
import java.util.List;

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
        MyGen<Integer> m = new MyGen<>();
        List<Integer> l = new ArrayList<>();
        m.add(20);
        System.out.println(m.get());
    }
}