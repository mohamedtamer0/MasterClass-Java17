package org.example.Challenge2;

class Team implements Comparable<Team> {
    private String name;
    private int numberOfMembers;

    public Team(String name, int numberOfMembers) {
        this.name = name;
        this.numberOfMembers = numberOfMembers;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    // مقارنة بين الفرق بناءً على عدد الأعضاء
    @Override
    public int compareTo(Team other) {
        return Integer.compare(this.numberOfMembers, other.numberOfMembers);
    }

    @Override
    public String toString() {
        return "Team{Name: " + name + ", Members: " + numberOfMembers + "}";
    }
}