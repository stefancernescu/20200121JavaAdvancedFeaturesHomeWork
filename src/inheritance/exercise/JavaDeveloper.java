package inheritance.exercise;

public class JavaDeveloper extends Developer{
    private String language;

    public JavaDeveloper(String name, Integer age, String type, String language) {
        super(name, age, type);
        this.language = language;
        System.out.println("Calling constructor from JavaDeveloper class");
    }

    @Override
    public Person write() {
        System.out.println("JavaDeveloper is writing code, right now");
        return this;
    }

    //Override si Overload
    @Override
    public Person write(String language) {
        System.out.println("Java Developer's writing code. He's tryin to merge Java with "+language+" programming language");
        return this;
    }

    //    @Override
//    public IDeveloper write() {
//        System.out.println("JavaDeveloper is writing code, right now");
//        return this;
//    }
}
