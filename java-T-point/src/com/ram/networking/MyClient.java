package com.ram.networking;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String args[])throws Exception{
        try{
            Socket s = new Socket("localhost",6666);
            DataOutputStream dop = new DataOutputStream(s.getOutputStream());
            dop.writeUTF("Hello server");
            dop.flush();
            dop.close();
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}