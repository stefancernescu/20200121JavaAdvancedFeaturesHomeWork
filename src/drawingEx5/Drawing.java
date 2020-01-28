package drawingEx5;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private IOService ioService;
    private List<String[]> list;

    public Drawing() {
        ioService = new IOService();
        list = new ArrayList<>();
    }

    public String[] line() {
        //String line = "* ";
        String[] strings = {"* ", "* ", "* ", "* "};
        //1 rand de 4 stele
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }
        System.out.println();
        return strings;
    }

    public String[] column() {
        String[] strings = {"* \n", "* \n", "* \n", "* \n"};
        //3 randuri a cate o stea pe coloana
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        return strings;
    }

    public void square() {
        //square
        //3 randuri a cate 3 stele pe coloana
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public void start() {
        System.out.println("Deseneaza linii si coloane. Pentru a continua alege una din optiunile de mai jos ");
        boolean isTrue = true;
        while (isTrue) {
            ioService.displayMenu();
            Integer userInput = ioService.getUserInput();
            switch (userInput) {
                case 0:
                    isTrue = false;
                    break;
                case 1:
                    String[] line = this.line();
                    list.add(line);
                    break;
                case 2:
                    String[] column = this.column();
                    list.add(column);
                    break;
                case 3:
                    this.square();
                    break;
                case 4:
                    int size = list.size() - 1;
                    list.remove(size);
                    break;
                default:
                    System.out.println("Numarul introdus " + userInput + " nu corespunde unei optiuni din meniu.");
            }
            for (String[] each : list) {
                for (int i = 0; i < each.length; i++) {
                    System.out.print(each[i]);
                }
                System.out.println();
            }
        }
    }


}
