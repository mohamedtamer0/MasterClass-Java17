package org.example;

public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Was a 2,3,4");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
    }
}