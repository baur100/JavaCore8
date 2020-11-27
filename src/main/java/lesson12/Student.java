package lesson12;

public class Student extends Person {
    public Student(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void getPersonInfo() {
        System.out.println("I'm a student - My name - "+name+" "+lastName);
    }
}
