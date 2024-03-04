package Pr4;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("John Smith", "My Book", 2023);
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());

        book.setYear(2024);
        System.out.println("Updated Year: " + book.getYear());
    }
}

