package lesson11_1;

public class Teacher_11 extends Person_11{
    public Address_11 getAddress;
    private Subjects_11 major;

    public Teacher_11(String name, String lastName, int year, Address_11 address, Subjects_11 major) {
        super(name, lastName, year, address);
        this.major = major;
    }
}
