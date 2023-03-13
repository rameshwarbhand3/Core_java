package com.ram.file_handling;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo{
    public static void main(String args[]) throws Exception {
        FileWriter writer = new FileWriter("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file2.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("java");
        buffer.close();
        System.out.println("Success");
    }
}