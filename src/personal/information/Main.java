package personal.information;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //File personsFile = new File("C:/Users/User/.IdeaIC2019.3/config/scratches/persons.txt");
        FileReader fileReader;
        try {
            fileReader = new FileReader("C:/Users/User/.IdeaIC2019.3/config/scratches/persons.txt");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
