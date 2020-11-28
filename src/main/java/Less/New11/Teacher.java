package Less.New11;

public class Teacher extends Person{
    private Subjects subject;

    public Teacher(String name, String lastname, int year, Address address, Subjects subject) {
       super(name, lastname, year, address);
        this.subject = subject;
    }
}
