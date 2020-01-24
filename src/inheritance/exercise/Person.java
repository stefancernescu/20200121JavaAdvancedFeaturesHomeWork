package inheritance.exercise;

public abstract class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        super();//apeleaza constructorul din clasa parinte(Object)
        this.name = name;
        this.age = age;
        System.out.println("Calling constructor from Person class");
    }

    public abstract Person write();
    //Overload si Override
    //Metoda cu aceeasi semnatura dar cu parametrii diferiti. Supraincarcarea metodei prin parametrii
    public abstract Person write(String language);
}
