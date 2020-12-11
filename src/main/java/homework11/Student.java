package homework11;

public class Student extends Person{
    private Subjects major;
    private String college;
    private short term;

    public Student(String name, String lastName, int year, Address address, Subjects major, String college, short term) {
        super(name, lastName, year, address);
        this.major = major;
        this.college = college;
        this.term = term;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major=" + major +
                ", college='" + college + '\'' +
                ", term=" + term +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", address=" + address +
                '}';
    }
}

