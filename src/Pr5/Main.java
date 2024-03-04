package Pr5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Создать круг");
            System.out.println("2. Создать прямоугольник");
            System.out.println("3. Создать квадрат");
            System.out.println("4. Выйти");
            System.out.print("Введите номер действия: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Задание: Создание круга");
                    createCircle(scanner);
                    break;
                case 2:
                    System.out.println("Задание: Создание прямоугольника");
                    createRectangle(scanner);
                    break;
                case 3:
                    System.out.println("Задание: Создание квадрата");
                    createSquare(scanner);
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void createCircle(Scanner scanner) {
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();
        scanner.nextLine(); // Считываем перевод строки после числа

        System.out.print("Введите цвет круга (на русском): ");
        String color = scanner.nextLine();

        System.out.print("Закрашенный (true/false): ");
        boolean filled = scanner.nextBoolean();

        Shape circle = new Circle(radius, color, filled);
        printShapeInfo(circle);
    }

    private static void createRectangle(Scanner scanner) {
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();
        scanner.nextLine(); // Считываем перевод строки после числа

        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();
        scanner.nextLine(); // Считываем перевод строки после числа

        System.out.print("Введите цвет прямоугольника (на русском): ");
        String color = scanner.nextLine();

        System.out.print("Закрашенный (true/false): ");
        boolean filled = scanner.nextBoolean();

        Shape rectangle = new Rectangle(width, length, color, filled);
        printShapeInfo(rectangle);
    }

    private static void createSquare(Scanner scanner) {
        System.out.print("Введите длину стороны квадрата: ");
        double side = scanner.nextDouble();
        scanner.nextLine(); // Считываем перевод строки после числа

        System.out.print("Введите цвет квадрата (на русском): ");
        String color = scanner.nextLine();

        System.out.print("Закрашенный (true/false): ");
        boolean filled = scanner.nextBoolean();

        Shape square = new Square(side, color, filled);
        printShapeInfo(square);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Создана фигура:");
        shape.display();
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println();
    }
}
