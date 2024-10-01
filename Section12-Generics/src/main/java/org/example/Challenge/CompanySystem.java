package org.example.Challenge;

public class CompanySystem {
    public static void main(String[] args) {
        // إنشاء مدير لموظفي الدوام الكامل
        EmployeeManager<FullTimeEmployee> fullTimeManager = new EmployeeManager<>();
        fullTimeManager.addEmployee(new FullTimeEmployee("Ahmed", 101, 15000));
        fullTimeManager.addEmployee(new FullTimeEmployee("Mona", 102, 17000));

        // إنشاء مدير لموظفي الدوام الجزئي
        EmployeeManager<PartTimeEmployee> partTimeManager = new EmployeeManager<>();
        partTimeManager.addEmployee(new PartTimeEmployee("Youssef", 201, 100));
        partTimeManager.addEmployee(new PartTimeEmployee("Sara", 202, 120));

        // إنشاء مدير للمتدربين
        EmployeeManager<Intern> internManager = new EmployeeManager<>();
        internManager.addEmployee(new Intern("Ali", 301, "Cairo University"));
        internManager.addEmployee(new Intern("Nada", 302, "Alex University"));

        // طباعة كل مجموعة من الموظفين
        System.out.println("Full-Time Employees:");
        fullTimeManager.printAllEmployees();

        System.out.println("\nPart-Time Employees:");
        partTimeManager.printAllEmployees();

        System.out.println("\nInterns:");
        internManager.printAllEmployees();
    }
}