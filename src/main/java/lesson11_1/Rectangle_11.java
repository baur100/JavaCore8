package lesson11_1;

public class Rectangle_11 extends Shape_11{
    private double width;
    private double height;

    public Rectangle_11(double width, double height) {
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
