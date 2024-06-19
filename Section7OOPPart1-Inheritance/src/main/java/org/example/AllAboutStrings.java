package org.example;

public class AllAboutStrings {
    public static void main(String[] args) {
        printInfo("Hello World");
        printInfo("");
        printInfo("\t \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.lastIndexOf("World"));


        System.out.printf("index of r = %d %n", helloWorld.indexOf('r', 3));
        System.out.printf("index of World = %d %n", helloWorld.lastIndexOf("World", 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String Starts with Hello");
        }

        if (helloWorld.endsWith("World")) {
            System.out.println("String Ends with World");
        }

        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
    }

    public static void printInfo(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String IS Empty");
            return;
        }

        if (string.isEmpty()) {
            System.out.println("String Is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
