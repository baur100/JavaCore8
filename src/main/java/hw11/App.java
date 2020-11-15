package hw11;

public class App {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        Circle circle = new Circle(2.5);
        circle.draw();
        System.out.println(circle.getLenght());
        Rectangle rectangle = new Rectangle(12, 7);
        rectangle.draw();

    }
}
