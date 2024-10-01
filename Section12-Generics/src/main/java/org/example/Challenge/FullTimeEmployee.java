package org.example.Challenge;

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}