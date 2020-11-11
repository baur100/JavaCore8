package hw9;

public class Person {
    private String name;
    private String lastName;
    private int age;

    public void setName(String name) {
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
//        this.age = age;
        if(age>100 || age<0){
            throw new ArithmeticException("Wrong age");
        }
    }
    public int getAge(){
        return age;
    }


}
