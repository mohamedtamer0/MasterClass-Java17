package org.example.Challenge2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}



public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ali", 25));
        people.add(new Person("Sara", 22));
        people.add(new Person("Mohamed", 30));
        people.add(new Person("Amina", 27));

        // فرز الأشخاص حسب الاسم باستخدام Anonymous Class
        Collections.sort(people, new java.util.Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name); // مقارنة الاسم
            }
        });

        System.out.println("Sorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

