package Lesson8;

public class Person {

    public String name;
    public String lastname;
    public String age;
    public String nationality;

    public void greet(String otherName){
        System.out.println( "Hello" +" " + otherName+",I am" +" " + name);
    }

    public Person(String name, String lastname, String age, String nationality) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
