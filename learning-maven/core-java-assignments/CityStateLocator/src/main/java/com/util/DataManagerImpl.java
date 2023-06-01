package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.*;

import com.exception.CityNotFoundException;
import com.exception.InvalidStateException;


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
            System.out.println("cities : " + stateCityMap.get(state.trim()));
        } else {
            throw new InvalidStateException();
        }
        return null;
    }

    @Override
    public String getState(Map<String, List<String>> stateCityMap, String city) throws CityNotFoundException {
        Set<String> state = stateCityMap.keySet();
        Iterator<String> itr = state.iterator();
        String st = null;
        while (itr.hasNext()) {
            st = itr.next();
            List<String> list = stateCityMap.get(st);
            if (list.contains(city)) {
                break;
            }
        }
        System.out.println("state : " + st);
        return st;
    }
}
