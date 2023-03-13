package com.ram.file_handling;
import java.io.*;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Name is : "+name);
    }
}