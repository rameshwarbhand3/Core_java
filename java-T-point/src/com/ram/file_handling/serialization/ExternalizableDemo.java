package com.ram.file_handling.serialization;
import java.io.*;

//In serialization all object will be serialized.
//In Externalization only part of object serialized.
public class ExternalizableDemo implements Externalizable {
    String s;
    int i;
    int j;
    public ExternalizableDemo(){
        System.out.println("public no-arg constructor");
    }
    public ExternalizableDemo(String s,int i,int j){
        this.s = s;
        this.i = i;
        this.j = j;
    }
    public void writeExternal(ObjectOutput out)throws IOException{
        out.writeObject(s);
        out.writeInt(i);
    }
    public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException{
        s = (String)in.readObject();
        i = in.readInt();
    }
    public static void main(String args[])throws Exception{
        ExternalizableDemo t1  = new ExternalizableDemo("durga",10,20);
        System.out.println(t1.s+"..."+t1.i+"..."+t1.j);
        FileOutputStream fos = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser5.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t1);

        FileInputStream fis = new FileInputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser5.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizableDemo t2 = (ExternalizableDemo) ois.readObject();
        System.out.println(t2.s+"..."+t2.i+"..."+t2.j);
    }
}