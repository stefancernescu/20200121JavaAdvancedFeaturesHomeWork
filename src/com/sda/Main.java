package com.sda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, List<Person>> map = new HashMap<>();
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("test"));
        personList.add(new Person("test"));
        personList.add(new Person("test"));

        List<Person> personList1 = new ArrayList<>();
        personList.add(new Person("sssss"));
        personList.add(new Person("cccc"));
        personList.add(new Person("Mihaela"));

        map.put(1, personList);
        map.put(2, personList1);

        for (Map.Entry<Integer, List<Person>> each : map.entrySet()) {
            Integer key = each.getKey();
            List<Person> people = each.getValue();
            people.forEach(person -> System.out.print(" "+person.getName()));
            System.out.println(key);
        }
    }
}
