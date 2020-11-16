package lesson12;

public class App1 {
    public static void main(String[] args) {
        Square sq1 = new Square(5);
//        sq1.draw();
//        System.out.println(sq1.getPerimeter());
//        System.out.println(sq1.getSquare());

        Rectangle rt1 = new Rectangle(2,4);
//        rt1.draw();
//        System.out.println(rt1.getPerimeter());
//        System.out.println(rt1.getSquare());

        Circle cr1 = new Circle(5);
//        cr1.draw();
//        System.out.println(cr1.getPerimeter());
//        System.out.println(cr1.getSquare());

        Shape[] shapes = {sq1, rt1, cr1};
        for (Shape shape : shapes){
            shape.draw();
        }




    }
}
