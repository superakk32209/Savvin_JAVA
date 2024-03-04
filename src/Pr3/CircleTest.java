package Pr3;

// Класс для тестирования Circle:
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности: " + circle.calculateArea());
    }
}
