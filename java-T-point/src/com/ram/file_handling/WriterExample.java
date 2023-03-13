package com.ram.file_handling;

import java.io.*;

public class WriterExample {
    public static void main(String args[]) {
        try {
            Writer w = new FileWriter("output.txt");
            String content = "I love my country";
            w.write(content);
            w.close();
            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}