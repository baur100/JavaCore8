package hw11;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getLenght() {
        return radius * 2 * Math.PI;

    }

    public double getSquere() {
        return Math.PI * this.radius * this.radius;
    }
    @Override

    public void draw() {
        System.out.println("I draw a circle.");
    }
}