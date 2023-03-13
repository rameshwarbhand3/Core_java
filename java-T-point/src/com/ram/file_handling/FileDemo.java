package com.ram.file_handling;

import java.io.File;

public class FileDemo {
    public static void main(String args[])throws Exception{
        File f = new File("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file9.txt");
        if(f.createNewFile()){
            System.out.println("New file is created");
        }
        else{
            System.out.println("File already exists");
        }
    }
}