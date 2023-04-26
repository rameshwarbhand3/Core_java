package com.ram.networking;

import java.net.URL;

public class UrlDemo {
    public static void main(String args[])throws Exception{
        URL url = new URL("https://www.javaTpoint.com/URL-class");
        System.out.println("Protocol : "+url.getProtocol());
        System.out.println("Host name : "+url.getHost());
        System.out.println("Port no. : "+url.getPort());
        System.out.println("File name : "+url.getFile());
        System.out.println("Default port no : "+url.getDefaultPort());

    }
}