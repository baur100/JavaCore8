package homework9;

public class Furniture {
    private String name;
    private String color;
    private double size;

    public Furniture(String name, String color, Double size){
        this.name = name;
        this.color = color;
        this.size = size;
    }
    public Furniture(){}

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getColor(){return color;}
    public void setColor(String color){ this.color = color;}

    public double getSize(){return size;}
    public void setSize( Double size){   this.size = size;}



    public void printClass() {
        System.out.println("Furniture" +
                " name is " + name + ", color is " + color + ", size is " + size );



    }







}
