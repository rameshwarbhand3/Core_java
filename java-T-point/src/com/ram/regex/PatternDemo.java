package com.ram.regex;
import java.util.regex.Pattern;
public class PatternDemo {
    public static void main(String args[]){
        System.out.println(Pattern.matches("geeksforge*ks","geeksforgeeks"));
        System.out.println(Pattern.matches("geeks","geeksfor"));
    }
}