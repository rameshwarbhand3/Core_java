package com.ram.util;

import com.ram.bean.Dish;
import com.ram.bean.Location;
import com.ram.bean.Order;
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
    @Test
    void testCalucateLocationForDistance(){
        //given
        List<Dish>dishes = new ArrayList<>();
        List<Location>locations = new ArrayList<>();


        //when
        dp.calculateLocationForDistance(dishes,locations);
        //then

    }
    @Test
    void testCalculateOrder(){
        //Given:
        List<Dish>dishes = getDummyDishList();
        List<Location>locations = getDummyLocationList();

        //when
        final List<Order> orders = dp.calculateOrder("/order.txt", dishes, locations);
        System.out.println(orders);

        //then
        assertEquals(4,orders.size());
    }
    @Test
    void testVoidFreeDelivery(){
        //Given
        List<Dish>dishes = getDummyDishList();
        List<Order>orders = getDummyOrderList();
        List<Location>locations = getDummyLocationList();

        //when
        dp.freeDelivery(orders,dishes,locations);

        //then
      assertEquals(7,locations.get(2).getLocationDistance());
    }
    private List<Dish>getDummyDishList(){
        List<Dish>dishes = new ArrayList<>();
        dishes.add(new Dish(1267,"Cheese Pizza",160,8));
        dishes.add(new Dish(1261,"Mozerella pizza",250,5));
        dishes.add(new Dish(1269,"Hot Dogs Pizza",240,7));
        return dishes;
    }
    private List<Location>getDummyLocationList(){
        List<Location>locations = new ArrayList<>();
        locations.add(new Location(3042,23,15));
        locations.add(new Location(3023,16,24));
        locations.add(new Location(3051,7,18));
        return locations;
    }
    private List<Order>getDummyOrderList(){
        List<Order>orders = new ArrayList<>();
        orders.add(new Order(1267,3042));
               orders.add(new Order(1275,3023));
                orders.add(new Order(1261,3051));
                return orders;
    }
}