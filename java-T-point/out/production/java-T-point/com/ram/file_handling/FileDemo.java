 package com.ram.file_handling;
import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        File f=new File("/home/pranjal/Desktop/workspace/core-java/java-T-point/out/production/java-T-point/com/ram/file_handling/resources");
        String filenames[]=f.list();
        for(String filename:filenames){
            System.out.println(filename);
        }
    }
}