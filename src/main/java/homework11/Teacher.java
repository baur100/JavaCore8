package homework11;

public class Teacher extends Person{
    private Subjects subject;
    private Student bestStudent;

    public Teacher(String name, String lastName, int year, Address address, Subjects subject, Student bestStudent) {
        super(name, lastName, year, address);
        this.subject = subject;
        this.bestStudent = bestStudent;

    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public Student getBestStudent() {
        return bestStudent;
    }

    public void setBestStudent(Student bestStudent) {
        this.bestStudent = bestStudent;
    }
}

