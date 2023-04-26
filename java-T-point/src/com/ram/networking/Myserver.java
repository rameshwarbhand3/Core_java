package com.ram.networking;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver {
    //client sends a text and server receives and prints it.
    public static void main(String args[]) {
        try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("message = "+str);
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}