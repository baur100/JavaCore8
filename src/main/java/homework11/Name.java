package homework11;

public class Name {
    private String personName;

    public Name(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "personName='" + personName + '\'' +
                '}';
    }
}



