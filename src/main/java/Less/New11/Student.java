package Less.New11;

public class Student extends Person{
    private Subjects subjects;
    private String group;
    private short trimester;

    public Student(String name, String lastname, int year, Address address, Subjects subjects, String group, short trimester) {
        super(name, lastname, year, address);
        this.subjects = subjects;
        this.group = group;
        this.trimester = trimester;
    }
}
