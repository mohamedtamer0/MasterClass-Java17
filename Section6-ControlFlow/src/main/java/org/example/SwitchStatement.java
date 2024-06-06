package org.example;

public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 2;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
    }
}