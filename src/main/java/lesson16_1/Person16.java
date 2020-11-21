package lesson16_1;

public class Person16 {
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

    public Person16(int age) {
        this.age = age;
    }
}
