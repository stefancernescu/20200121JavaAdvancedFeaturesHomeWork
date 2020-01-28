package drawingEx5;

import java.util.InputMismatchException;

/**
 * 5. Create a List that stores the character, e.g. "*".
 * a. Use the list to draw a horizontal line.
 * b. Draw a vertical line
 * c. Draw a square full of asterisks.
 * d. * Inside the loop, allow the user to select "add" / "delete" "row" / "column" - display the effect after each selection.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Drawing drawing = new Drawing();
            drawing.start();
        }catch (InputMismatchException ex){
            System.out.println("La consola se pot introduce numai numerele 1,2 sau 3.");
        }catch (ArrayIndexOutOfBoundsException arrayIndexEx){
            System.out.println("Lista este goala");
        }

    }
}
