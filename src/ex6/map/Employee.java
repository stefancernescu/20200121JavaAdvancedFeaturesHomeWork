package ex6.map;

public class Employee implements Company {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public int getSalary() {
        return salary;
    }

    @Override
    public String getName1() {
        return getName();
    }

    @Override
    public Integer getSalary1() {
        return getSalary();
    }

    @Override
    public Integer getAge1() {
        return getAge();
    }
}
