package list.shape.shapes;

public class HorizontalLineImpl implements Shape {
    @Override
    public Shape draw() {
        for (int j = 0; j < 3; j++) {
            System.out.print("*");
        }

        return this;
    }
}
