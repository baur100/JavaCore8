package homework10;

public class SystemBlock {
    private String brand;
    private String model;
    private SBType sbType;

    public SystemBlock(String brand, String model, SBType sbType){
        this.brand=brand;
        this.model=model;
        this.sbType=sbType;
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

    public SBType getSbType() {
        return sbType;
    }

    public void setSbType(SBType sbType) {
        this.sbType = sbType;
    }
    public String toString(){
        return "SystemBlock{"+
                "brand="+brand+
                ", model="+model+
                "sb type="+sbType+
                "}";
    }
}
