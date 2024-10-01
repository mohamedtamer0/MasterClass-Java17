package org.example;

@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class Main {
    public static void main(String[] args) {
        // تعريف عمليات الحساب باستخدام Lambda Expressions
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> b != 0 ? a / b : Double.NaN;

        // اختبار العمليات
        System.out.println("جمع: " + addition.calculate(10, 5));
        System.out.println("طرح: " + subtraction.calculate(10, 5));
        System.out.println("ضرب: " + multiplication.calculate(10, 5));
        System.out.println("قسمة: " + division.calculate(10, 5));
    }
}
