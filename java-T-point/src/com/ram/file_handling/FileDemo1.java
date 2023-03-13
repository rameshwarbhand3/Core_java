package com.ram.file_handling;
import java.io.*;
public class FileDemo1 {
    public static void main(String[] args) {

        String path = "";
        boolean bool = false;
        try {
            // createing  new files
            File file  = new File("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file10.txt");
            file.createNewFile();
            System.out.println(file);
            // createing new canonical from file object
//            File file2 = file.getCanonicalFile();
//            // returns true if the file exists
//            System.out.println(file2);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }