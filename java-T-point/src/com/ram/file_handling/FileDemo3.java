package com.ram.file_handling;
import java.io.*;
public class FileDemo3 {
    public static void main(String args[]){
        File f = new File("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources");
        String filenames[]  = f.list();
        for(String filename : filenames){
            System.out.println(filename);
        }
    }
}