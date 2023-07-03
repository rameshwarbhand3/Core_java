package com.ram.IoStreams.byteOritented;

import java.io.FileInputStream;
import java.io.IOException;

public class Main1 {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("/home/pranjal/Desktop/workspace/core-java/durgasoft-core-java/src/com/ram/IoStreams/outputStreams/abc.txt");
        int size = fis.available();
        byte[] btArray = new byte[size];
        fis.read(btArray);
        String data = new String(btArray);
        System.out.println(data);
        fis.close();
    }
}
