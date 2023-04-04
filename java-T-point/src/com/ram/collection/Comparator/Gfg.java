package com.ram.collection.Comparator;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    int roll_no;
    String name;
    String address;

    public Student(int roll_no, String name, String address) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.roll_no + " " + this.name + " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.roll_no - b.roll_no;
    }
}

class Gfg {
    public static void main(String args[]) {
        Student arr[] = {new Student(111, "Ram", "Welhale"),
                new Student(121, "Sam", "pune"),
                new Student(110, "Jam", "sinnar"),
        };
        System.out.println("Unsorted");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr, new Sortbyroll());
        System.out.println();

        System.out.println("After sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
