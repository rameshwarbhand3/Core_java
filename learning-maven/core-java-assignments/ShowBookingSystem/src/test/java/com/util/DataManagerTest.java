package com.util;

import com.bean.Show;
import com.exception.InvalidSeatNumberException;
import com.exception.SeatsNotAvailableException;
import com.exception.UnknownShowException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DataManagerTest {
    private DataManager dm;

    @Before
    public void setUp() {
        dm = new DataManagerImpl();
    }

    @Test
    public void testPopulateData() {

        //When
        List<Show> shows = dm.populateDataFromFile("/home/pranjal/Desktop/workspace/core-java/learning-maven/core-java-assignments/ShowBookingSystem/src/main/resources/ShowDetails.ser");
        //then
        assertFalse(shows.isEmpty());
        assertEquals(5, shows.size());
    }


    @Test
    public void bookShowSuccess() throws SeatsNotAvailableException, UnknownShowException, InvalidSeatNumberException {
        //Given:
        List<Show> shows = getDummyShowList();

        //when
        dm.bookShow(shows, "All The Best", "6:30 PM", 10);

        //then
        assertEquals(30, shows.get(0).getSeatsAvailable());
    }

    @Test
    public void checkValidSeatNumber() throws SeatsNotAvailableException, UnknownShowException, InvalidSeatNumberException {
        //Given
        List<Show> shows = dm.populateDataFromFile("/home/pranjal/Desktop/workspace/core-java/learning-maven/core-java-assignments/ShowBookingSystem/src/main/resources/ShowDetails.ser");

        //when
        try {
            dm.bookShow(shows, "All The Best", "6:30 PM", -1);
            fail("check valid seat number should fail");
        } catch (InvalidSeatNumberException e) {
            System.out.println("It is not valid seat number");
            assertNotNull(e);
        }
    }

    @Test(expected = InvalidSeatNumberException.class)
    public void checkValidSeatNumberUsingJunit4() throws SeatsNotAvailableException, UnknownShowException, InvalidSeatNumberException {
        //Given
        List<Show> shows = dm.populateDataFromFile("/home/pranjal/Desktop/workspace/core-java/learning-maven/core-java-assignments/ShowBookingSystem/src/main/resources/ShowDetails.ser");

        //when
        dm.bookShow(shows, "All The Best", "6:30 PM", 0);
        fail("check valid seat number should fail");

    }
    @Test(expected = SeatsNotAvailableException.class)
    public  void checkSeatAvailable() throws SeatsNotAvailableException, UnknownShowException, InvalidSeatNumberException {
        //Given
        List<Show>shows = getDummyShowList();
        //when
        dm.bookShow(shows,"All The Best","6:30 PM",20);
        assertEquals(20,shows.get(0).getSeatsAvailable());

    }

    private List<Show> getDummyShowList() {
        List<Show> shows = new ArrayList<>();
        shows.add(new Show("All The Best", "6:30 PM", 40));
        shows.add(new Show("ram show", "6:30 PM", 10));
        shows.add(new Show("sham show", "6:30 PM", 10));
        return shows;
    }


}