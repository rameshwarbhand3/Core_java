package com.psl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.psl.beans.Student;
import com.psl.exceptions.InsufficientDataException;
import com.psl.util.DataManager;
import com.psl.util.StudentDataManager;

public class Client {

    public static void main(String[] args) {
        StudentDataManager st = new StudentDataManager();
        List<Student> studentList = st.populateData("/home/pranjal/Desktop/workspace/core-java/assignments/StudentDataManagementSystem/StudentDetails.txt");
        for (Student student : studentList) {
            System.out.println(student);
        }

        try {
            st.validateData(studentList);
        } catch (InsufficientDataException e) {
            e.printStackTrace();
        }

        st.sortData(studentList);
        System.out.println("studentlist after sorting ");
        for(Student s : studentList){
            System.out.println(s);
        }

    }
}
