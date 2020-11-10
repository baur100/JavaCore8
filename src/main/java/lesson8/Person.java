package lesson8;

public class Person {
    public String name;
    public String lastName;
    public int age;

    public void greet(String otherName){
        System.out.println("hi, "+otherName+", i am "+name);
    }
}
