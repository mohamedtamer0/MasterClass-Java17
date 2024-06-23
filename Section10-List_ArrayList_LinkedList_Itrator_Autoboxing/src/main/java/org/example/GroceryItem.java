package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }


    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple", "PRODUCE", 6);
        groceryArray[1] = new GroceryItem("orange", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));


        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList= new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));

    }
}



