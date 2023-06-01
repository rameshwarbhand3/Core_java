package com.psl;

import com.beans.Student;
import com.exceptions.InsufficientDataException;
import com.util.StudentDataManager;

import java.util.List;

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
