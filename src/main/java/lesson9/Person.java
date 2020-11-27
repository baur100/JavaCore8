package Lesson9;

public class Person {
    private String name;
    private String lastName;
    private String age;

    public Person(String name, String lastName, String age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void setName(String nm) {
        name = nm;
    }
    public String getName(){
        return name;

    }
    public void setLastname(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            throw new ArithmeticException("Wrong age ");
        }
    }
}

