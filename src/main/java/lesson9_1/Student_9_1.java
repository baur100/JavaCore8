package lesson9_1;

public class Student_9_1 {
    private String name;
    private String lastName;
    private int groupId;
    private String[] subjects;

    public Student_9_1(String name, String lastName, int groupId, String[] subjects) {
        this.name = name;
        this.lastName = lastName;
        this.groupId = groupId;
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void printSubjects(){
        for (String v: this.subjects){
            System.out.println(v);
        }
    }
    public void goodStudent(){
        System.out.println(this.name + " "+ this.lastName +" is a good student");
    }
}
