package list.characters;

public class Square implements Shape {
    @Override
    public Shape draw() {
        System.out.println("Drawing a Square");
        asterisk.add("*");
        for (int j = 0; j < 9; j++) {
            getAsterisk();
        }
        System.out.println();
        for (int j = 0; j < 3; j++) {
            System.out.println(asterisk.get(0) + "\t\t" + asterisk.get(0));
        }
        for (int j = 0; j < 9; j++) {
            getAsterisk();
        }
        return this;
    }
}
