package com.sda;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Maria");
        map.put(12, "Chaitanya");
        map.put(2, "Rahul");
        map.put(7, "Singh");
        map.put(49, "Ajeet");
        map.put(3, "Anuj");
        map.put(78, "Maria");
        map.put(132, "Chaitanya");
        map.put(54, "Rahul");
        map.put(21, "Singh");
        map.put(41, "Ajeet");
        map.put(415, "Anuj");

        for (Map.Entry<Integer, String> each : map.entrySet()) {
            System.out.println(each.getKey() + " " + each.getValue());
        }

        System.out.println(map.hashCode());
        System.out.println(map.get(21).hashCode());
        System.out.println(map.get(3).hashCode());
        System.out.println(map.get(41).hashCode());
        System.out.println(map.get(1).hashCode());

        Person person = new Person("test");
        System.out.println("hash code for object person " + person.hashCode());
        Person person1 = new Person("test11");
        System.out.println(person.equals(person1));

        System.out.println(person);
    }
}
