package Pr11;

import java.util.*;
import java.util.Comparator;
class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA()); // Сортировка в порядке убывания
    }
}