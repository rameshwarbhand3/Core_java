package com.ram.file_handling;

import java.io.FileReader;
public class FileReaderDemo{
    public static void main(String args[]) throws Exception{
        FileReader fr = new FileReader("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file1.out");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
            fr.close();
        }
    }
}