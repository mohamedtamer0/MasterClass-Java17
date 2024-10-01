package org.example.Challenge1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class LambdaFunctionalInterfaceExample {

    // دالة لتصفية الأعداد بناءً على شرط معين
    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }

    // دالة لتطبيق عملية على الأعداد
    public static List<Integer> applyFunction(List<Integer> numbers, Function<Integer, Integer> function) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            result.add(function.apply(number));
        }
        return result;
    }

    public static void main(String[] args) {
        // إنشاء قائمة من الأعداد
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // استخدام Lambda Expression لتصفية الأعداد الزوجية
        List<Integer> evenNumbers = filterNumbers(numbers, number -> number % 2 == 0);
        System.out.println("الأعداد الزوجية: " + evenNumbers);

        // استخدام Lambda Expression لتصفية الأعداد الأكبر من 3
        List<Integer> greaterThanThree = filterNumbers(numbers, number -> number > 3);
        System.out.println("الأعداد الأكبر من 3: " + greaterThanThree);

        // استخدام Lambda Expression لتطبيق عملية الضرب على كل عدد
        List<Integer> doubledNumbers = applyFunction(numbers, number -> number * 2);
        System.out.println("الأعداد بعد الضرب في 2: " + doubledNumbers);
        
        // استخدام Lambda Expression لتطبيق عملية إضافة 10 على كل عدد
        List<Integer> addedTenNumbers = applyFunction(numbers, number -> number + 10);
        System.out.println("الأعداد بعد إضافة 10: " + addedTenNumbers);
    }
}
