package com.ram.file_handling;

import java.io.*;

public class BufferedOutputStreamDemo {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/filewriteDemo.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to javaTpoint.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}