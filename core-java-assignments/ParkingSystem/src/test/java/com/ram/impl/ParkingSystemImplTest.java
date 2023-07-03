package com.ram.impl;

import com.ram.bean.ParkingSlot;
import com.ram.bean.Vehicle;
import com.ram.bean.VehicleType;
import com.ram.exception.ParkingFullException;
import com.ram.exception.VehicleNotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class ParkingSystemImplTest {
    private ParkingSystem parkingSystem;

    @Before
    public void setUp() {
        parkingSystem = new ParkingSystemImpl();
    }

    @Test
    public void testParkVehicle() throws ParkingFullException {
        //when
        Map<ParkingSlot, List<Vehicle>> parkingSlotListMap = getDummyMap();
        //then
        assertEquals(7, parkingSlotListMap.size());

    }

    @Test
    public void testGetVehicleInLane() throws ParkingFullException {
        //Given
        Map<ParkingSlot, List<Vehicle>> parkingSlotListMap = getDummyMap();
        //when
        List<Vehicle> vehicleList = parkingSystem.getVehicleInLane(parkingSlotListMap, 203);
        //then
        assertEquals(4,vehicleList.size());
    }

    @Test
    public void testLocateVehicle() throws ParkingFullException, VehicleNotFoundException {
        //Given
        Map<ParkingSlot, List<Vehicle>> parkingSlotListMap = getDummyMap();
        //when
        int actual = parkingSystem.locateVehicle(parkingSlotListMap,1015);
        //then
        assertEquals(209,actual);
    }
    @Test
    public void testRemoveVehicle() throws ParkingFullException, VehicleNotFoundException {
        //Given
        Map<ParkingSlot, List<Vehicle>> parkingSlotListMap = getDummyMap();
        //when
        Vehicle actual = parkingSystem.removeVehicle(parkingSlotListMap,1015);
        //then
        assertEquals(VehicleType.Bike,actual.getVehicleType());
    }

    private Map<ParkingSlot, List<Vehicle>> getDummyMap() throws ParkingFullException {

        Map<ParkingSlot, List<Vehicle>> parkingSlotListMap = parkingSystem.parkVehicle("/Vehicle.txt", "/ParkingSlot.txt");
        return parkingSlotListMap;
    }
}