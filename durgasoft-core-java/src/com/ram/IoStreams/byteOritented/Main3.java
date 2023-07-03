package com.ram.IoStreams.byteOritented;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("/home/pranjal/Desktop/workspace/core-java/durgasoft-core-java/src/com/ram/IoStreams/outputStreams/abc.txt");
        FileOutputStream fos = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/durgasoft-core-java/src/com/ram/IoStreams/outputStreams/sample.txt");
        byte[] btArray = new byte[fis.available()];
        fis.read(btArray);
        fos.write(btArray);
        System.out.println("Text copied from abc.txt to sample.txt");

    }
}
