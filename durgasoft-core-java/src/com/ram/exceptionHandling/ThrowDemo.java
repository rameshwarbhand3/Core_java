package com.ram.exceptionHandling;

public class ThrowDemo {
    public static void main(String args[]){
        System.out.println("Before Exception");
        Student st = new Student("111","ram",75);
        st.studentDetails();
        Student st1 = new Student("121","sham",-55);
        st1.studentDetails();
//        throw new RuntimeException();
        //Statement after exception shows unreachable statement.
        System.out.println("After exception");
    }
}
