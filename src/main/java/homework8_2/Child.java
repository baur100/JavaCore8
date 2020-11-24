package homework8_2;

public class Child {
    private String name;
    private String lastName;
    private int age;

    public Child(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public Child(){}

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
        if(age>100 || age<0){
            throw new ArithmeticException("Wrong age");
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
