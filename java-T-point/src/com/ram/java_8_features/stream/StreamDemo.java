package com.ram.java_8_features.stream;
import java.util.*;
class Product{
    int id;
    String name;
    float price;
    public Product(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamDemo {
    public static void main(String args[]){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(101,"Tv",200f));
        productList.add(new Product(102,"Mobile",500f));

        productList.add(new Product(103,"Computer",700f));

        List<Float>productPriceList = new ArrayList<>();
        for(Product product : productList){
            if(product.price < 600){
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);
    }
}