package com.ram.java_8_features.factoryMethods;
import java.util.Set;
public class SetDemo {
    public static void main(String args[]){
        Set<String>set = Set.of("java","fx","servelet","jason");
        for(String s : set){
            System.out.println(s);
        }
    }
}