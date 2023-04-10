package com.ram.java_8_features.factoryMethods;
import java.util.*;
public class MapDemo {
    public static void main(String args[]){
        Map<Integer,String>map = Map.of(101,"Ram",102,"Sham",103,"Ajay");
        for(Map.Entry<Integer,String>m : map.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
    }
}