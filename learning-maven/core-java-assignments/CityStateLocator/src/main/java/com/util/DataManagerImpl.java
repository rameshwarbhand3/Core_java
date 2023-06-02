package com.util;

import com.exception.CityNotFoundException;
import com.exception.InvalidStateException;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.*;


// Override and implement the methods of Interface DataManager here 
public class DataManagerImpl implements DataManager {
    @Override
    public Map<String, List<String>> populateCityDataMap(String fileName) throws FileNotFoundException, InvalidStateException, CityNotFoundException {
        Map<String, List<String>> stateCityMap = new HashMap<>();
        File file = getFile(fileName);
        Scanner sc = new Scanner(file);
        String record;
        String[] data;
        while ((sc.hasNext())) {
            record = sc.nextLine();
            data = record.split("-");
            if (stateCityMap.containsKey(data[0].trim())) {
                stateCityMap.get(data[0].trim()).add(data[1].trim());
            } else {
                List<String> ls = new ArrayList<String>();
                ls.add(data[1].trim());
                stateCityMap.put(data[0].trim(), ls);
            }
        }
        return stateCityMap;
    }

    private File getFile(String fileName) {
        File file;
        try {
            file = new File(this.getClass().getResource(fileName).toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    @Override
    public List<String> getCities(Map<String, List<String>> stateCityMap, String state) throws InvalidStateException {
        if (stateCityMap.containsKey(state.trim())) {
            return stateCityMap.get(state.trim());
        }
        throw new InvalidStateException();
    }

    @Override
    public String getState(Map<String, List<String>> stateCityMap, String city) throws CityNotFoundException {
        Set<String> states = stateCityMap.keySet();
        Iterator<String> itr = states.iterator();
        String state = null;
        boolean stateFound = false;
        while (itr.hasNext()) {
            state = itr.next();
            List<String> cities = stateCityMap.get(state);
            if (cities.contains(city)) {
                stateFound = true;
                break;
            }
        }
        System.out.println("states : " + state);
        if (!stateFound) {
            throw new CityNotFoundException();
        }
        return state;
    }
}
