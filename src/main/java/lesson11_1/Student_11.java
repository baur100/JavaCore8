package lesson11_1;

public class Student_11 extends Person_11{
    private Subjects major;
    private String college;
    private short term;

    public Student_11(String name, String lastName, int year, Address_11 address, Subjects major, String college, short term) {
        super(name, lastName, year, address);
        this.major = major;
        this.college = college;
        this.term = term;
    }
}
