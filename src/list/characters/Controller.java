package list.characters;

import list.characters.service.IOService;
import list.characters.shapes.HorizontalLineImpl;
import list.characters.shapes.Shape;
import list.characters.shapes.VerticalLineImpl;

public class Controller {
    private IOService ioService;
    private Shape horizontalLine;
    private Shape verticalLine;

    public Controller() {
        ioService = new IOService();
        horizontalLine = new HorizontalLineImpl();
        verticalLine = new VerticalLineImpl();
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
            } else {
                System.out.println("Nu ai selectat bine");
            }
        }
    }

}
