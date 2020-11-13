package lesson11_1;

import lesson11.Circle;
import lesson11.Rectangle;
import lesson11.Shape;

public class App_11_1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        Circle circle = new Circle(1.5);
        circle.draw();
        System.out.println(circle.getLength());

        Rectangle rectangle = new Rectangle(12,3);
        rectangle.draw();

    }
}
