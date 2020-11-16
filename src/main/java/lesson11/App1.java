package lesson11;

public class App1 {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.draw();
        Circle circle=new Circle(1.5);
        circle.draw();
        Rectangle rectangle=new Rectangle(12, 3);
        rectangle.draw();
//        Square square=new Square();
//        square.draw();
    }
}
