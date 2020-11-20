package homework14;

public class Person {
    private String name;
    private String LastName;
    private int year;

    public Person(String name, String lastName, int year) {
        this.name = name;
        LastName = lastName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", year=" + year +
                '}';
    }
}
