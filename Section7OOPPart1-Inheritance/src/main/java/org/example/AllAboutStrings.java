package org.example;

public class AllAboutStrings {
    public static void main(String[] args) {
        printInfo("Hello World");
    }

    public static void printInfo(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
