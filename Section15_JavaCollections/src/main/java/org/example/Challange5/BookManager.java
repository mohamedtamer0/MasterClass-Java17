package org.example.Challange5;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title); // ترتيب حسب العنوان
    }
}

public class BookManager {
    public static void main(String[] args) {
        // استخدام LinkedHashSet
        Set<Book> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Book("The Alchemist", "Paulo Coelho"));
        linkedHashSet.add(new Book("1984", "George Orwell"));
        linkedHashSet.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        
        System.out.println("Books in LinkedHashSet (maintains insertion order):");
        for (Book book : linkedHashSet) {
            System.out.println(book);
        }

        // استخدام TreeSet
        Set<Book> treeSet = new TreeSet<>();
        treeSet.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        treeSet.add(new Book("Moby Dick", "Herman Melville"));
        treeSet.add(new Book("War and Peace", "Leo Tolstoy"));
        
        System.out.println("\nBooks in TreeSet (sorted by title):");
        for (Book book : treeSet) {
            System.out.println(book);
        }
    }
}
