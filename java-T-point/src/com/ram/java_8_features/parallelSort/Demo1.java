package com.ram.java_8_features.parallelSort;

import java.util.Arrays;

public class Demo1 {
    public static void main(String args[]){
        int arr[] = {2,3,1,5,20,6,9};
        System.out.println("Array before sorting");
        for(int i : arr){
            System.out.println(i);
        }
        Arrays.parallelSort(arr);

        System.out.println("Array after sorting");
        for(int i : arr){
            System.out.println(i);
        }

        System.out.println("Sort upto 4 index");
        Arrays.parallelSort(arr,0,2);
        for(int i : arr){
        System.out.println(i);
    }
}
}