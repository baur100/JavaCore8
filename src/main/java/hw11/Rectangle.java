package hw11;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getLenght() {
        return (this.width + this.height);

    }

    public double getSquere() {
        return (this.width * this.height);
    }

    public void draw() {
        System.out.println("I draw a rectangle.");
    }
}