package list.characters.service;

import java.util.Scanner;

public class IOService {
    private Scanner scanner;

    public Integer getUserInput() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void displayMenu() {
        System.out.println("Alege linia pe care vrei sa o desenezi");
        System.out.println("0. Iesire");
        System.out.println("1. Orizontala");
        System.out.println("2. Verticala");
    }
}
