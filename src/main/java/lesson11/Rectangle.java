package lesson11;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getLength(){
        return (this.width+this.height)*2;
    }
    public double getSquare(){
        return this.height*this.width;
    }
    @Override
    public /* final */ void draw(){
        System.out.println("I draw a rectangle");
    }
}
