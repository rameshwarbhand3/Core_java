package com.ram.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String args[]) {
        Pattern pattern = Pattern.compile("geeks");
        Matcher m = pattern.matcher("geeksforgeeks");
        while (m.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
        }
    }
}