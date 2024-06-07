package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();
    }
}