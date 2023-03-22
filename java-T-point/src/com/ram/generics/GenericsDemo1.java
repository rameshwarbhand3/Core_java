package com.ram.generics;
import java.util.*;
public class GenericsDemo1 {
    public static <E> void printArray(E[] Elements) {
        for (E element : Elements) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer[] intArray = {2,3,4,5,5};
        Character[] charArray = {'j','a','v','a','T','p','o','i','n','t'};
        System.out.println("Printing Integer array");
        printArray(intArray);

        System.out.println("printing Character array");
        printArray(charArray);
    }
}