package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashCode {

    public static void main(String[] args) {
        String aTest = "Hello";
        String bTest = "Hello";
        String cTest = String.join("l", "He", "lo");
        String dTest = "He".concat("llo");
        String eTest = "hello";

        List<String> hellos = Arrays.asList(aTest, bTest, cTest, dTest, eTest);
        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);

        System.out.println("mySet = " + mySet);
        System.out.println("# Of element = " + mySet.size());

    }
}
