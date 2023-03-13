package com.ram.file_handling;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class BufferedInputStreamUserInputDemo  {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        PrintStream out = System.out;
        BufferedInputStream bis = new BufferedInputStream(in);
        int i = bis.read();
        char ch = (char)i;
        System.out.println("ch = "+ch);
    }
}
