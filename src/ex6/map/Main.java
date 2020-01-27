package ex6.map;


import ex6.map.model.Company;
import ex6.map.model.Employee;
import ex6.map.model.Manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Manager, List<Employee>> employeesMap = new HashMap<>();
        List<Employee> employeeList = new ArrayList<>();
        MyHashMap myHashMap = new MyHashMap(employeesMap);

        Company manager = new Manager("Cosmin", 33, 5000);
        Company employee1 = new Employee("Adrian", 20, 1500);
        Company employee2 = new Employee("Vali", 22, 3400);
        Company employee3 = new Employee("Cristi", 26, 4500);
        Company employee4 = new Employee("Corina", 30, 2500);

        employeeList.add((Employee) employee1);
        employeeList.add((Employee) employee2);
        employeeList.add((Employee) employee3);
        employeeList.add((Employee) employee4);
        employeesMap.put((Manager) manager, employeeList);



        try {
            myHashMap.dismiss("Cristi");
            myHashMap.dismiss("Vali");
            myHashMap.dismiss("Corina");
            myHashMap.displayHashMapElements();

            Employee newStupidEmployee = new Employee("Costel", 23, 1000);
            Employee newStupidEmployee1 = new Employee("Mirel", 24, 2000);
            myHashMap.hire(newStupidEmployee);
            myHashMap.hire(newStupidEmployee1);
            myHashMap.displayHashMapElements();


        } catch (Exception ex) {
            System.err.println("Exception !");
            ex.printStackTrace();
        }
    }


}
