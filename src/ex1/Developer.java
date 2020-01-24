package ex1;

public class Developer extends Person /*implements IDeveloper*/ {
    private String type;

    public Developer(String name, Integer age, String type) {
        super(name, age);//apelarea constructorului din clasa parinte, Person
        this.type = type;
        System.out.println("Calling constructor from Developer ");
    }

    @Override
    public Person write() {
        System.out.println("Developer's writing generic code. He's tryin to learn some programming language.");
        return this;
    }

    @Override
    public Person write(String language) {
        System.out.println("Developer's writing generic code. He's tryin to learn "+language+" programming language");
        return this;
    }

    //    @Override
//    public IDeveloper write() {
//        System.out.println("Developer's writing generic code. He's tryin to learn some programming language.");
//        return this;
//    }
}
