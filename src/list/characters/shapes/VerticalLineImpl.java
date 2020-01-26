package list.characters.shapes;

public class VerticalLineImpl implements Shape {
    @Override
    public Shape draw() {
        asterisk.add("*");
        for (int i = 0; i < 6; i++) {
            System.out.println(asterisk.get(0));
        }
        System.out.print("");
        return this;
    }
}
