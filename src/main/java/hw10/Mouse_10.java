package hw10;



public class Mouse_10 {
    private String brand;
    private String model;
    private ConnectionType_10 connectionType;
    private int price;

    public Mouse_10(String brand, String model, ConnectionType_10 connectionType, int price) {
        this.brand = brand;
        this.model = model;
        this.connectionType = connectionType;
        this.price = price;
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

    public ConnectionType_10 getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType_10 connectionType) {
        this.connectionType = connectionType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Mouse: brand =" + brand + ", model =" + model + ", connectionType =" + connectionType + ", price =" + price);
        }
}
