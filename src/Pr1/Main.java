package Pr1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 3);
        System.out.println(dog1);
        System.out.println("Human Age: " + dog1.calculateHumanAge());

        Ball ball = new Ball("Soccer");
        System.out.println(ball);

        Book book = new Book("To Kill a Mockingbird", "Harper Lee");
        System.out.println(book);
    }
}
