package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Mohamed", "Tamer", "Osama"));

        list.forEach(s -> System.out.println(s));

        System.out.println("---------");
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(myString + " means " + first);
        });

        int result = calculator((value1, value2) -> value1 + value2, 5, 2);
        var result2 = calculator((value1, value2) -> value1 / value2, 10.0, 2.5);
    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
}
