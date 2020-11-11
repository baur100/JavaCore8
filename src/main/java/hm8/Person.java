package hm8;

public class Person {
    public String name;
    public String lastName;
    public int age;
    public String job;

    public void printInfo() {
        System.out.println(name+" "+ lastName + " is " +age + " years old. " + "She is a " +job+ ".");
    }
}
