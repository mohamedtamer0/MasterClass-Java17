package org.example.Challenge4;

class GenericBox<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class TypeErasureExample {
    public static void main(String[] args) {
        // إنشاء GenericBox مع Integer
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setItem(100);
        System.out.println("Integer Item: " + intBox.getItem());

        // إنشاء GenericBox مع String
        GenericBox<String> strBox = new GenericBox<>();
        strBox.setItem("Hello, Generics!");
        System.out.println("String Item: " + strBox.getItem());

        // بعد عملية Type Erasure، الكود سيبدو كالتالي:
        // GenericBox box = new GenericBox();
        // box.setItem(100); // سيتم قبول أي نوع
        // box.setItem("Hello"); // سيتم قبول أي نوع
    }
}
