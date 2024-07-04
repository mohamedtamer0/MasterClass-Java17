package org.example;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Mohamed", "Tamer", "Osama"));

        list.forEach(s -> System.out.println(s));

        System.out.println("---------");
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(myString + " means " + first);
        });

    }
}
