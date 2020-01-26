package list.characters.shapes;

public class SquareImpl implements Shape{

    public SquareImpl draw() {
        asterisk.add("*");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(asterisk.get(0));

            }
            System.out.println();
        }
        return this;
    }
}
