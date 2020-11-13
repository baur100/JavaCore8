package homework10;

public class Mouse {
    private String brand;
    private String model;
    private Connecti0nType connecti0nType;

    public Mouse(String brand, String model, Connecti0nType connecti0nType) {
        this.brand = brand;
        this.model = model;
        this.connecti0nType = connecti0nType;
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

    public Connecti0nType getConnecti0nType() {
        return connecti0nType;
    }

    public void setConnecti0nType(Connecti0nType connecti0nType) {
        this.connecti0nType = connecti0nType;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", connecti0nType=" + connecti0nType +
                '}';
    }
}
