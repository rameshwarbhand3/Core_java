package com.ram.file_handling;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/textout.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}