package vehicle.service;

import java.util.Scanner;

public class IOService {
    private Scanner scanner;

    public IOService() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String readUserInput() {
        System.out.println("Enter person details ");
        return scanner.nextLine();
    }


}
