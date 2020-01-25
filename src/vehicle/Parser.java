package vehicle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private Person person;

    public Parser() {
        super();
        person = new Person();
    }

    public Person parsingUserInput(String input) {
        //doar data nasterii ([0-9]{2}/[0-9]{2}/[0-9]{4})
        Pattern patternForName = Pattern.compile("([^ ]+) ([^ ]+).*");
        Pattern patternForBirthDate = Pattern.compile("([0-9]{1,}/[0-9]{2}/[0-9]{4})");
        Matcher matcherName = patternForName.matcher(input);
        Matcher matcherBirthDate = patternForBirthDate.matcher(input);
        if (matcherName.find()) {
            String firstName = matcherName.group(2);
            String lastName = matcherName.group(1);
            person.setFistName(firstName);
            person.setLastName(lastName);
        }
        if (matcherBirthDate.find()) {
            String birthDate = matcherBirthDate.group().replace("/", ".");
            person.setBirthDate(birthDate);
        }
        return this.person;
    }

    public String personDetails() {
        return "Person name: " + person.getFistName() + " lastname: " + person.getLastName() + " birthdate: " + person.getBirthDate();
    }
}
