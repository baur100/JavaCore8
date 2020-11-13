package lesson10;

public class App {
    public static void main(String[] args) {
        Subjects[] joeSubjects = {Subjects.BIOLOGY, Subjects.IT};

        Student joe = new Student("Joe", "biden", joeSubjects);

        System.out.println(joe);


    }
}
