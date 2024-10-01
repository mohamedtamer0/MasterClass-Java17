package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    private String name; // اسم الطالب
    private int age; // عمر الطالب

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StudentRecords {
    private List<Student> students; // قائمة الطلاب

    public StudentRecords() {
        students = new ArrayList<>(); // إنشاء القائمة
    }

    public void addStudent(Student student) {
        students.add(student); // إضافة طالب
    }

    public void copyStudentsTo(List<Student> destination) {
        // التأكد من أن قائمة الهدف كبيرة بما يكفي
        if (destination.size() < students.size()) {
            throw new IllegalArgumentException("Destination list is not large enough to hold the students.");
        }
        // نسخ الطلاب إلى القائمة الهدف
        Collections.copy(destination, students);
    }

    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("Students in the records:");
            for (Student student : students) {
                System.out.println(student); // طباعة تفاصيل الطالب
            }
        }
    }

    public static void main(String[] args) {
        StudentRecords studentRecords = new StudentRecords();

        // إضافة بعض الطلاب
        studentRecords.addStudent(new Student("Ahmed", 20));
        studentRecords.addStudent(new Student("Sara", 22));
        studentRecords.addStudent(new Student("Mohamed", 19));

        // طباعة السجلات الطلابية
        studentRecords.printStudents();

        // إنشاء قائمة هدف لنسخ الطلاب
        List<Student> copiedStudents = new ArrayList<>(Collections.nCopies(studentRecords.students.size(), null));

        // نسخ الطلاب إلى القائمة الجديدة
        studentRecords.copyStudentsTo(copiedStudents);

        // طباعة السجلات المنسوخة
        System.out.println("\nCopied students:");
        for (Student student : copiedStudents) {
            System.out.println(student);
        }
    }
}
