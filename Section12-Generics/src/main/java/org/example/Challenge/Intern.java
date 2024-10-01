package org.example.Challenge;

class Intern extends Employee {
    private String school;

    public Intern(String name, int id, String school) {
        super(name, id);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return super.toString() + ", School: " + school;
    }
}
