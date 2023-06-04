package com.psl;

import com.beans.Student;
import com.exceptions.InsufficientDataException;
import com.util.StudentDataManager;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        StudentDataManager st = new StudentDataManager();
        List<Student> studentList = st.populateData("/StudentDetails.txt");
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
        System.out.println("---------------------------------");
        try {
            st.validateData(studentList);
        } catch (InsufficientDataException e) {
            e.printStackTrace();
        }

        st.sortData(studentList);
        System.out.println("student after sorting ");
        for(Student s : studentList){
            System.out.println(s);
        }

    }
}
