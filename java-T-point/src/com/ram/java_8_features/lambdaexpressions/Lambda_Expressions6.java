package com.ram.java_8_features.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Lambda_Expressions6 {
    public static void main(String args[]) {
        List<Item> al = new ArrayList<Item>();
        al.add(new Item(101, "Mobile", 10000f));
        al.add(new Item(102, "Laptop", 50000f));
        al.add(new Item(103, "Headphone", 1000f));
        System.out.println("Sorting on the basis of name :");

        Collections.sort(al,(p1,p2)->{
                return p1.name.compareTo(p2.name);
        });
        for(Item p : al){
            System.out.println(p.id +" "+p.name+" "+p.price);
        }
    }
}