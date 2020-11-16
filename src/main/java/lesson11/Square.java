package lesson11;

public class Square extends Rectangle {
    public Square(double width) {
        super(width, width);
    }
    public void draw() {
        System.out.println("I draw square!");
    }
}