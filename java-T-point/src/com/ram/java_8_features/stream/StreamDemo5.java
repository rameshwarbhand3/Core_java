package com.ram.java_8_features.stream;
import java.util.*;
import java.util.stream.Collectors;

class Product5{
    int id;
    String name;
    float price;
    public Product5(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamDemo5 {
    public static void main(String args[]){
        List<Product5> productList = new ArrayList<>();
        productList.add(new Product5(101,"Tv",200f));
        productList.add(new Product5(102,"Mobile",500f));

        productList.add(new Product5(103,"Computer",700f));

        Map<Integer,String>productPriceListMap = productList.stream().collect(Collectors.toMap(p->p.id,p->p.name));

        System.out.println(productPriceListMap);
    }
}