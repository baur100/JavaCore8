package homework8and9.person;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String[] subjects;

    public Person(String name, String lastName, int age, String[] subjects){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.subjects=subjects;
    }
    public void setSubjects(String[] subjects){
        this.subjects = subjects;
    }
    public String[] getSubjects(){
        return subjects;
    }

    public Person(String name){
        this.name=name;
    }

    public Person(){}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void printInfo(){
        System.out.println("Persons demographic: "+name+" "+lastName+" "+age);
    }
    public void printSubjects(){
        for(String v:subjects){
            System.out.println(v);
        }
    }


}
