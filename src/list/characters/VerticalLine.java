package list.characters;

public class VerticalLine implements Shape {
    @Override
    public Shape draw() {
        System.out.println("\nDrawing vertical line");
        asterisk.add("*");
        for (int i = 0; i < 6; i++) {
            System.out.println(asterisk.get(0));
        }
        return this;
    }
}
