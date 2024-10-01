package org.example.Challange3;

import java.util.HashSet;
import java.util.Objects;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // تحقق إذا كانوا نفس الكائن
        if (!(o instanceof Student)) return false; // تحقق من النوع
        Student student = (Student) o;
        return id == student.id; // تحقق من تساوي الرقم التعريفي
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // حساب الـ hash code بناءً على الرقم التعريفي
    }
}

public class StudentManager {
    private HashSet<Student> students; // مجموعة الطلاب

    public StudentManager() {
        students = new HashSet<>(); // إنشاء الـ HashSet
    }

    // إضافة طالب
    public void addStudent(Student student) {
        if (students.add(student)) {
            System.out.println("Added: " + student);
        } else {
            System.out.println("Student already exists: " + student);
        }
    }

    // التحقق من وجود طالب
    public void checkStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Student exists: " + student);
        } else {
            System.out.println("Student not found: " + student);
        }
    }

    // حساب عدد الطلاب
    public void countStudents() {
        System.out.println("Total students: " + students.size());
    }

    // طباعة جميع الطلاب
    public void printStudents() {
        System.out.println("Current students: " + students);
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // إضافة بعض الطلاب
        manager.addStudent(new Student("Ahmed", 1));
        manager.addStudent(new Student("Sara", 2));
        manager.addStudent(new Student("Mohamed", 1)); // هذا الطالب لديه نفس الرقم التعريفي كأحمد

        // التحقق من وجود طالب
        manager.checkStudent(new Student("Sara", 2));
        manager.checkStudent(new Student("Mohamed", 3)); // طالب غير موجود

        // حساب عدد الطلاب
        manager.countStudents();

        // طباعة جميع الطلاب
        manager.printStudents();
    }
}
