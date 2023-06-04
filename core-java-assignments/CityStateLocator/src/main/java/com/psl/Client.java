package com.psl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.exception.InvalidStateException;
import com.util.DataManager;
import com.util.DataManagerImpl;


public class Client {

	public static void main(String[] args)  {
		//Call your methods from here  to test the code implemented
		DataManager dm = new DataManagerImpl();
		Map<String, List<String>> map = new HashMap<>();
		try {
			map = dm.populateCityDataMap("/StateCityDetails.txt");
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				System.out.println(entry.getKey() + entry.getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
			final List<String> cities = dm.getCities(map, "Goa");
			System.out.println("Cities in the Goa "+ cities);
		}catch (Exception e){

			e.printStackTrace();
		}
		try{
			dm.getState(map,"pune");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}