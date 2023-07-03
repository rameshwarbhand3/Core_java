package com.ram.annotations.MethodLevel;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student("S-111", "Durga", "Hyd");
        student.getStudentDetails();
        System.out.println();


        Class cls = student.getClass();
        Method method = cls.getDeclaredMethod("getStudentDetails");
        Course course = method.getAnnotation(Course.class);
        System.out.println("Course Details");
        System.out.println("---------------------");
        System.out.println("Course Id     : "+course.cid());
        System.out.println("Course Name   : "+course.cname());
        System.out.println("Course Cost   : "+course.cfee());


    }
}
