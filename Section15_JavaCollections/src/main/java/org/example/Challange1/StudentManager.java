package org.example.Challange1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.grade, other.grade); // ترتيب الطلاب بناءً على الدرجات
    }
}

public class StudentManager {

    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // إضافة طالب
    public void addStudent(Student student) {
        students.add(student);
    }

    // البحث عن طالب باستخدام binary search
    public void searchStudent(String name) {
        Collections.sort(students); // يجب ترتيب الطلاب قبل البحث
        int index = Collections.binarySearch(students, new Student(name, 0), Comparator.comparing(Student::getName));
        if (index >= 0) {
            System.out.println("Found: " + students.get(index));
        } else {
            System.out.println("Student not found.");
        }
    }

    // حساب تكرار درجة معينة
    public void frequencyOfGrade(int grade) {
        int frequency = Collections.frequency(students, new Student("", grade));
        System.out.println("Frequency of grade " + grade + ": " + frequency);
    }

    // الحصول على الطالب بأعلى درجة
    public void maxGradeStudent() {
        Student maxStudent = Collections.max(students);
        System.out.println("Student with max grade: " + maxStudent);
    }

    // الحصول على الطالب بأقل درجة
    public void minGradeStudent() {
        Student minStudent = Collections.min(students);
        System.out.println("Student with min grade: " + minStudent);
    }

    // تدوير قائمة الطلاب
    public void rotateStudents(int distance) {
        Collections.rotate(students, distance);
        System.out.println("Students after rotation: " + students);
    }

    public void printStudents() {
        System.out.println("Current students: " + students);
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // إضافة بعض الطلاب
        manager.addStudent(new Student("Ahmed", 85));
        manager.addStudent(new Student("Sara", 92));
        manager.addStudent(new Student("Mohamed", 75));
        manager.addStudent(new Student("Hossam", 85));
        manager.addStudent(new Student("Laila", 78));

        // طباعة الطلاب
        manager.printStudents();

        // البحث عن طالب
        manager.searchStudent("Sara");

        // حساب تكرار درجة معينة
        manager.frequencyOfGrade(85);

        // الطالب بأعلى درجة
        manager.maxGradeStudent();

        // الطالب بأقل درجة
        manager.minGradeStudent();

        // تدوير قائمة الطلاب
        manager.rotateStudents(2);
    }
}
