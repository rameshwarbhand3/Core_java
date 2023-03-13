package com.ram.file_handling;
import java.io.FileWriter;
public class FileWriterDemo {
    public static void main(String args[]){
        try{
            FileWriter fw = new FileWriter("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file1.out");
            fw.write("javaTpoint");
            fw.close();
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Success");
        }
    }
}