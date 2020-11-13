package lesson11_1;

public class Circle_11 extends Shape_11 {
    private double radius;

    public Circle_11(double radius) {
        this.radius = radius;
    }

    public double getLength(){
        return radius*2*Math.PI;
    }
    public double getSquare(){
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public void draw(){
        System.out.println("I draw a circle");
    }
}
