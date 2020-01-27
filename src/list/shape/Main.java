package list.shape;

import list.shape.shapes.HorizontalLineImpl;
import list.shape.shapes.Shape;
import list.shape.shapes.SquareImpl;
import list.shape.shapes.VerticalLineImpl;

public class Main {
    public static void main(String[] args) {
//        Controller controller = new Controller();
//        controller.process();

        Shape horizontalLine = new HorizontalLineImpl();
        Shape verticalLine = new VerticalLineImpl();

        Shape square = new SquareImpl();
        //square.draw();
        //verticalLine.draw();
        horizontalLine.draw();
        //horizontalLine.draw();

    }
}
