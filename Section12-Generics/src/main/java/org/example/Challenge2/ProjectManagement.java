package org.example.Challenge2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ProjectManagement<T extends Comparable<T>> {
    private List<T> items;

    public ProjectManagement() {
        this.items = new ArrayList<>();
    }

    // إضافة عنصر جديد (مشروع أو فريق)
    public void addItem(T item) {
        items.add(item);
    }

    // فرز العناصر بناءً على طريقة المقارنة في واجهة Comparable
    public void sortItems() {
        Collections.sort(items);
    }

    // طباعة كل العناصر
    public void printAllItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}