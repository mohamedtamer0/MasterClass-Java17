package org.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListQS {
    public static void main(String[] args) {
        var test = new LinkedList<String>();
        test.add("Osama");
        test.add(0, "Elzero");

        System.out.println(test);


        addMoreElements(test);
        System.out.println(test);

        printItinerary(test);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Mohamed");
        list.addLast("Tamer");

        //Queue
        list.offer("Java17");
        list.offerFirst("Ali");
        list.offerLast("Mohab");

        //Stack
        list.push("Stack Push");
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }
}
