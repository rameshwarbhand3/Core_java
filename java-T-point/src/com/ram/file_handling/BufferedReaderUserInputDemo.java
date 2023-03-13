package com.ram.file_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderUserInputDemo {
    public static void  main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter two number");
            String input1 = br.readLine();
            int number1 = Integer.parseInt(input1);

            String input2 = br.readLine();
            int number2 = Integer.parseInt(input2);
            int sum = number1 + number2;

            System.out.println("sum :" +sum);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

