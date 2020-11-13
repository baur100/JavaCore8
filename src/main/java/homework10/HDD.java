package homework10;

public class HDD {
    private String brand;
    private HDDType hddType;
    private int sizeInGB;

    public HDD(String brand, HDDType hddType, int sizeInGB) {
        this.brand = brand;
        this.hddType = hddType;
        this.sizeInGB = sizeInGB;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public HDDType getHddType() {
        return hddType;
    }

    public void setHddType(HDDType hddType) {
        this.hddType = hddType;
    }

    public int getSizeInGB() {
        return sizeInGB;
    }

    public void setSizeInGB(int sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "brand='" + brand + '\'' +
                ", hddType=" + hddType +
                ", sizeInGB=" + sizeInGB +
                '}';
    }
}
