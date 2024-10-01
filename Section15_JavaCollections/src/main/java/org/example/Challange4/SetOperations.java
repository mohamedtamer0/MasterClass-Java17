package org.example.Challange4;

import java.util.HashSet;
import java.util.Set;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class SetOperations {
    
    public static void main(String[] args) {
        Set<Student> groupA = new HashSet<>();
        Set<Student> groupB = new HashSet<>();

        // إضافة الطلاب لمجموعة A
        groupA.add(new Student("Ahmed"));
        groupA.add(new Student("Sara"));
        groupA.add(new Student("Mohamed"));
        groupA.add(new Student("Laila"));

        // إضافة الطلاب لمجموعة B
        groupB.add(new Student("Sara"));
        groupB.add(new Student("Hossam"));
        groupB.add(new Student("Ahmed"));

        // طباعة المجموعات
        System.out.println("Group A: " + groupA);
        System.out.println("Group B: " + groupB);

        // 1. الاتحاد
        Set<Student> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union: " + union);

        // 2. التقاطع
        Set<Student> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection: " + intersection);

        // 3. الفرق (A - B)
        Set<Student> differenceA_B = new HashSet<>(groupA);
        differenceA_B.removeAll(groupB);
        System.out.println("Difference (A - B): " + differenceA_B);

        // 4. الفرق (B - A)
        Set<Student> differenceB_A = new HashSet<>(groupB);
        differenceB_A.removeAll(groupA);
        System.out.println("Difference (B - A): " + differenceB_A);
    }
}
