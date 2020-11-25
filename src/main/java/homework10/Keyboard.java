package homework10;

public class Keyboard {
    private String brand;
    private String model;
    private String language;
    private ConnectionType connectionType;

    public Keyboard(String brand, String model, String language, ConnectionType connectionType) {
        this.brand = brand;
        this.model = model;
        this.language = language;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", language='" + language + '\'' +
                ", connectionType=" + connectionType +
                '}';
    }
}


//    Заполните содержимым классы Monitor, Keyboard, Mouse, SystemBlock
//Создайте 2 объекта типа Computer в классе Work