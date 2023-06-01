package com.util;

import com.exception.CityNotFoundException;
import com.exception.InvalidStateException;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class DataManagerImplTest {
    @Test
    public void testPopulateCityDataMap() throws FileNotFoundException, InvalidStateException, CityNotFoundException {
        //given
        DataManager dm = new DataManagerImpl();

        //when
        Map<String, List<String>> stateCityMap = dm.populateCityDataMap("/StateCityDetails.txt");

        //then
        assertEquals(4,stateCityMap.keySet().size());

    }

}