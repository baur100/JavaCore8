package homework7;

public class Game {
    private String name;
    private String[] type;
    private int age;


    public Game(String name, String[] type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

    }

    public void Game() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public int getAge() {
        if (age < 0) {
            throw new ArithmeticException("Wrong age");
        }
        return age;
    }

    public void printType() {
        for (String v : this.type) {
            System.out.println(v);
        }
    }

    public void printClass() {
        System.out.println(this.name + " " + this.age);
    }
}


