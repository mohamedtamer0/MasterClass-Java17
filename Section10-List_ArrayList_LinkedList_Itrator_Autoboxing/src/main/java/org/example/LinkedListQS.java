package org.example;

import java.util.LinkedList;

public class LinkedListQS {
    public static void main(String[] args) {
        var test = new LinkedList<String>();
        test.add("Osama");
        test.add(0,"Elzero");

        System.out.println(test);


        addMoreElements(test);
        System.out.println(test);
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
}
