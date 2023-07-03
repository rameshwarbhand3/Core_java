package com.ram.annotations.classLevel;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String args[]){
        Student student = new Student("111","Ram","Hyderabad");
        student.getStudentDetails();
        System.out.println();
        Class cls = student.getClass();

        Annotation annotation = cls.getAnnotation(Institute.class);
        Institute institute = (Institute) annotation;
        System.out.println("Institute Details");
        System.out.println("------------------------------");
        System.out.println("Name : "+institute.name());
        System.out.println("Branch : "+institute.branch());
        System.out.println("Website : "+institute.website());
        System.out.println("Phone : "+institute.phone());
    }
}

