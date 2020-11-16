package lesson11;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    private double getlength(){
        return (this.width+this.height)*2;
    }

    public double getRadius() {
        return this.height*this.width;
    }
    public void draw(){
        System.out.println("I draw rectangle!");
    }
}
