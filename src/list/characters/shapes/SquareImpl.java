package list.characters.shapes;

public class SquareImpl implements Shape {
    @Override
    public Shape draw() {
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
