package Lesson10;

public class Systemblock {
    private HDD hdd;
    private Motherboard motherboard;
    private CPU cpu;

    public Systemblock(HDD hdd, Motherboard motherboard, CPU cpu) {
        this.hdd = hdd;
        this.motherboard = motherboard;
        this.cpu = cpu;
    }

    public Systemblock(HDD hdd, String cooper, String s) {
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
