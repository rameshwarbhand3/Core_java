package com.ram.java_8_features.stream;
import java.util.*;
import java.util.stream.Collectors;

class Product3{
    int id;
    String name;
    float price;
    public Product3(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamDemo4 {
    public static void main(String args[]){
        List<Product3> productList = new ArrayList<>();
        productList.add(new Product3(101,"Tv",200f));
        productList.add(new Product3(102,"Mobile",500f));

        productList.add(new Product3(103,"Computer",700f));

        Set<Float>productPriceList = productList.stream().filter(p->p.price < 500).map(p->p.price).collect(Collectors.toSet());
        System.out.println(productPriceList);
    }
}