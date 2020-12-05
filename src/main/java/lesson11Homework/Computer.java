package lesson11Homework;

public class Computer extends Device {
    private String CPU;
    private HDD HDD;

    public Computer(String deviceType, String brand, String model, String CPU, lesson11Homework.HDD HDD) {
        super(deviceType, brand, model);
        this.CPU = CPU;
        this.HDD = HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public lesson11Homework.HDD getHDD() {
        return HDD;
    }

    public void setHDD(lesson11Homework.HDD HDD) {
        this.HDD = HDD;
    }
}



