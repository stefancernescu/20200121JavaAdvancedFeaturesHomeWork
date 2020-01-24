package inheritance.exercise;

public class Main {
    public static void main(String[] args) {
        /**
         * Vor fi apelati toti contructorii, de la clasa parinte si pana la ultima clasa copil
         */
        Person student = new Developer("Ciprian", 20, "Student").write();
        System.out.println();
        Person javaDeveloper = new JavaDeveloper("Marian", 26, "Junior Java Developer", "Java/Kotin").write();

        Person student1 = new Developer("Ciprian", 20, "Student").write("C#");
        System.out.println();
        Person javaDeveloper1 = new JavaDeveloper("Marian", 26, "Junior Java Developer", "Java/Kotin").write("C++");
    }
}
