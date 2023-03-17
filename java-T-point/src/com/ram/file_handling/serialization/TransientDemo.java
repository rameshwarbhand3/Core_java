package com.ram.file_handling.serialization;
import java.io.*;
class Dog1 implements Serializable{
   transient int i = 10;
   transient int j = 20;
}
class TransientDemo{
    public static void main(String args[]) throws Exception{
        Dog1 d1 = new Dog1();
        FileOutputStream fos = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog1 d2 = (Dog1)ois.readObject();

        System.out.println(d2.i + "..."+ d2.j);
    }
}