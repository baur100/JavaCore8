package hw10;

public class SystemBlock_10 {
    private String brand;
    private Processor_10 processor;
    private Motherboard_10 motherboard;
    private HDD_10 hdd;
    private int price;

    public SystemBlock_10(String brand, Processor_10 processor, Motherboard_10 motherboard, int price) {
        this.brand = brand;
        this.processor = processor;
        this.motherboard = motherboard;
        this.hdd = hdd;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Processor_10 getProcessor() {
        return processor;
    }

    public void setProcessor(Processor_10 processor) {
        this.processor = processor;
    }

    public Motherboard_10 getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard_10 motherboard) {
        this.motherboard = motherboard;
    }

    public void setHdd(HDD_10 hdd) {
        this.hdd = hdd;
    }

    public HDD_10 getHdd(){
        return hdd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("System Block: brand is " + brand + ", price is " + price);
        processor.printInfo();
        motherboard.printInfo();
    }
}
