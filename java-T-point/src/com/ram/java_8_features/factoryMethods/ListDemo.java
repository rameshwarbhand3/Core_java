package com.ram.java_8_features.factoryMethods;
import java.util.*;
public class ListDemo {
    public static void main(String args[]){
        List<String>list = List.of("java","spring","hibernate","jsp");
        for(String l : list){
            System.out.println(l);
        }
    }
}