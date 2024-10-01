package org.example.Challenge3;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // إنشاء مكتبة
        Library library = new Library();
        library.addBook(new Book("The Great Gatsby", 10.99));
        library.addBook(new Book("Moby Dick", 15.50));
        library.addBook(new Book("1984", 12.00));
        library.addBook(new Book("Pride and Prejudice", 8.99));

        System.out.println("Books before sorting:");
        library.printAllBooks();

        // فرز الكتب بناءً على السعر
        library.sortBooks(new BookPriceComparator());
        System.out.println("\nBooks after sorting by price:");
        library.printAllBooks();

        // فرز الكتب بناءً على العنوان
        library.sortBooks(new BookTitleComparator());
        System.out.println("\nBooks after sorting by title:");
        library.printAllBooks();
    }
    }