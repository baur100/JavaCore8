package homework10;

public class MotherBoard {
    private String brand;
    private Type type;

    public MotherBoard(String brand, Type type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "brand='" + brand + '\'' +
                ", type=" + type +
                '}';
    }
}
