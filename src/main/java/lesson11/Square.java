package lesson11;

public class Square extends Rectangle{
    public Square(double width) {
        super(width, width);
    }
    @Override
    public void draw(){
        System.out.println("I draw a square");
    }
}
