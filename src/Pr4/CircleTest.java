package Pr4;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        circle.setRadius(7.0);
        System.out.println("New Radius: " + circle.getRadius());
        System.out.println("New Area: " + circle.calculateArea());
        System.out.println("New Circumference: " + circle.calculateCircumference());
    }
}

