package com.ram.util;

import com.ram.bean.ParkingSlot;
import com.ram.bean.Vehicle;
import com.ram.exception.ParkingFullException;
import com.ram.exception.VehicleNotFoundException;
import com.ram.impl.ParkingSystem;
import com.ram.impl.ParkingSystemImpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Client {

    public static void main(String[] args) throws ParkingFullException, VehicleNotFoundException {
        ParkingSystem parkingSystem = new ParkingSystemImpl();
        Map<ParkingSlot, List<Vehicle>> parkingSlotListMap = parkingSystem.parkVehicle("/Vehicle.txt", "/ParkingSlot.txt");

        Set<Map.Entry<ParkingSlot, List<Vehicle>>> set = parkingSlotListMap.entrySet();
		for(Map.Entry<ParkingSlot,List<Vehicle>>entry : set){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
        System.out.println("--------------------------------------------------");
        List<Vehicle> vehicleList = parkingSystem.getVehicleInLane(parkingSlotListMap, 203);
        System.out.println(vehicleList);

		System.out.println("-------------------------------------------------");
		 int i = parkingSystem.locateVehicle(parkingSlotListMap, 1015);
		System.out.println(i);
		
		System.out.println("---------------------------------------");
		 Vehicle vehicle = parkingSystem.removeVehicle(parkingSlotListMap, 1015);
		System.out.println(vehicle);
    }

}