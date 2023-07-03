package com.ram.annotations.MethodLevel;

public class Student {
    private String sid;
    private String sname;
    private String saddr;

    public Student(String sid, String sname, String saddr) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
    }
    @Course(cid="C-111", cname="Fullstack Java", cfee=30000)
    public void getStudentDetails(){
        System.out.println("Student Details");
        System.out.println("-------------------------");
        System.out.println("Student Id       : "+sid);
        System.out.println("Student Name     : "+sname);
        System.out.println("Student Address  : "+saddr);
    }


}
