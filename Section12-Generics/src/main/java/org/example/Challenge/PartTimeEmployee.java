package org.example.Challenge;

class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate: " + hourlyRate;
    }
}