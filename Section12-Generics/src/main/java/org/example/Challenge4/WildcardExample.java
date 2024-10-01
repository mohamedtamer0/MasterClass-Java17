package org.example.Challenge4;

import java.util.ArrayList;
import java.util.List;

// كلاس Book
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

public class WildcardExample {
    // دالة تستخدم Wildcard لطباعة قائمة من الكتب
    public static void printBooks(List<? extends Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("1984"));
        bookList.add(new Book("To Kill a Mockingbird"));

        System.out.println("Printing books:");
        printBooks(bookList); // استدعاء الدالة مع قائمة من Books
    }
}
