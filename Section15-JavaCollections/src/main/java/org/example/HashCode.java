package org.example;

import java.util.Arrays;
import java.util.List;

public class HashCode {

    public static void main(String[] args) {
        String aTest = "Hello";
        String bTest = "Hello";
        String cTest = String.join("l", "He", "lo");
        String dTest = "He".concat("llo");
        String eTest = "hello";

        List<String> hellos = Arrays.asList(aTest, bTest, cTest, dTest, eTest);
        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));
    }
}
