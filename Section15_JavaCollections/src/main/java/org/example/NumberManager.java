package org.example;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NumberManager {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // إضافة الأرقام للمجموعة
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Numbers in TreeSet: " + numbers);

        // البحث عن أقرب تطابق
        int target = 25;
        Integer closest = numbers.floor(target); // أقرب عدد أقل أو يساوي
        Integer higherClosest = numbers.ceiling(target); // أقرب عدد أكبر أو يساوي

        System.out.println("Closest number less than or equal to " + target + ": " + closest);
        System.out.println("Closest number greater than or equal to " + target + ": " + higherClosest);

        // استخدام subset
        NavigableSet<Integer> subset = numbers.subSet(20, true, 40, true);
        System.out.println("Subset from 20 to 40 (inclusive): " + subset);
    }
}
