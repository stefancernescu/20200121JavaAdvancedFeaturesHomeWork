package list.shape;

import list.shape.service.IOService;
import list.shape.shapes.HorizontalLineImpl;
import list.shape.shapes.Shape;
import list.shape.shapes.SquareImpl;
import list.shape.shapes.VerticalLineImpl;

public class Controller {
    private IOService ioService;
    private Shape horizontalLine;
    private Shape verticalLine;
    private Shape square;

    public Controller() {
        ioService = new IOService();
        horizontalLine = new HorizontalLineImpl();
        verticalLine = new VerticalLineImpl();
        square = new SquareImpl();
    }

    public void process() {
        //Try catch ???
        boolean isTrue = true;
        while (isTrue) {
            ioService.displayMenu();
            Integer userInput = ioService.getUserInput();
            if (userInput == 0) {
                isTrue = false;
            } else if (userInput == 1) {
                horizontalLine.draw();
            } else if (userInput == 2) {
                verticalLine.draw();
            } else if (userInput == 3) {
                square.draw();

            } else {
                System.out.println("Nu ai selectat bine");
            }
        }
    }

}
