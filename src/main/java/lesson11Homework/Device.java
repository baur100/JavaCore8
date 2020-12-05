package lesson11Homework;

public class Device {
    protected String deviceType;
    protected String brand;
    protected String model;

    Device() {}

    public Device(String deviceType, String brand, String model) {
        this.deviceType = deviceType;
        this.brand = brand;
        this.model = model;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
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
}



