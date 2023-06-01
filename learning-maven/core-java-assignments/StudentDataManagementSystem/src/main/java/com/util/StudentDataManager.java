package com.util;

import com.beans.Address;
import com.beans.Student;
import com.exceptions.InsufficientDataException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Override all the methods of the DataManager Interface
public class StudentDataManager implements DataManager {
    @Override
    public List<Student> populateData(String fileName) {
        List<Student> studentList = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String records = sc.nextLine();
//                System.out.println(records);
                String[] studentData = records.split(",");
//   Student st = new Student(Integer.parseInt(studentData[0]), studentData[1], Integer.parseInt(studentData[2]), new Address(studentData[3], studentData[4], studentData[5]));
                Student student = new Student();
                if (studentData[0].trim().length() > 0) {
                    student.setRollno(Integer.parseInt(studentData[0]));
                } else {
                    student.setRollno(0);
                }
                if (studentData[1].trim().equals("")) {
                    student.setStudentName(null);
                } else {
                    student.setStudentName(studentData[1]);
                }
                if (studentData[2].trim().length() > 0) {
                    student.setAge(Integer.parseInt(studentData[2]));
                } else {
                    student.setAge(0);
                }
                Address address = new Address();

                if (studentData[3].trim().equals(""))
                    address.setStreetName(null);
                else
                    address.setStreetName(studentData[3].trim());

                if (studentData[4].trim().equals(""))
                    address.setCity(null);
                else
                    address.setCity(studentData[4].trim());

                if (studentData[5].trim().equals(""))
                    address.setCity(null);
                else
                    address.setZipCode(studentData[5].trim());

                student.setAddress(address);
                studentList.add(student);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return studentList;
    }


    @Override
    public void validateData(List<Student> studentList) throws InsufficientDataException {
        for (Student s : studentList) {
            if (s.getStudentName() == null) {
                studentList.remove(s);
                throw new InsufficientDataException();
            }
        }
    }

    @Override
    public void sortData(List<Student> studentList) {
//        Comparable<Student> compare2=new Comparable<Student>() {
//            @Override
//
//                public int compareTo(Student student) {
//                    // TODO Auto-generated method stub
//                    if(this.getStudentName()==student.getStudentName()){
//                        if(this.getAge()==student.getAge()){
//                            return this.getRollno()-student.getRollno();
//                        }else
//                            return this.getAge()-student.getAge();
//                    }
//                    else
//                        return this.getStudentName().compareTo(student.getStudentName());
//                }
//            };

//            public int compare(Student arg1, Student arg2) {
//                if (arg1.getStudentName() == arg2.getStudentName()) {
//                    if (arg1.getAge() == arg2.getAge()) {
//                        return arg1.getRollno() - arg2.getRollno();
//                    } else {
//                        return arg1.getAge() - arg2.getAge();
//                    }
//                } else {
//                    return arg1.getStudentName().compareTo(arg2.getStudentName());
//                }
//            }

        Collections.sort(studentList);
    }
}

