package lesson12_1;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    @Override
    public void draw(){
        System.out.println("I draw Square");
    }
}
