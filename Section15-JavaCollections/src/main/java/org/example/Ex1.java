package org.example;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        String[] name = {"Mohamed", "Tamer", "Osama"};
        List<String> list = new ArrayList<>(Arrays.asList(name));
        System.out.println(list);

        list.add("Ali");
        list.addAll(Arrays.asList("Ahmed", "Reda"));
        System.out.println(list);
        System.out.println("Tamer is in the list? " + list.contains("Tamer"));

        list.removeIf(s -> s.charAt(0) == 'T');
        System.out.println(list);
        System.out.println("Tamer is in the list? " + list.contains("Tamer"));


        System.out.println("===========Collections============");

        //Collections

        String[] name2 = {"Mohamed", "Tamer", "Osama"};
        Collection<String> list2 = new HashSet<>(Arrays.asList(name2));
        System.out.println(list2);

        list2.add("Ali");
        list2.addAll(Arrays.asList("Ahmed", "Reda"));
        System.out.println(list2);
        System.out.println("Tamer is in the list? " + list2.contains("Tamer"));

        list2.removeIf(s -> s.charAt(0) == 'T');
        System.out.println(list2);
        System.out.println("Tamer is in the list? " + list2.contains("Tamer"));


    }
}
