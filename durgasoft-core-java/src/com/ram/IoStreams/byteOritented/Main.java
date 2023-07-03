package com.ram.IoStreams.byteOritented;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        FileOutputStream fos = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/durgasoft-core-java/src/com/ram/IoStreams/outputStreams/abc.txt");
        String data = "Hello World";
        byte[] btArray = data.getBytes();
        fos.write(btArray);
        fos.close();
    }
}
