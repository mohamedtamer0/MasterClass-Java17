package org.example.Challenge2;

class Project implements Comparable<Project> {
    private String name;
    private double budget;
    private int priority;

    public Project(String name, double budget, int priority) {
        this.name = name;
        this.budget = budget;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public int getPriority() {
        return priority;
    }

    // مقارنة بين المشاريع بناءً على الأولوية، ولو متساوية نرجع للمقارنة بناءً على الميزانية
    @Override
    public int compareTo(Project other) {
        int priorityComparison = Integer.compare(this.priority, other.priority);
        if (priorityComparison == 0) {
            return Double.compare(this.budget, other.budget);
        }
        return priorityComparison;
    }

    @Override
    public String toString() {
        return "Project{Name: " + name + ", Budget: $" + budget + ", Priority: " + priority + "}";
    }
}