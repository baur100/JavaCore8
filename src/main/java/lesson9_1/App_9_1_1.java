package lesson9_1;

import lesson9.Student;

public class App_9_1_1 {
    public static void main(String[] args) {
        String[] nadezhdasSubjects =  {"Math","Biology","History"};
        Student nadezhda = new Student("Nadezhda","K",123458,nadezhdasSubjects);
        nadezhda.goodStudent();

        String[]borisSubjects = {"Poetry","Literature"};
        Student borisTheBlade = new Student("Boris","the Blade",365478,borisSubjects);
        borisTheBlade.goodStudent();

        System.out.println(borisTheBlade.getLastName());
        nadezhda.printSubjects();
    }
}
