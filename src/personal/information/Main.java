package personal.information;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyFile newFile = new MyFile("C:/Users/User/.IdeaIC2019.3/config/scratches/persons.txt");
        //processing with arraylist
//        newFile.process();
//        newFile.displayResultOfProcessing();

        //processing with map
        newFile.mappingProcess();
        newFile.displayResultOfMapping();


    }
}
