package homeworkND8;

public class Bags {
    private String brand;
    private String color;

    public Bags(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    public Bags(){}

    public void setBrand(String b){
        brand = b;
    }
    public String getBrand(){
        return brand;
    }

    public void setColor(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }


}
