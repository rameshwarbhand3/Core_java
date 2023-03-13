package com.ram.file_handling;
import java.io.*;
public class CharArrayReaderDemo{
    public static void main(String args[]) throws Exception{
        char[]ary = {'j','a','v','a'};
        CharArrayReader reader = new CharArrayReader(ary);
        int i = 0;
        while((i=reader.read())!=-1){
            char ch = (char)i;
            System.out.println(ch+":"+i);
          
        }
    }
}
