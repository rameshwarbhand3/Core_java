package com.ram.java_8_features.stream;
import java.util.*;
import java.util.stream.Collectors;

class Products{
    int id;
    String name;
    float price;
    public Products(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamDemo1 {
    public static void main(String args[]) {
        List<Products> productList = new ArrayList<>();
        productList.add(new Products(101, "Tv", 200f));
        productList.add(new Products(102, "Mobile", 500f));

        productList.add(new Products(103, "Computer", 700f));

        List<Float> productPriceList = productList.stream().
                filter(p -> p.price > 300).map(p -> p.price).collect(Collectors.toList());

        System.out.println(productPriceList);
    }
}
