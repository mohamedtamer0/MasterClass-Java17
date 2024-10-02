package org.example.Challange8;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " - Grade: " + grade;
    }
}

public class GradeDirectory {
    public static void main(String[] args) {
        NavigableMap<Integer, Student> gradeMap = new TreeMap<>();

        // إضافة الطلاب مع درجاتهم
        gradeMap.put(85, new Student("Ahmed", 85));
        gradeMap.put(92, new Student("Sara", 92));
        gradeMap.put(78, new Student("Mohamed", 78));
        gradeMap.put(90, new Student("Aisha", 90));

        // استخدام lower()
        System.out.println("Lower than 90: " + gradeMap.lowerKey(90));

        // استخدام higher()
        System.out.println("Higher than 85: " + gradeMap.higherKey(85));

        // استخدام floor()
        System.out.println("Floor of 90: " + gradeMap.floorKey(90));

        // استخدام ceiling()
        System.out.println("Ceiling of 85: " + gradeMap.ceilingKey(85));

        // استخدام pollFirstEntry()
        System.out.println("First entry: " + gradeMap.pollFirstEntry());

        // استخدام pollLastEntry()
        System.out.println("Last entry: " + gradeMap.pollLastEntry());

        // طباعة بقية الخريطة
        System.out.println("\nRemaining entries in the grade map:");
        for (Map.Entry<Integer, Student> entry : gradeMap.entrySet()) {
            System.out.println("Grade: " + entry.getKey() + ", Student: " + entry.getValue());
        }
    }
}
