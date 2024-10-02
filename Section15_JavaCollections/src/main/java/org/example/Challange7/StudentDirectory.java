package org.example.Challange7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Student {
    private String name;
    private String phoneNumber;

    public Student(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " - " + phoneNumber;
    }
}

public class StudentDirectory {
    public static void main(String[] args) {
        // استخدام LinkedHashMap
        Map<String, Student> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("S001", new Student("Ahmed", "01012345678"));
        linkedHashMap.put("S002", new Student("Sara", "01234567890"));
        linkedHashMap.put("S003", new Student("Mohamed", "01123456789"));

        System.out.println("Students in LinkedHashMap (insertion order):");
        for (Map.Entry<String, Student> entry : linkedHashMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Student: " + entry.getValue());
        }

        // استخدام TreeMap
        Map<String, Student> treeMap = new TreeMap<>();
        treeMap.put("S003", new Student("Mohamed", "01123456789"));
        treeMap.put("S001", new Student("Ahmed", "01012345678"));
        treeMap.put("S002", new Student("Sara", "01234567890"));

        System.out.println("\nStudents in TreeMap (sorted order):");
        for (Map.Entry<String, Student> entry : treeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Student: " + entry.getValue());
        }
    }
}
