package com.util;

import java.util.List;

import com.beans.Student;
import com.exceptions.InsufficientDataException;

public interface DataManager {
  
  //Read data from StudentDetails.txt file, populate List<Student> and  return 
  List<Student> populateData(String fileName);

  //Validate the Student data :Remove invalid/insufficient Student data from the list and throw InsufficientDataException   
  void validateData(List<Student> studentList) throws InsufficientDataException;
  
  //Sort the valid list of Student data using Comparable 
  void sortData(List<Student> studentList);
  
}
