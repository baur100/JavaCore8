package homework10;


import lesson10.ConnectionType;

public class Mouse {
    private String brand;
    private String model;
    private ConnectionTypeMouse connectionTypeMouse;

    public Mouse(String brand, String model, ConnectionTypeMouse connectionTypeMouse) {
        this.brand = brand;
        this.model = model;
        this.connectionTypeMouse = connectionTypeMouse;
    }

    public Mouse() {

    }

    public ConnectionTypeMouse getConnectionTypeMouse() {

        return connectionTypeMouse;
    }

    public void setConnectionTypeMouse(ConnectionType connectionType) {

        this.connectionTypeMouse = connectionTypeMouse;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }


    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", connectionType=" + connectionTypeMouse +
                '}';
    }
}
