package lesson12;

import java.security.PublicKey;

public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("i draw circle");

    }

    @Override
    public double getSquare() {
       return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
}
