package Pr9;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable animal = new Animal("Lion");

        Priceable car = new Car(25000.0);
        Priceable book = new Book(19.99);

        System.out.println("Planet name: " + planet.getName());
        System.out.println("Animal name: " + animal.getName());

        System.out.println("Car price: $" + car.getPrice());
        System.out.println("Book price: $" + book.getPrice());
    }
}

