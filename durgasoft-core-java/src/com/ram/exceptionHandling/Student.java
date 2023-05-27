package com.ram.exceptionHandling;

class Student {
    private String sid;
    private String sname;
    private int smarks;

    public Student(String sid, String sname, int smarks) {
        this.sid = sid;
        this.sname = sname;
        this.smarks = smarks;
    }

    public void studentDetails() {
        System.out.println("Student Details :");
        System.out.println("--------------------------");
        System.out.println("student id is : " + sid);
        System.out.println("Student name is : " + sname);
        System.out.println("Student marks is " + smarks);
        String status = "";
        if (smarks >= 0 && smarks < 100) {
            if (smarks < 35)
                status = "Fail";
            if (smarks > 35 && smarks < 50)
                status = "Third class";
            if (smarks > 50 && smarks < 65)
                status = "Second class";
            if (smarks > 65)
                status = "First class";
        } else {
            throw new RuntimeException("invalid marks");
        }
        System.out.println("Student status : " + status);
    }

}
