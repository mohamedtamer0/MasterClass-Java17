package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Order {
    private String dishName; // اسم الطبق
    private int quantity; // الكمية
    private boolean isPrepared; // حالة التحضير

    public Order(String dishName, int quantity) {
        this.dishName = dishName;
        this.quantity = quantity;
        this.isPrepared = false; // الطلب مش مُعد في البداية
    }

    public void prepareOrder() {
        this.isPrepared = true; // تغيير حالة التحضير
    }

    public String getDishName() {
        return dishName; // استرجاع اسم الطبق
    }

    public int getQuantity() {
        return quantity; // استرجاع الكمية
    }

    public boolean isPrepared() {
        return isPrepared; // استرجاع حالة التحضير
    }

    @Override
    public String toString() {
        return "Order{" +
                "dishName='" + dishName + '\'' +
                ", quantity=" + quantity +
                ", isPrepared=" + isPrepared +
                '}';
    }
}

public class RestaurantManagement {
    private List<Order> orders; // قائمة الطلبات

    public RestaurantManagement() {
        orders = new ArrayList<>(); // إنشاء القائمة
    }

    public void addOrder(String dishName, int quantity) {
        orders.add(new Order(dishName, quantity)); // إضافة طلب جديد
    }

    public void prepareAllOrders() {
        for (Order order : orders) {
            order.prepareOrder(); // تحضير الطلبات
        }
    }

    public void printOrders() {
        for (Order order : orders) {
            System.out.println(order); // طباعة تفاصيل الطلبات
        }
    }

    public void fillOrdersWithDefault() {
        // ملء الطلبات بقيمة افتراضية لو القائمة فارغة
        if (orders.isEmpty()) {
            Order defaultOrder = new Order("No Orders", 0);
            Collections.fill(orders, defaultOrder); // استخدام Collections.fill
        }
    }

    public static void main(String[] args) {
        RestaurantManagement restaurant = new RestaurantManagement();

        // إضافة طلبات
        restaurant.addOrder("Pasta", 2);
        restaurant.addOrder("Pizza", 1);

        // طباعة الطلبات قبل التحضير
        System.out.println("Orders before preparation:");
        restaurant.printOrders();

        // تحضير جميع الطلبات
        restaurant.prepareAllOrders();

        // طباعة الطلبات بعد التحضير
        System.out.println("\nOrders after preparation:");
        restaurant.printOrders();

        // محاولة ملء الطلبات بقيمة افتراضية
        restaurant.orders.clear(); // تفريغ القائمة
        restaurant.fillOrdersWithDefault(); // ملء الطلبات بقيمة افتراضية

        // طباعة الطلبات بعد الملء
        System.out.println("\nOrders after filling with default:");
        restaurant.printOrders();
    }
}
