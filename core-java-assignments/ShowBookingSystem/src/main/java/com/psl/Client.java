package com.psl;

import com.bean.Show;
import com.exception.InvalidSeatNumberException;
import com.exception.SeatsNotAvailableException;
import com.exception.UnknownShowException;
import com.util.DataManagerImpl;

import java.io.IOException;
import java.util.List;
//import com.bean.Show;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SeatsNotAvailableException, UnknownShowException, InvalidSeatNumberException {
        DataManagerImpl dm = new DataManagerImpl();
        List<Show> showList = dm.populateDataFromFile("/home/pranjal/Desktop/workspace/core-java/learning-maven/core-java-assignments/ShowBookingSystem/src/main/resources/ShowDetails.ser");
        for (Show s : showList) {
            System.out.println(s);
        }
//        dm.bookShow(showList,"Sahi re Sahi","6:40 PM",50);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Show Name:");
//        String showName = sc.nextLine();
//        System.out.println("Enter show Time : ");
//        String showTime = sc.nextLine();
//        System.out.println("Enter no of seats :");
//        int noOfSeats = sc.nextInt();
        try {
            dm.bookShow(showList, "Sahi re Sahi", "6:40 PM", 20);

        } catch (SeatsNotAvailableException | UnknownShowException | InvalidSeatNumberException e) {
            e.printStackTrace();
        }
    }
}