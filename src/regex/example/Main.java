package regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";
        System.out.println(EXAMPLE_TEST);

        int splitString = EXAMPLE_TEST.split("\\s+").length;
        //+ cauta o data sau de mai multe ori patternul pe care il dorim
        //\\s whitesplace caracters
        System.out.println(splitString);

        System.out.println(EXAMPLE_TEST.replaceAll("\\s+"," \t "));

        String test = "Lucian este profesor. Lucian preda";
        System.out.println(test.matches(".*Lucian.*"));
        System.out.println(test.matches("^[^\\d].*"));
        System.out.println("----------");
        System.out.println(Pattern.matches("...a","assa"));

        Pattern pattern = Pattern.compile("m?");
        Matcher matcher = pattern.matcher("m");
        System.out.println(matcher.matches());
    }
}
