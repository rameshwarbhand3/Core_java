package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void checkEmptyForNullInput() {
        //Given
        String str = null;
        Demo demo = new Demo();

        //when
        boolean actual = demo.checkEmpty(str);
e
        //then
        assertTrue(actual);
    }

    @Test
    public void checkEmptyForEmptyInput() {
        //Given
        String str = "";
        Demo demo = new Demo();

        //when
        boolean actual = demo.checkEmpty(str);

        //then
        assertTrue(actual);
    }

    @Test
    public void checkEmptyForNonEmptyString() {
        //Given:
        String str = "java";
        Demo demo = new Demo();

        //When
        boolean actual = demo.checkEmpty(str);

        //then
        assertFalse(actual);
    }
}