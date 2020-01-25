package vehicle.service;

import vehicle.Parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//MyFile HAS A Parser
public class MyFile {
    private File file;
    private Parser parser;

    public MyFile(String path) {
        this.file = new File(path);
        parser = new Parser();
    }

    /**
     * Citeste fisierul     *
     * @return un string cu tot continutul
     */
    public String process() {
        String generatedString = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                generatedString = fileLine;
            }
        } catch (IOException ex) {
            System.err.println("Eroare la citirea din fisier.");
            ex.printStackTrace();
        }
        return generatedString;
    }

    public MyFile parse(String parserInput) {
        this.parser.parsingUserInput(parserInput);
        return this;
    }

    public MyFile displayPerson() {
        System.out.println(parser.personDetails());
        return this;
    }
}
