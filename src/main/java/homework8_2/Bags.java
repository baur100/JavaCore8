package homework8_2;

public class Bags {
    private String brand;
    private String color;

    public Bags(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    public Bags(){}

    public Bags(String brand) {
        this.brand = brand;
    }

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


    public void printInfo() {
        System.out.println("Bags: " +
                "brand: " + brand + ", color: " + color);
    }
}
