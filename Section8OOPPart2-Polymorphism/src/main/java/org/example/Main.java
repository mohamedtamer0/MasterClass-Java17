package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch", "Acer", 27, "2540  X 1440");
        Motherboard tehMotherboard = new Motherboard("Bj-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, tehMotherboard, theMonitor);
        thePC.getMonitor().drawPixelAt(10, 10, "red");
        thePC.getMotherboard().loadProgram("Windows OS");
        thePC.getComputerCase().pressPowerButton();
    }
}