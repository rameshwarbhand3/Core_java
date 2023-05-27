package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void sampleTest() {
        assertEquals("ram", "ram");
    }

    @Test
    public void testAddition() {
        //Given
        App app = new App();
        int a =10;
        int b=20;

        //when
        int actual = app.add(a, b);

        //then
        assertEquals(30,actual);
//        assertEquals(30, new App().add(10, 20));

    }
}

