package com.ram.util;

import com.ram.bean.Dish;
import com.ram.bean.Location;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class DominozPizzaDeliveryImplTest {
    private DominozPizzaDelivery dp;

    @BeforeEach
    public void setUp() {
        dp = new DominozPizzaDeliveryImpl();
    }

    @Test
    public void testPopulateData() {
        //Given:
        List<Dish> dishes = new ArrayList<>();
        List<Location> locations = new ArrayList<>();

        //when
        dp.populateData("/dish.txt", "/location.txt", dishes, locations);

        //then
        assertEquals(7, dishes.size());
        assertEquals(11, locations.size());
    }

    @Test
    void testExceptionWithJunit5() {
        // given
        final DominozPizzaDeliveryImpl dominozPizzaDelivery = new DominozPizzaDeliveryImpl();

        // when
        final RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> dominozPizzaDelivery.testException(true));

        IntStream.range(0, 10)
                .map(no -> no * 2)
                .forEach(System.out::println);
        assertNotNull(runtimeException);
        assertEquals("my exception", runtimeException.getMessage());
    }
}