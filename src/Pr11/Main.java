package Pr11;

import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        // Заполнение списка студентов
        studentList.add(new Student(1, "Alice", 3.9));
        studentList.add(new Student(2, "Bob", 3.5));
        studentList.add(new Student(3, "Charlie", 3.7));

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Сортировка по iDNumber с использованием сортировки вставками");
            System.out.println("2. Сортировка по GPA с использованием быстрой сортировки");
            System.out.println("3. Объединение двух списков студентов с сортировкой слиянием");
            System.out.println("4. Выход");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sortStudentsByIDNumber(studentList);
                    break;
                case 2:
                    sortStudentsByGPA(studentList);
                    break;
                case 3:
                    mergeStudentLists(studentList);
                    break;
                case 4:
                    System.out.println("Выход");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }

    public static void sortStudentsByIDNumber(List<Student> students) {
        for (int i = 1; i < students.size(); i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).getIDNumber() > key.getIDNumber()) {
                students.set(j + 1, students.get(j));
                j = j - 1;
            }
            students.set(j + 1, key);
        }
        printStudents(students);
    }

    public static void sortStudentsByGPA(List<Student> students) {
        Collections.sort(students, new SortingStudentsByGPA());
        printStudents(students);
    }

    public static void mergeStudentLists(List<Student> students) {
        List<Student> secondStudentList = new ArrayList<>();
        // Заполните второй список студентов
        secondStudentList.add(new Student(4, "David", 3.8));
        secondStudentList.add(new Student(5, "Eve", 3.6));
        secondStudentList.add(new Student(6, "Frank", 4.0));

        // Объедините и отсортируйте два списка
        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(students);
        mergedList.addAll(secondStudentList);
        Collections.sort(mergedList, new SortingStudentsByGPA());
        printStudents(mergedList);
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
