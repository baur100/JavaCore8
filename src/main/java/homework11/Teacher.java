package homework11;

public class Teacher {
    private String name;
    private String lastName;
    private int year;
    private Address address;
    private Subjects subject;

    public Teacher(String name, String lastName, int year, Address address, Subjects subject){
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.address = address;
        this.subject = subject;
    }

}
