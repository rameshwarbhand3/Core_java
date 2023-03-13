package  com.ram.file_handling;
import java.io.*;
public class PrintstreamDemo {
    public static void main(String args[])throws Exception{
        FileOutputStream fout = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/resources/file7.txt");
        PrintStream pout = new PrintStream(fout);
        pout.println(2016);
        pout.println("java");
        pout.println("JavaTpoint");
        pout.close();
        fout.close();
        System.out.println("Success");
    }
}