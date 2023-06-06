package com.ram.util;


import com.ram.exception.InvalidSeatNumberException;
import com.ram.exception.SeatsNotAvailableException;
import com.ram.exception.UnknownShowException;
import com.ram.bean.Show;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

//Override and implement all the methods of DataManger Interface in this class
public class DataManagerImpl implements DataManager {
    @Override
    public List<Show> populateDataFromFile(String fileName) {
        List<Show> shows = new ArrayList<Show>();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    shows.add((Show) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shows;
    }

    @Override
    public void bookShow(List<Show> showList, String showName, String show_time, int noOfSeats) throws SeatsNotAvailableException,
            UnknownShowException, InvalidSeatNumberException {
        // TODO Auto-generated method stub
        boolean flag = false;
        if (noOfSeats <= 0) {
            throw new InvalidSeatNumberException();
        } else {
            for (Show s : showList) {
                if (s.getShowName().equals(showName)) {
                    if (noOfSeats <= s.getSeatsAvailable()) {
                        int remainingSeats = s.getSeatsAvailable() - noOfSeats;
                        s.setSeatsAvailable(remainingSeats);
                        System.out.println("Show has been Booked,remainingSeat = " + remainingSeats);
                        return;
                    } else
                        throw new SeatsNotAvailableException();
                }

            }
            if (!flag) {
                throw new UnknownShowException();
            }
        }
    }
}
