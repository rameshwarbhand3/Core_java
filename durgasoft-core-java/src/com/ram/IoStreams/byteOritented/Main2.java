package com.ram.IoStreams.byteOritented;

import java.io.FileInputStream;
import java.io.IOException;

public class Main2 {
    public static  void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("//home/pranjal/Desktop/workspace/core-java/durgasoft-core-java/src/com/ram/IoStreams/outputStreams/sample.txt");
        byte[] btArray = new byte[fis.available()];
        fis.read(btArray);
        String data = new String(btArray);
        String[] tokens = data.split(" ");
        int count = 0;
        for(String token:tokens){
            if(token.equals("Durga")){
                count++;
            }
        }
        System.out.println("Durga repeated : "+count);
    }
}
