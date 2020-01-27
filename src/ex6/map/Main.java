package ex6.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Manager, List<Employee>> employeesMap = new HashMap<>();
        List<Employee> employeeList = new ArrayList<>();

        Manager manager = new Manager("Cosmin", 33, 5000);
        Employee employee1 = new Employee("Adrian", 20, 1500);
        Employee employee2 = new Employee("Vali", 22, 3400);
        Employee employee3 = new Employee("Cristi", 26, 4500);
        Employee employee4 = new Employee("Corina", 30, 2500);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeesMap.put(manager, employeeList);

        MyHashMap myHashMap = new MyHashMap(employeesMap);

        try {
            myHashMap.dismiss("Cristi");
            myHashMap.dismiss("Vali");
            myHashMap.dismiss("Corina");
            myHashMap.displayHashMapElements();

            Employee newStupidEmployee = new Employee("Costel", 23, 1000);
            Employee newStupidEmployee1 = new Employee("Mirel", 23, 1000);
            myHashMap.hire(newStupidEmployee);
            myHashMap.hire(newStupidEmployee1);
            myHashMap.displayHashMapElements();

            myHashMap.dismiss("Bla bla");
            myHashMap.displayHashMapElements();
        } catch (Exception ex) {
            System.err.println("Exception !");
            ex.printStackTrace();
        }
    }


}
