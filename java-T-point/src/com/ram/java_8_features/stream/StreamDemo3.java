
package com.ram.java_8_features.stream;
import java.util.*;
class Product2{
    int id;
    String name;
    float price;
    public Product2(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamDemo3 {
    public static void main(String args[]){
        List<Product2> productList = new ArrayList<>();
        productList.add(new Product2(101,"Tv",200f));
        productList.add(new Product2(102,"Mobile",500f));

        productList.add(new Product2(103,"Computer",700f));

        Product2 productA = productList.stream().max((product1,product3)->product1.price > product3.price ? 1 : -1).get();

        Product2 productB = productList.stream().min((product1,product3)->product1.price > product3.price ? 1 : -1).get();
    }
}


