package homework11;

public class Teacher extends Person{

    private Subjects subject;

    public Teacher(String name, String lastName, int year, Address address, Subjects subject){
        super(name, lastName, year, address);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject=" + subject +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", address=" + address +
                '}';
    }
}
