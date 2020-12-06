package homework10;

public class App {
    public static void main(String[] args) {
        Shape fruitType = Shape.ROUND;

        Fruit apple = new Fruit("apple", "red", Shape.ROUND);
        System.out.print(apple);
    }
}
