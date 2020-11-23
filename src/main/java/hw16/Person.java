package hw16;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("Negative Age");
        }
        this.age = age;
    }

    public Person(int age) {
        setAge(age);


    }
}
