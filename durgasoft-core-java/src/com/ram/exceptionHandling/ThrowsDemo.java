package com.ram.exceptionHandling;

import java.io.IOException;

public class ThrowsDemo {
    void add() throws IOException {
        concat();
    }
    void concat() throws IOException {
        throw new IOException("My Ioexception");

    }

    public static void main(String args[]) throws Exception {
        ThrowsDemo th = new ThrowsDemo();
        th.add();
    }
}
