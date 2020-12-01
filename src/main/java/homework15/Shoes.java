package homework15;

public class Shoes {
    private String brand;
    private int size;


    public  Shoes(){
    }
    public Shoes (String brand,int size){
        this.brand=brand;
        this.size=size;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand=brand;
    }
    public int getSize(){
        return size;
    }
    public void setSize(){
        this.size=size;
    }

    @Override
    public String toString() {
        return "Shoes{" +"brand='" + brand + '\'' +", size=" + size +'}';
    }
}