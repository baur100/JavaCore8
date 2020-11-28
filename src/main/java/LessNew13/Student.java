package LessNew13;

public class Student extends Person {

    public Student(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public void getPersonInfo() {
        System.out.println("I am a new student - My name -"+name+""+lastname);


    }
}
