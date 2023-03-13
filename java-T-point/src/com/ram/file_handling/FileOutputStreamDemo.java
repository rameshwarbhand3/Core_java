package com.ram.file_handling;
import java.io.FileOutputStream;
public class FileOutputStreamDemo {
    public static void main(String args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\textout.txt");
            String s = "Welcome to javaTpoint";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}