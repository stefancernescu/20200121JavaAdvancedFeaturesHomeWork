package list.shape.shapes;

public class VerticalLineImpl implements Shape {
    @Override
    public Shape draw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return this;
    }
}
