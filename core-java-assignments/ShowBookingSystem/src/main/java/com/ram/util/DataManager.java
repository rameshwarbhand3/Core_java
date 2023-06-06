package com.ram.util;

import com.ram.bean.Show;
import com.ram.exception.InvalidSeatNumberException;
import com.ram.exception.SeatsNotAvailableException;
import com.ram.exception.UnknownShowException;

import java.util.List;


public interface DataManager {
    List<Show> populateDataFromFile(String fileName);

    void bookShow(List<Show> showList, String showName, String show_time, int noOfSeats) throws SeatsNotAvailableException, UnknownShowException, InvalidSeatNumberException;
}
