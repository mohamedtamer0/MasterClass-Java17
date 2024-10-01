package org.example.Challenge3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // إضافة كتاب جديد
    public void addBook(Book book) {
        books.add(book);
    }

    // فرز الكتب باستخدام Comparator
    public void sortBooks(Comparator<Book> comparator) {
        Collections.sort(books, comparator);
    }

    // طباعة جميع الكتب
    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}