package homework12;

public abstract class CellPhone implements Voltage110Standard, LithiumIonBattery{
    protected String brand;
    protected String model;
    protected OperatingSystem os;
    public abstract void getCellPhoneInfo();

    public CellPhone(String brand, String model, OperatingSystem os) {
        this.brand = brand;
        this.model = model;
        this.os = os;
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

    public OperatingSystem getOs() {
        return os;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }
}
