package org.example.Challenge1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// كلاس School
public class School {
    private String name;

    // Constructor للكلاس الخارجي
    public School(String name) {
        this.name = name;
    }

    // Static Nested Class
    public static class Student implements Comparable<Student> {
        private String studentName;
        private int studentID;

        // Constructor للكلاس المتداخل
        public Student(String studentName, int studentID) {
            this.studentName = studentName;
            this.studentID = studentID;
        }

        // دالة لطباعة معلومات الطالب
        public void printStudentInfo() {
            System.out.println("Student Name: " + studentName);
            System.out.println("Student ID: " + studentID);
        }

        // تنفيذ دالة compareTo للمقارنة بناءً على اسم الطالب
        @Override
        public int compareTo(Student other) {
            return this.studentName.compareTo(other.studentName);
        }
    }

    // Comparator لمقارنة الطلاب بناءً على ID
    public static class StudentIDComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.studentID, s2.studentID);
        }
    }

    // دالة لطباعة اسم المدرسة
    public void printSchoolName() {
        System.out.println("School Name: " + name);
    }

    public static void main(String[] args) {
        // إنشاء كائن من الكلاس الخارجي
        School mySchool = new School("ABC High School");

        // إنشاء قائمة من الطلاب
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 101));
        students.add(new Student("Sara", 102));
        students.add(new Student("Mohamed", 103));

        // طباعة معلومات المدرسة
        mySchool.printSchoolName();

        // طباعة معلومات الطلاب قبل الترتيب
        System.out.println("Students before sorting:");
        for (Student student : students) {
            student.printStudentInfo();
        }

        // ترتيب الطلاب بناءً على الأسماء باستخدام Comparable
        Collections.sort(students);

        // طباعة معلومات الطلاب بعد الترتيب بناءً على الاسم
        System.out.println("\nStudents sorted by name:");
        for (Student student : students) {
            student.printStudentInfo();
        }

        // ترتيب الطلاب بناءً على ID باستخدام Comparator
        Collections.sort(students, new StudentIDComparator());

        // طباعة معلومات الطلاب بعد الترتيب بناءً على ID
        System.out.println("\nStudents sorted by ID:");
        for (Student student : students) {
            student.printStudentInfo();
        }
    }
}
