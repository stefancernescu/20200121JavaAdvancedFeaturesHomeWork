package debuggerTest;

public class OtherCLass {
    private String messageString = "Hello person #%d!";

    public void otherFunction(int baseValue) {
        for (int i = 0; i < 50; i++) {
            String message = makeMessage(baseValue + i);
            System.out.println(message);
        }
    }

    public String makeMessage(int val) {
        return String.format(messageString, val);
    }
}
