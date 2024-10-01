package org.example;

import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaCalculator {
    
    // تعريف الواجهة الوظيفية
    @FunctionalInterface
    interface Operation {
        double apply(double a, double b);
    }

    public static void main(String[] args) {
        // تعريف العمليات الحسابية باستخدام Lambda Expressions
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> b != 0 ? a / b : Double.NaN; // التأكد من عدم القسمة على صفر

        Scanner scanner = new Scanner(System.in);

        // طلب المستخدم لإدخال الأعداد
        System.out.print("أدخل الرقم الأول: ");
        double num1 = scanner.nextDouble();
        System.out.print("أدخل الرقم الثاني: ");
        double num2 = scanner.nextDouble();

        // عرض الخيارات للمستخدم
        System.out.println("اختر العملية:");
        System.out.println("1. جمع");
        System.out.println("2. طرح");
        System.out.println("3. ضرب");
        System.out.println("4. قسمة");

        System.out.print("اختيارك: ");
        int choice = scanner.nextInt();

        double result = 0;

        // تنفيذ العملية المختارة
        switch (choice) {
            case 1:
                result = addition.apply(num1, num2);
                System.out.println("نتيجة الجمع: " + result);
                break;
            case 2:
                result = subtraction.apply(num1, num2);
                System.out.println("نتيجة الطرح: " + result);
                break;
            case 3:
                result = multiplication.apply(num1, num2);
                System.out.println("نتيجة الضرب: " + result);
                break;
            case 4:
                result = division.apply(num1, num2);
                if (result == Double.NaN) {
                    System.out.println("خطأ: القسمة على صفر غير مسموح بها.");
                } else {
                    System.out.println("نتيجة القسمة: " + result);
                }
                break;
            default:
                System.out.println("اختيار غير صالح.");
                break;
        }

        // إغلاق ال Scanner
        scanner.close();
    }
}
