package com.ram.generics;
import java.util.*;
public class GenericsDemo {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Rahul");
        al.add("Ram");
        //al.add(32); shows compilation error.Before generics
        String s = al.get(1);
        System.out.println(s);
        Iterator<String>itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}