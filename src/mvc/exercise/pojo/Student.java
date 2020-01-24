package mvc.exercise.pojo;

//POJO-Plain Old Java Object
public class Student {
    private String name;
    private Integer number;

    //Constructor cu parametrii, initialieaza variabilele membre ale clasei
    public Student(String name, Integer number) {
        super();//apeleaza constructorul din clasa parinte Object
        this.name = name;//apeleaza explicit variabila name si ii atribuie valoarea primita ca parametru
        this.number = number;
    }

    //Constructor default
    public Student() {
        super();
    }

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
