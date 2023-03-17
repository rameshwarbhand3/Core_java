package com.ram.file_handling.serialization;
import java.io.*;
//Example of object graph in serialization.we only serialize Dog2 class other two classes automatically serialize.
class Dog2 implements Serializable{
    Cat c = new Cat();
}
class Cat implements Serializable{
    Rat r = new Rat();
}
class Rat implements  Serializable{
    int j  = 20;
}
class SerializeDemo2{
    public static void main(String args[])throws Exception{
        Dog2 d1 = new Dog2();
        FileOutputStream fos = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog2 d2 = (Dog2)ois.readObject();
        System.out.println(d2.c.r.j);
    }
}