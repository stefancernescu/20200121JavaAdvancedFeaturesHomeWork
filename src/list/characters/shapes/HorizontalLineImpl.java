package list.characters.shapes;

public class HorizontalLineImpl implements Shape {
    @Override
    public Shape draw() {
        asterisk.add("*");
        for (int i = 0; i < 9; i++) {
            getAsterisk();
        }
        System.out.println();
        return this;
    }
}
