package lesson10;

public class Student {
    private String name;
    private String lastName;
    private int groupId;
    private Subjects[] subjects;

    public Student(String name, String lastName, int groupId, Subjects[] subjects) {
        this.name = name;
        this.lastName = lastName;
        this.groupId = groupId;
        this.subjects = subjects;
    }
}
