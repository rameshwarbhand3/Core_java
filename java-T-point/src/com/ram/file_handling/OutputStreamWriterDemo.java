package com.ram.file_handling;
import java.io.*;
public class OutputStreamWriterDemo {
    public static void main(String args[]){
        try{
            OutputStream outputStream = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file8.txt");
            Writer outputstreamwriter = new OutputStreamWriter(outputStream);
            outputstreamwriter.write("Hello world");
            outputstreamwriter.close();
        }catch(Exception e){
            e.getMessage();
        }
    }
}