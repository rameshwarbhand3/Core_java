package com.ram.file_handling;
import java.io.*;
public class BufferedReaderDemo {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file1.out");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while ((i = br.read()) != -1) {
            System.out.println((char) i);

        }
        br.close();
        fr.close();
    }
}
