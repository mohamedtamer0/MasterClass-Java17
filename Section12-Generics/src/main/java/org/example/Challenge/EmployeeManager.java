package org.example.Challenge;

import java.util.ArrayList;
import java.util.List;

class EmployeeManager<T extends Employee> {
    private List<T> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    // إضافة موظف
    public void addEmployee(T employee) {
        employees.add(employee);
    }

    // إزالة موظف
    public void removeEmployee(T employee) {
        employees.remove(employee);
    }

    // طباعة جميع الموظفين
    public void printAllEmployees() {
        for (T employee : employees) {
            System.out.println(employee);
        }
    }
}