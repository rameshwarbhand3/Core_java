package com.ram.file_handling.serialization;
import java.io.*;
//Implementation of customized serialization.
class Account implements Serializable{
    String username = "durga";
    transient String pwd = "anushka";
    private void writeObject(ObjectOutputStream os)throws Exception{
        os.defaultWriteObject();
        String epwd = "123" + pwd;
        os.writeObject(epwd);
    }
    private  void readObject(ObjectInputStream is)throws Exception{
        is.defaultReadObject();
        String epwd = (String)is.readObject();
        pwd = epwd.substring(3);
    }
}
class CustSerializeDemo{
    public static void main(String args[])throws Exception{
        Account a1 = new Account();
        System.out.println(a1.username +"..."+a1.pwd);
        FileOutputStream fos = new FileOutputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("/home/pranjal/Desktop/workspace/core-java/java-T-point/src/com/ram/file_handling/serialization/ser3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account) ois.readObject();
        System.out.println(a2.username +"..."+a2.pwd);
    }
}