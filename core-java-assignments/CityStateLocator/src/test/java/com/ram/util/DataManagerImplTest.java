package com.ram.util;

import com.ram.exception.CityNotFoundException;
import com.ram.exception.InvalidStateException;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class DataManagerImplTest {
    private DataManager dm;

    @Before
    public void setUp() {
        dm = new DataManagerImpl();
    }

    @Test
    public void testPopulateCityDataMap() {
        //given
//        DataManager dm = new DataManagerImpl();
        //when
//        Map<String, List<String>> stateCityMap = dm.populateCityDataMap("/StateCityDetails.txt");
        Map<String, List<String>> stateCityMap = getDummyMap();
        //then
        assertEquals(4, stateCityMap.keySet().size());
    }

    @Test
    public void testGetCities() throws InvalidStateException {
        //given
        Map<String, List<String>> stateCitytMap = getDummyMap();

        final List<String> cities = dm.getCities(stateCitytMap, "Maharashtra");

        assertEquals(6, cities.size());
    }

    @Test
    public void testGetState() throws CityNotFoundException {
        //given
        Map<String, List<String>> stateCityMap = getDummyMap();

        //when
        final String stateName = dm.getState(stateCityMap, "Pune");

        //then
        assertEquals("Maharashtra", stateName);
    }

    @Test(expected = InvalidStateException.class)
    public void testShouldThrowExceptionWhenGivenCityIsNotPresent() throws InvalidStateException {
        //given
        Map<String, List<String>> stateCitytMap = getDummyMap();

        //when
        dm.getCities(stateCitytMap, "J&K");
    }

    @Test(expected = CityNotFoundException.class)
    public void testShouldThrowExceptionWhenGivenStateIsNotPresent() throws CityNotFoundException {

        Map<String, List<String>> stateCitytMap = getDummyMap();

        dm.getState(stateCitytMap, "panama");
    }

    private Map<String, List<String>> getDummyMap() {
        try {
            return dm.populateCityDataMap("/StateCityDetails.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}