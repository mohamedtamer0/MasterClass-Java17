package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book {
    private String title; // عنوان الكتاب
    private String author; // مؤلف الكتاب

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class LibraryManagement {
    private List<Book> books; // قائمة الكتب

    public LibraryManagement() {
        books = new ArrayList<>(); // إنشاء القائمة
    }

    public void addBook(Book book) {
        books.add(book); // إضافة كتاب واحد
    }

    public void addMultipleBooks(Book... newBooks) {
        Collections.addAll(books, newBooks); // إضافة مجموعة من الكتب
    }

    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        // إضافة كتاب واحد
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        // إضافة مجموعة من الكتب باستخدام addAll
        library.addMultipleBooks(
            new Book("1984", "George Orwell"),
            new Book("To Kill a Mockingbird", "Harper Lee"),
            new Book("Pride and Prejudice", "Jane Austen")
        );

        // طباعة الكتب المتاحة
        library.printBooks();
    }
}
