package homework10.part2;

public class Keyboard {
    private String brand;
    private String model;
    private SizeType sizeType;

    public Keyboard(String brand,String model,SizeType sizeType){
        this.brand=brand;
        this.model=model;
        this.sizeType=sizeType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SizeType getSizeType() {
        return sizeType;
    }

    public void setSizeType(SizeType sizeType) {
        this.sizeType = sizeType;
    }
    public String toString(){
        return "Keyboard{"+
                "brand="+brand+
                ", model="+model+
                ", size type="+sizeType+
                "}";
    }
}
