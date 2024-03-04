import java.util.*;

class Student {
    private String fullName;
    private String inn;
    private double averageScore;

    public Student(String fullName, String inn, double averageScore) {
        this.fullName = fullName;
        this.inn = inn;
        this.averageScore = averageScore;
    }

    public String getFullName() {
        return fullName;
    }

    public String getInn() {
        return inn;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", inn='" + inn + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Добавление студентов
        students.add(new Student("Иванов Иван Иванович", "1234567890", 4.5));
        students.add(new Student("Петров Петр Петрович", "9876543210", 3.8));
        students.add(new Student("Сидоров Сидор Сидорович", "1357924680", 4.2));

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Поиск студента по ФИО");
            System.out.println("2. Сортировка студентов по среднему баллу");
            System.out.println("3. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Чтение символа новой строки после ввода числа

            switch (choice) {
                case 1:
                    System.out.println("Введите ФИО студента для поиска:");
                    String searchFullName = scanner.nextLine();
                    try {
                        Student foundStudent = findStudentByFullName(students, searchFullName);
                        System.out.println("Найден студент: " + foundStudent);
                    } catch (StudentNotFoundException e) {
                        System.out.println("Студент с таким ФИО не найден.");
                    }
                    break;
                case 2:
                    Collections.sort(students, Comparator.comparingDouble(Student::getAverageScore).reversed());
                    System.out.println("Студенты отсортированы по среднему баллу:");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
                    break;
            }
        }
    }

    private static Student findStudentByFullName(List<Student> students, String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fullName + "' не найден.");
    }
}
