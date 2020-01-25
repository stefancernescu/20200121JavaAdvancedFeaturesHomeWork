package vehicle;

public class Person {
    private String fistName;
    private String lastName;
    private String birthDate;

    public Person(String fistName, String lastName, String birthDate) {
        super();
        this.fistName = fistName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person() {
        super();
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
