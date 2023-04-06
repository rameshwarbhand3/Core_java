
package com.ram.java_8_features.stream;
import java.util.*;
class Product1{
    int id;
    String name;
    float price;
    public Product1(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamDemo2 {
    public static void main(String args[]){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(101,"Tv",200f));
        productList.add(new Product(102,"Mobile",500f));

        productList.add(new Product(103,"Computer",700f));

        productList.stream().filter(product->product.price == 500).forEach(product->System.out.printf(product.name));
    }
}