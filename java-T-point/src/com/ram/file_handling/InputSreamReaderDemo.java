package com.ram.file_handling;
import java.io.*;
public class InputSreamReaderDemo {
    public static void main(String args[]){
        try {
            InputStream stream = new FileInputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file8.txt");
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.println((char)data);
                data = reader.read();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}





