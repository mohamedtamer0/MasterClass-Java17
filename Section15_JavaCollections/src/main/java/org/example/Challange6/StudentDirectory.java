package org.example.Challange6;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Student> studentMap = new HashMap<>();

        // إضافة الطلاب
        studentMap.put("S001", new Student("Ahmed", "01012345678"));
        studentMap.put("S002", new Student("Sara", "01234567890"));
        studentMap.put("S003", new Student("Mohamed", "01123456789"));

        // طباعة جميع الطلاب
        System.out.println("Student Directory:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Student: " + entry.getValue());
        }


        // البحث عن طالب باستخدام ID
        String searchId = "S002";
        if (studentMap.containsKey(searchId)) {
            System.out.println("Found: " + studentMap.get(searchId));
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        // استخدام compute لتحديث رقم الهاتف
        studentMap.compute("S001", (key, value) -> {
            if (value != null) {
                return new Student(value.toString().split(" - ")[0], "01099999999"); // تحديث الرقم
            }
            return value; // إذا لم يكن موجودًا، إرجاع null
        });

        System.out.println("After compute:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Student: " + entry.getValue());
        }

        // استخدام replace لتحديث قيمة موجودة
        studentMap.replace("S002", new Student("Sara", "01200000000"));

        System.out.println("\nAfter replace:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Student: " + entry.getValue());
        }


        // تحديث رقم هاتف طالب
        String updateId = "S001";
        if (studentMap.containsKey(updateId)) {
            studentMap.put(updateId, new Student("Ahmed", "01087654321"));
            System.out.println("Updated: " + studentMap.get(updateId));
        }

        // حذف طالب
        String deleteId = "S003";
        if (studentMap.containsKey(deleteId)) {
            studentMap.remove(deleteId);
            System.out.println("Student with ID " + deleteId + " has been removed.");
        }

        // طباعة جميع الطلاب بعد التحديث
        System.out.println("\nUpdated Student Directory:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Student: " + entry.getValue());
        }
    }
}
