package org.example;

public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Tamer";
                        case 2 -> "Mohamed";
                        default -> "Anonymous";
                    },
                    "18/6/1996",
                    "Java");
            System.out.println(s);
        }

        System.out.println("Record Type");
        for (int x = 1; x <= 5; x++) {
            LPAStudent s = new LPAStudent("S92300" + x,
                    switch (x) {
                        case 1 -> "Tamer";
                        case 2 -> "Mohamed";
                        default -> "Anonymous";
                    },
                    "18/6/1996",
                    "Java");
            System.out.println(s);
        }
    }
}
