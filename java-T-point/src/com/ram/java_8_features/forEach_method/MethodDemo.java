package com.ram.java_8_features.forEach_method;

import java.util.ArrayList;
import java.util.List;

public class MethodDemo {
    public static void main(String args[]) {
        List<String> gameList = new ArrayList<>();
        gameList.add("Hockey");
        gameList.add("Cricket");
        gameList.add("Badminton");

        //List can be iterate by lambda expressions.
        gameList.forEach(games -> System.out.println(games));
      //List can be iterate by method reference
        gameList.forEach(System.out::println);
    }
}