package ex6.map;

import ex6.map.exceptions.EmptyListException;
import ex6.map.exceptions.EmptyMapException;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyHashMap {
    private Company keyManager;
    private List<Employee> employees;
    private Map<Manager, List<Employee>> companyMap;

    public MyHashMap(Map<Manager, List<Employee>> employeesMap) {
        this.employees = new CopyOnWriteArrayList<>();
        this.companyMap = employeesMap;
        this.keyManager = new Manager();
    }

    public void displayHashMapElements() throws EmptyMapException {
        for (Map.Entry<Manager, List<Employee>> eachEntryItem : companyMap.entrySet()) {
            this.keyManager = eachEntryItem.getKey();
            this.employees = eachEntryItem.getValue();
            if (companyMap.size() == 0) {
                throw new EmptyMapException("Empty map");
            }
            System.out.println("Displaying managers: ");
            System.out.println(this.keyManager.getName1() + " " + this.keyManager.getAge1() + " " + this.keyManager.getSalary1());
            //Iterate through arrayList
            System.out.println("Displaying employees: ");
            for (Employee each : this.employees) {
                System.out.println(each.getName() + " " + each.getAge1() + " " + each.getSalary1());
            }
        }
    }

    public Map<Manager, List<Employee>> dismiss(String employeeName) throws EmptyListException {
        for (Map.Entry<Manager, List<Employee>> eachEntryIn : this.companyMap.entrySet()) {
            List<Employee> employeeList = eachEntryIn.getValue();
            if (employeeList.size() == 1) {
                throw new EmptyListException("Lista este goala");
            }
            employeeList.removeIf(each -> each.getName().equalsIgnoreCase(employeeName));
        }
        return this.companyMap;
    }

    public void hire(Employee employee) {
        for (Map.Entry<Manager, List<Employee>> eachEntryIn : this.companyMap.entrySet()) {
            List<Employee> employeeList = eachEntryIn.getValue();
            employeeList.add(employee);
        }
    }
}
