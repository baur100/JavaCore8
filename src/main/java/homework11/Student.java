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

    public Subjects getMajor() {
        return major;
    }

    public void setMajor(Subjects major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public short getTerm() {
        return term;
    }

    public void setTerm(short term) {
        this.term = term;
    }
}
