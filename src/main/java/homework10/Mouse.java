package homework10;


public class Mouse {
    private String brand;
    private String model;
    private ConnectionType connectionType;

    public Mouse(String brand, String model, ConnectionType connectionType) {
        this.brand = brand;
        this.model = model;
        this.connectionType = connectionType;
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

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", connectionType=" + connectionType +
                '}';
    }
}


//    Заполните содержимым классы Monitor, Keyboard, Mouse, SystemBlock
//Создайте 2 объекта типа Computer в классе Work