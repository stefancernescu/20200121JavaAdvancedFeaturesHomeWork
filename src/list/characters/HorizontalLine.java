package list.characters;

public class HorizontalLine implements Shape {
    @Override
    public Shape draw() {
        System.out.println("Drawing horizontal line");
        asterisk.add("*");
        for (int i = 0; i < 9; i++) {
            getAsterisk();
        }
        return this;
    }
}
