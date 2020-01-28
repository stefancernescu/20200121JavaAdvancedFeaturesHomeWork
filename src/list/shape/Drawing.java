package list.shape;

public class Drawing {
    public void line() {
        //1 rand de 4 stele
        for (int i = 0; i < 4; i++) {
            System.out.print("* ");
        }
    }

    public void column() {
        //3 randuri a cate o stea pe coloana
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n"+"");

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


}
