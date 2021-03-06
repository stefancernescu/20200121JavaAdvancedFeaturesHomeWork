package personal.information;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyFile {
    private Person person;
    private List<Person> people;
    private Map<String, String> peopleMapping;
    private String filePath;
    String[] splitted;

    //Lazy initialization
    public MyFile(String filePath) {
        super();
        this.filePath = filePath;
        people = new ArrayList<>();
        peopleMapping = new HashMap<>();
        person = new Person();
    }

    //TODO: Cum pot separa metoda process() in mai multe metode ???
    public List<Person> process() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filePath))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                String[] splitted = fileLine.split("\\s");//\\s whitespace characters
                this.people.add(new Person(splitted[0], splitted[1], splitted[2]));
            }
        } catch (IOException ex) {
            System.err.println("Exception has occured from read file method.");
            ex.printStackTrace();
        }
        return people;
    }

    /**Test
     * Citeste din fisier
     *
     * @return o lista de array-uri
     */
    public List<String[]> readFile() {
        List<String[]> test = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filePath))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                splitted = fileLine.split(" ");
                test.add(splitted);
            }
        } catch (IOException ex) {
            System.err.println("Exception has occured from read file method.");
            ex.printStackTrace();
        }
        return test;
    }

    //Test
    public void display(List<String[]> list) {
        for (String[] each : list) {
            for (int i = 0; i < each.length; i++) {
                person.setName(each[i]);
                System.out.print(person.getName()+" ");
            }
        }
    }


    public Map<String, String> mappingProcess() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filePath))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                String[] splitted = fileLine.split(" ");
                person.setName(splitted[0]);
                person.setSurname(splitted[1]);
                person.setPhoneNumber(splitted[2]);
                String mergedNameAndSurname = person.getName().concat(" " + person.getSurname());
                this.peopleMapping.put(person.getPhoneNumber(), mergedNameAndSurname);
            }
        } catch (IOException ex) {
            System.err.println("Exception has occured from read file method.");
            ex.printStackTrace();
        }
        return peopleMapping;
    }

    public void displayResultOfProcessing() {
        System.out.println("People details: ");
        for (Person each : people) {
            System.out.println(each.getName() + " " + each.getSurname() + " " + each.getPhoneNumber());
        }
    }

    public void displayResultOfMapping() {
        System.out.println("People details of mapping key value: ");
        for (Map.Entry<String, String> entry : peopleMapping.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}




