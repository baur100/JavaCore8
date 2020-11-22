package lesson9;

public class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age){
        this.name=name;
        this.lastName = lastName;
        setAge(age);
    }
    public Person(String name){
        this.name=name;
    }
    public Person(){}

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setAge(int age){
        if(age>110 || age <0){
            throw new ArithmeticException("Wrong age");
        }
        this.age=age;
    }


}
