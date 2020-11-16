package lesson12_1;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("I draw rectangle");
    }

    @Override
    public double getSquare() {
        return this.height*this.width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.width+this.height);
    }
}
