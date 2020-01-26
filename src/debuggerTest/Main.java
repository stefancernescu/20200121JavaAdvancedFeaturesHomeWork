package debuggerTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("The program started");
        someFunction();
    }

    public static void someFunction(){
        OtherCLass c = new OtherCLass();
        c.otherFunction(5);
    }

}
