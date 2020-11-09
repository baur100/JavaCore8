package homework9;

public class Dog {
    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setAge(int age) {
        if (age > 15 || age < 0) {
            throw new ArithmeticException("Wrong age");
        }
        this.age = age;
    }

    public void printDogAge() {
        System.out.println("Dog " + name + " is " + age + " years old");
    }

}
