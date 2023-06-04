package com.util;

import com.bean.Show;
import com.exception.InvalidSeatNumberException;
import com.exception.SeatsNotAvailableException;
import com.exception.UnknownShowException;

import java.util.List;


public interface DataManager {
    List<Show> populateDataFromFile(String fileName);

    void bookShow(List<Show> showList, String showName, String show_time, int noOfSeats) throws SeatsNotAvailableException, UnknownShowException, InvalidSeatNumberException;
}
