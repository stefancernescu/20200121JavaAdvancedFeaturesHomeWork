package drawingEx5;

import java.util.Scanner;

public class IOService {
    public Integer getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void displayMenu() {
        System.out.println("0. Iesire");
        System.out.println("1. Linie");
        System.out.println("2. Coloana");
        System.out.println("3. Patrat");
        System.out.println("4. Sterge");
    }
}
