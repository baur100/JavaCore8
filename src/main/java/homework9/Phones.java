package homework9;

public class Phones {
    private OSys osys;
    private String color;
    private int price;
    private String brand;


    public Phones(OSys osys, String color, int price, String brand) {
        this.osys = osys;
        this.color = color;
        this.price = price;
        this.brand = brand;


    }

    public void Phones() {
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public OSys getOsys() {
        return osys;
    }

    public void setOsys(OSys osys) {
        this.osys = osys;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
