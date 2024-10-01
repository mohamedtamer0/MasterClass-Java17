package org.example.Challenge4;

public class GenericMethodExample {
    // Generic method to print array elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "Generics", "World"};

        System.out.println("Integer Array:");
        printArray(intArray); // استخدام الدالة مع مصفوفة من Integer

        System.out.println("\nString Array:");
        printArray(strArray); // استخدام الدالة مع مصفوفة من String
    }
}
