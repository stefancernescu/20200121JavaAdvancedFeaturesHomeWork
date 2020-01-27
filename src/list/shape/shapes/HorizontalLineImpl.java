package list.shape.shapes;

public class HorizontalLineImpl implements Shape {
    @Override
    public Shape draw() {
       // for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*\n");
            }

//        }
//        System.out.println();
        return this;
    }
}
