package com.ram.file_handling;
import java.util.*;
public class ScannerDemo1 {
    public static void main(String args[]){
        String s = "Welcome to javaTpoint";
        Scanner sc = new Scanner(s);
        System.out.println("String :"+sc.nextLine());

        System.out.println("--------Enter Your Details-------- ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        System.out.println("Name: " + name);
        System.out.print("Enter your age: ");
         int i = in.nextInt();
        System.out.println("Age: " + i);

    }
}