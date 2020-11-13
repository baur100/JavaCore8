package homework10;

public class Monitor {
    private String brand;
    private String model;
    private int screenSize;
    private ScreenType screenType;

    public Monitor(String brand, String model, int screenSize, ScreenType screenType) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.screenType = screenType;
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

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", screenType=" + screenType +
                '}';
    }
}
