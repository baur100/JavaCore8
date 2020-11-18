package homework9;


import java.awt.*;

public class Windows {
    private int size;
    private Type[] type;
    private Color color;

    public Windows(int size, Type[] type, Color color) {
        this.size = size;
        this.type = type;
        this.color = color;
    }
//    public Windows(Type[] type) {
//        this.type = type;
//    }
//
//
//    public Windows(int size) {
//        this.size = size;
//    }

    public Windows() {

    }

    public void setsize(int size) {
      if (size< 1) {
            throw new ArithmeticException("Wrong sixe");
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type[] getType() {
        return type;
    }

    public void setType(Type[] type) {
        this.type = type;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printtype() {
        for (Type v : this.type) {
            System.out.println(v);
        }


        public String toString(){
            System.out.println(this.size + "" + this.type + " " + this.color);
        }
    }
}
