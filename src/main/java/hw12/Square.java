package hw12;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
    }
    @Override
    public void draw(){
        System.out.println("I draw Square");
    }
}