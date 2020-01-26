package list.characters.shapes;

import java.util.ArrayList;
import java.util.List;

public interface Shape {
    List<String> asterisk = new ArrayList<>();

    Shape draw();

    default Shape getAsterisk() {
        asterisk.forEach(System.out::print);
        return this;
    }
}
