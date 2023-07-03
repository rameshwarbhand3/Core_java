package com.ram.impl;

import com.ram.bean.ParkingSlot;
import com.ram.bean.Vehicle;
import com.ram.exception.ParkingFullException;
import com.ram.exception.VehicleNotFoundException;

import java.util.List;
import java.util.Map;

public interface ParkingSystem {
	Map<ParkingSlot,List<Vehicle>> parkVehicle(String fileVehicle, String fileParkingSlot) throws ParkingFullException;
	List<Vehicle> getVehicleInLane(Map<ParkingSlot, List<Vehicle>> map, int slotLaneNo);
	int locateVehicle(Map<ParkingSlot, List<Vehicle>> map, int vehicleId)throws VehicleNotFoundException;
	Vehicle removeVehicle(Map<ParkingSlot, List<Vehicle>> map, int vehicleId) throws VehicleNotFoundException;
		
}
