package hashmap.example.employee;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Employee, Integer> test = new HashMap<>();

        test.put(new Employee(1, "A"), 10);
        test.put(new Employee(2, "B"), 20);
        test.put(new Employee(3, "C"), 30);
        test.put(new Employee(4, "D"), 40);
        test.put(new Employee(5, "E"), 50);
        test.put(new Employee(6, "F"), 60);
        test.put(new Employee(7, "G"), 70);
        test.put(new Employee(8, "H"), 80);
        test.put(new Employee(9, "I"), 90);
        test.put(new Employee(10, "J"), 100);

        test.put(new Employee(11, "J"), 110);
        test.put(new Employee(12, "J"), 120);
    }
}
