package com.ram.exception_handling;

import java.io.IOException;

class MethodEx {
    void method() throws IOException {
        throw new IOException("device error");
    }
}

public class TestThrows {
    public static void main(String args[]) {
        try {
            MethodEx m = new MethodEx();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("Normal flow");
    }
}