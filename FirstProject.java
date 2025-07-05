package com.bookshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    String category;
    double price;

    Book(int id, String title, String author, String category, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return id + ". " + title + " by " + author + " [" + category + "] - ₹" + price;
    }
}

public class Bookshop {
    static List<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addBooks();
        int choice = 0;

        while (choice != 2) {
            System.out.println("\n==== Online Bookshop ====");
            System.out.println("1. View Available Books");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBooks();
                    break;
                case 2:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    static void addBooks() {
        books.add(new Book(1, "Wings of Fire", "A. P. J. Abdul Kalam", "Biography", 250));
        books.add(new Book(2, "Man Mein Hai Vishwas", "Acharya Vinoba Bhave", "Spiritual", 280));
        books.add(new Book(3, "Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 350));
    }


    static void showBooks() {
        System.out.println("\n--- Book List ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
