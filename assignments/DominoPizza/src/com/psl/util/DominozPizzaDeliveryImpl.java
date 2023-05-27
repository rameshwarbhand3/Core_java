package com.psl.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.psl.bean.Dish;
import com.psl.bean.Location;
import com.psl.bean.Order;


public class DominozPizzaDeliveryImpl implements DominozPizzaDelivery {


    @Override
    public void populateData(String dishFile, String locationFile, List<Dish> dishs, List<Location> locations) {
        try {
            Scanner sc = new Scanner(new File(dishFile));
            int id = 0;
            int price = 0;
            int time_cook = 0;
            String dishName = null;
            while (sc.hasNext()) {
                String data[] = sc.nextLine().split(",");
                if (!data[0].trim().equals("")) {
                    id = Integer.parseInt(data[0].trim());
                }
                if (!data[1].trim().equals("")) {
                    dishName = data[1].trim().toUpperCase();
                }
                if (!data[2].trim().equals("")) {
                    price = Integer.parseInt(data[2].trim());
                }
                if (!data[3].trim().equals("")) {
                    time_cook = Integer.parseInt(data[3].trim());
                }
                dishs.add(new Dish(id, dishName, price, time_cook));
            }
            Scanner sc1 = new Scanner(new File(locationFile));
            int code = 0;
            int distance = 0;
            int time = 0;
            while (sc1.hasNext()) {
                String data1[] = sc1.nextLine().split(",");
                if (!data1[0].trim().equals("")) {
                    code = Integer.parseInt(data1[0].trim());
                }
                if (!data1[1].trim().equals("")) {
                    distance = Integer.parseInt(data1[1].trim());
                }
                if (!data1[2].trim().equals("")) {
                    time = Integer.parseInt(data1[2].trim());
                }
                locations.add(new Location(code, distance, time));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calculateLocationForDistance(List<Dish> dishs, List<Location> locations) {
        List<Location> loc = new ArrayList<>();
        for(Dish d:dishs)
        {
            for(Location l:locations)
            {
                double time=d.getTimeToCook()+l.getLocationTime();

                if(time<=30)
                {
                    System.out.println("total time taken for prep & delivery of "+d.getDishName()+" to location code: "+l.getLocationCode()+"---"+time+" min");
                    loc.add(l);
                    d.setList(loc);
                }
            }
        }
    }

    @Override
    public List<Order> calculateOrder(String orderFile, List<Dish> dishs, List<Location> locations) {
        List<Order>orderFinal = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(orderFile));
            while(sc.hasNext()){
                String data[] = sc.nextLine().split(",");
                int dishId,locationCode;
                dishId = Integer.parseInt(data[0]);
                locationCode = Integer.parseInt(data[1]);
                for(Dish d : dishs){
                    for(Location l : locations){
                        if(d.getDishId()==dishId && l.getLocationCode()==locationCode){
                            double time = d.getTimeToCook()+l.getLocationTime();
                            if(time<=30){
                                Order o = new Order(dishId,locationCode);
                                orderFinal.add(o);
                                double cost = d.getCost()+l.getLocationDistance();
                                o.setTotalCost(cost);
                            }
                        }
                    }
                }
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
        return orderFinal;
    }

    @Override
    public void freeDelivery(List<Order> orders, List<Dish> dishs, List<Location> locations) {
            for(Order o : orders){
                for(Dish d : dishs){
                    for(Location l : locations){
                        if(o.getDishId() == d.getDishId() && o.getLocationCode()==l.getLocationCode()){
                            if(l.getLocationDistance()<=10 && o.getTotalCost()>=200){
                                System.out.println(o+" location distance :"+l.getLocationDistance()+" km");
                            }
                        }
                    }
                }
            }
    }
}
