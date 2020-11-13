package lesson10;

import java.util.Arrays;

public class Student {
    private String name;
    private String lastName;
    private Subjects[] subjects;

    public Student(String name, String lastName, Subjects[] subjects) {
        this.name = name;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Subjects[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
