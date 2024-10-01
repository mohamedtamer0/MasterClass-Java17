package org.example.Challenge2;

public class ProjectManagementSystem {
    public static void main(String[] args) {
        // إدارة المشاريع
        ProjectManagement<Project> projectManagement = new ProjectManagement<>();
        projectManagement.addItem(new Project("Website Development", 10000, 2));
        projectManagement.addItem(new Project("Mobile App", 5000, 1));
        projectManagement.addItem(new Project("Cloud Migration", 15000, 3));
        projectManagement.addItem(new Project("Data Analysis", 12000, 2));

        System.out.println("Projects before sorting:");
        projectManagement.printAllItems();

        // فرز المشاريع بناءً على الأولوية، ثم الميزانية
        projectManagement.sortItems();
        System.out.println("\nProjects after sorting by priority and budget:");
        projectManagement.printAllItems();

        // إدارة الفرق
        ProjectManagement<Team> teamManagement = new ProjectManagement<>();
        teamManagement.addItem(new Team("Backend Team", 5));
        teamManagement.addItem(new Team("Frontend Team", 3));
        teamManagement.addItem(new Team("Data Science Team", 7));
        teamManagement.addItem(new Team("DevOps Team", 4));

        System.out.println("\nTeams before sorting:");
        teamManagement.printAllItems();

        // فرز الفرق بناءً على عدد الأعضاء
        teamManagement.sortItems();
        System.out.println("\nTeams after sorting by number of members:");
        teamManagement.printAllItems();
    }
}