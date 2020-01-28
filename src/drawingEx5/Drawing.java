package drawingEx5;

public class Drawing {
    private IOService ioService;

    public Drawing() {
        ioService = new IOService();
    }

    public void line() {
        //1 rand de 4 stele
        for (int i = 0; i < 4; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public void column() {
        //3 randuri a cate o stea pe coloana
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* \n");
            }
        }
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
            if (userInput == 0) {
                isTrue = false;
            } else if (userInput == 1) {
                this.line();
            } else if (userInput == 2) {
                this.column();
            } else if (userInput == 3) {
                this.square();
            } else {
                System.out.println("Numarul introdus " + userInput + " nu corespunde unei optiuni din meniu.");
            }
        }
    }


}
