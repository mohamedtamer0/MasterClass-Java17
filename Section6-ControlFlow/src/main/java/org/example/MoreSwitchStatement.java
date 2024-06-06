package org.example;

public class MoreSwitchStatement {
    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value Was 1");
            case 2, 3, 4 -> {
                System.out.println("Was a 2,3,4");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("was not 1,2,3,4, Or 5");
        }
    }
}
