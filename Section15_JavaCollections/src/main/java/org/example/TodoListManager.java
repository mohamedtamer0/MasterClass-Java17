package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoListManager {

    private List<String> tasks; // قائمة المهام

    public TodoListManager() {
        tasks = new ArrayList<>(); // إنشاء القائمة
    }

    // إضافة مهمة جديدة
    public void addTask(String task) {
        tasks.add(task);
    }

    // خلط المهام
    public void shuffleTasks() {
        Collections.shuffle(tasks);
        System.out.println("Tasks after shuffling: " + tasks);
    }

    // عكس ترتيب المهام
    public void reverseTasks() {
        Collections.reverse(tasks);
        System.out.println("Tasks after reversing: " + tasks);
    }

    // ترتيب المهام
    public void sortTasks() {
        Collections.sort(tasks);
        System.out.println("Tasks after sorting: " + tasks);
    }

    // البحث عن قائمة فرعية من المهام
    public void findSubList(List<String> subList) {
        int index = Collections.indexOfSubList(tasks, subList);
        if (index != -1) {
            System.out.println("Sublist found at index: " + index);
        } else {
            System.out.println("Sublist not found.");
        }
    }

    public void printTasks() {
        System.out.println("Current tasks: " + tasks);
    }

    public static void main(String[] args) {
        TodoListManager todoList = new TodoListManager();

        // إضافة بعض المهام
        todoList.addTask("Buy groceries");
        todoList.addTask("Clean the house");
        todoList.addTask("Finish the report");
        todoList.addTask("Walk the dog");
        todoList.addTask("Read a book");

        // طباعة المهام الحالية
        todoList.printTasks();

        // خلط المهام
        todoList.shuffleTasks();

        // عكس ترتيب المهام
        todoList.reverseTasks();

        // ترتيب المهام
        todoList.sortTasks();

        // البحث عن قائمة فرعية من المهام
        List<String> subList = new ArrayList<>();
        subList.add("Clean the house");
        subList.add("Finish the report");
        todoList.findSubList(subList);
    }
}
