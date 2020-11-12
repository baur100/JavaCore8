package homework10;

public class Monitor {
    private String brand;
    private String model;
    private ResolutionType resolutionType;

    public Monitor(String brand,String model,ResolutionType resolutionType){
        this.brand=brand;
        this.model=model;
        this.resolutionType=resolutionType;
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

    public ResolutionType getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(ResolutionType resolutionType) {
        this.resolutionType = resolutionType;
    }
    public String toString(){
        return "Monitor{"+
                "brand="+brand+
                ", model="+model+
                ", resolution Type="+resolutionType+
                "}";
    }
}
