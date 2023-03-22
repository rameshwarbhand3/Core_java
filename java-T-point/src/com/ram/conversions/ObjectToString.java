package com.ram.conversions;
class Emp{
    int i = 10;
};
public class ObjectToString {
    public static void main(String args[]){
        Emp e = new Emp();
        String s = String.valueOf(e);
        String s1 = e.toString();

    }
}