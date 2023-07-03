package com.ram.annotations.classLevel;
@Institute(
        name="Durga software solution",
        branch="S.R.nagar",
        phone="7387326088"
)
public class Student {
private String id;
private String name;
private String addr;

    public Student(String id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }
    public void getStudentDetails(){
        System.out.println("student Details");
        System.out.println("----------------------------");
        System.out.println("Student id : "+id);
        System.out.println("Student name : "+name);
        System.out.println("Student address : "+addr);
    }
}
