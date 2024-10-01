package org.example.Challenge1;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // إنشاء قائمة من الأعداد
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // استخدام Lambda Expression لطباعة الأعداد
        System.out.println("الأعداد:");
        numbers.forEach(number -> System.out.println(number));

        // استخدام Lambda Expression لتصفية الأعداد الزوجية
        List<Integer> evenNumbers = new ArrayList<>();
        numbers.forEach(number -> {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        });

        System.out.println("الأعداد الزوجية:");
        evenNumbers.forEach(number -> System.out.println(number));

        // استخدام Lambda Expression لحساب مجموع الأعداد
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue) // تحويل القيم إلى أعداد صحيحة
                         .sum();

        System.out.println("مجموع الأعداد: " + sum);
    }
}
