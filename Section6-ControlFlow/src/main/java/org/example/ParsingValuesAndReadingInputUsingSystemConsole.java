package org.example;

import java.util.Scanner;

public class ParsingValuesAndReadingInputUsingSystemConsole {
    public static void main(String[] args) {
        int currentYear = 2024;
        String userDateOfBirth = "1999";
        int dateOfBirth = Integer.parseInt(userDateOfBirth);
        System.out.println("Age = " + (currentYear - dateOfBirth));

        String userAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
        System.out.println("The user says he's " + ageWithPartialYear);

        try {
            System.out.println(getInputFromConsole(currentYear));

        } catch (Exception e) {
            System.out.println(getInputFroScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's Your Name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFroScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's Your Name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year were you born?");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
}
