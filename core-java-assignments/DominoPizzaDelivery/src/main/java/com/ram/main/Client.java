package com.ram.main;

import com.ram.bean.Dish;
import com.ram.bean.Location;
import com.ram.bean.Order;
import com.ram.util.DominozPizzaDeliveryImpl;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author: Gandhali Inamdar
 */
public class Client {

	public static void main(String[] args) 
	{
		DominozPizzaDeliveryImpl dpli = new DominozPizzaDeliveryImpl();
		List<Dish>dish = new ArrayList<>();
		List<Location>location = new ArrayList<>();
		List<Order>order = new ArrayList<>();
		try {
			dpli.populateData("/dish.txt", "/location.txt", dish, location);
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(dish.toString());
		System.out.println("\n"+location.toString()+"\n");

		System.out.println("-----------------------------------------------");
		dpli.calculateLocationForDistance(dish,location);
		System.out.println("\n"+dish.toString());

		System.out.println("------------------------------------------------");
		order = dpli.calculateOrder("/order.txt",dish,location);
		System.out.println("\nOrders----\n");
		System.out.println(order);

		System.out.println("--------------------------------------------------");
		System.out.println("\nOrders--(After availing free delivery if applicable)\n");
		dpli.freeDelivery(order, dish, location);
	}
}
