package org.example.Challenge2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// كلاس Library
public class Library {
    private String libraryName;
    private List<Book> books;

    // Constructor للكلاس الخارجي
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Inner Class
    public class Book implements Comparable<Book> {
        private String title;
        private String author;
        private String ISBN;

        // Constructor للكلاس الداخلي
        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        // دالة لطباعة معلومات الكتاب
        public void printBookInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }

        // تنفيذ دالة compareTo للمقارنة بناءً على عنوان الكتاب
        @Override
        public int compareTo(Book other) {
            return this.title.compareTo(other.title);
        }
    }

    // Comparator لمقارنة الكتب بناءً على المؤلف
    public static class AuthorComparator implements Comparator<Book> {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.author.compareTo(b2.author);
        }
    }

    // دالة لإضافة كتاب للمكتبة
    public void addBook(String title, String author, String ISBN) {
        Book newBook = new Book(title, author, ISBN);
        books.add(newBook);
    }

    // دالة لطباعة معلومات المكتبة
    public void printLibraryInfo() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books in the library:");
        for (Book book : books) {
            book.printBookInfo();
            System.out.println(); // مسافة بين المعلومات
        }
    }

    public static void main(String[] args) {
        // إنشاء كائن من الكلاس الخارجي
        Library myLibrary = new Library("City Library");

        // إضافة كتب للمكتبة
        myLibrary.addBook("1984", "George Orwell", "123456789");
        myLibrary.addBook("To Kill a Mockingbird", "Harper Lee", "987654321");
        myLibrary.addBook("Brave New World", "Aldous Huxley", "456789123");

        // طباعة معلومات المكتبة قبل الترتيب
        myLibrary.printLibraryInfo();

        // ترتيب الكتب بناءً على العنوان باستخدام Comparable
        Collections.sort(myLibrary.books);

        // طباعة معلومات المكتبة بعد الترتيب بناءً على العنوان
        System.out.println("\nBooks sorted by title:");
        myLibrary.printLibraryInfo();

        // ترتيب الكتب بناءً على المؤلف باستخدام Comparator
        Collections.sort(myLibrary.books, new AuthorComparator());

        // طباعة معلومات المكتبة بعد الترتيب بناءً على المؤلف
        System.out.println("\nBooks sorted by author:");
        myLibrary.printLibraryInfo();
    }
}
