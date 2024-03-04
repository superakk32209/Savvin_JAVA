package Pr11;

import java.util.*;
import java.util.Comparator;

class Student {
    private int iDNumber;
    private String name;
    private double gpa;

    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", GPA=" + gpa +
                '}';
    }
}
