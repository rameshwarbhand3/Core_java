package com.ram.java_8_features.lambdaexpressions;
import java.util.*;
public class Lambda_Expressions5 {
    public static void main(String args[]){
        List<String> l = new ArrayList<String>();
        l.add("Ram");
        l.add("Sham");
        l.add("Akash");

        l.forEach((n)->System.out.println(n));
    }
}