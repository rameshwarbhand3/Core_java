package com.ram.file_handling.serialization;

import java.io.*;

class Animal implements Serializable {
    int i = 10;
}

class Dog3 extends Animal {
    int j = 20;
}
//if parent implements serialization  chilld no need implement it automatically implement it.
class SerializeDemo1 {
    public static void main(String args[]) throws Exception {
        Dog3 d1 = new Dog3();
        System.out.println(d1.i+"..."+d1.j);
        FileOutputStream fos = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser4.txtx");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis =new FileInputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser4.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog3 d2 = (Dog3)ois.readObject();
        System.out.println(d2.i+"..."+d2.j);
    }
}