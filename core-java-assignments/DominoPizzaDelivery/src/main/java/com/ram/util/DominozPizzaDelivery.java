package com.ram.util;

import com.ram.bean.Dish;
import com.ram.bean.Location;
import com.ram.bean.Order;

import java.util.List;

public interface DominozPizzaDelivery {

	void populateData(String dishFile, String locationFile, List<Dish> dishs, List<Location> locations);
	void calculateLocationForDistance(List<Dish> dishs, List<Location> locations);
	List<Order> calculateOrder(String orderFile, List<Dish> dishs, List<Location> locations);
	void freeDelivery(List<Order> orders, List<Dish> dishs, List<Location> locations);
	
}
