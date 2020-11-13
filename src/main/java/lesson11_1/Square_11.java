package lesson11_1;

public class Square_11 extends Rectangle_11 {
    public Square_11(double width) {
        super(width, width);
}
    @Override
    public void draw(){
        System.out.println("I draw a square");
    }
}
