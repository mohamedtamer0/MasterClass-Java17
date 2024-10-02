package org.example;

import java.util.EnumMap;

enum Fruit {
    APPLE, BANANA, ORANGE, GRAPE
}

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Fruit, Integer> fruitCount = new EnumMap<>(Fruit.class);
        
        fruitCount.put(Fruit.APPLE, 10);
        fruitCount.put(Fruit.BANANA, 5);
        fruitCount.put(Fruit.ORANGE, 8);

        System.out.println("Fruit Count: " + fruitCount);
        
        // استخدام المفاتيح
        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit + ": " + fruitCount.get(fruit));
        }
    }
}
