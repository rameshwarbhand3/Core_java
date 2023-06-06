package com.ram.util;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import com.ram.exception.CityNotFoundException;
import com.ram.exception.InvalidStateException;

public interface DataManager {
	Map<String,List<String>> populateCityDataMap(String fileName) throws FileNotFoundException, InvalidStateException, CityNotFoundException;
	List<String> getCities(Map<String, List<String>> stateCityMap, String state) throws  InvalidStateException;
	String getState(Map<String, List<String>> stateCityMap, String city)throws CityNotFoundException;
	
}
