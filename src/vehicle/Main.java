package vehicle;

import vehicle.service.MyFile;

public class Main {
    public static void main(String[] args) {
        MyFile file = new MyFile("D:\\SDA\\20200121JavaAdvancedFeaturesHomeWork\\src\\vehicle\\person.txt");
        String test=file.process();
        file.parse(test);
        file.displayPerson();

//        String str=file.process();
//        Parser parser = new Parser(str);
//        parser.processUserInput();
//        parser.displayPerson();

//        IOService ioService = new IOService();
//        Parser parser = new Parser(ioService.readUserInput());
//        parser.processUserInput();
//        parser.displayPerson();

    }
}
