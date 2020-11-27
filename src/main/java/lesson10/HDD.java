package Lesson10;

public class HDD {
    private CPU name;
    private CPU model;
    private CPU brand;

    public HDD(CPU name, CPU model, CPU brand) {
        this.name = name;
        this.model = model;
        this.brand = brand;
    }

    public CPU getName() {
        return name;
    }

    public void setName(CPU name) {
        this.name = name;
    }

    public CPU getModel() {
        return model;
    }

    public void setModel(CPU model) {
        this.model = model;
    }

    public CPU getBrand() {
        return brand;
    }

    public void setBrand(CPU brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name=" + name +
                ", model=" + model +
                ", brand=" + brand +
                '}';
    }
}
