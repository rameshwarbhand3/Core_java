package com.ram.file_handling;
import java.io.*;
public class CharArrayWriterDemo {
    //To write common data to muliple file
    public static void main(String args[]) throws Exception{
        CharArrayWriter out = new CharArrayWriter();
        out.write("Welocme to javaTpoint");
        FileWriter f1 = new FileWriter("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file3.txt");
        FileWriter f2 = new FileWriter("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file4.txt");
        FileWriter f3 = new FileWriter("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file5.txt");
        FileWriter f4 = new FileWriter("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file6.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Success");
    }
}