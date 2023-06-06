package com.ram.util;

import com.ram.beans.Student;
import com.ram.exceptions.InsufficientDataException;

import java.util.List;

public interface DataManager {
  
  //Read data from StudentDetails.txt file, populate List<Student> and  return 
  List<Student> populateData(String fileName);

  //Validate the Student data :Remove invalid/insufficient Student data from the list and throw InsufficientDataException   
  void validateData(List<Student> studentList) throws InsufficientDataException;
  
  //Sort the valid list of Student data using Comparable 
  void sortData(List<Student> studentList);
  
}
