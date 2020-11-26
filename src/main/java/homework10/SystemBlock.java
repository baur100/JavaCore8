package homework10;

public class SystemBlock {
    private HDD hdd;
    private CPU cpu;
    private Motherboard motheboard;

    public SystemBlock(HDD hdd, CPU cpu, Motherboard motheboard) {
        this.hdd = hdd;
        this.cpu = cpu;
        this.motheboard = motheboard;
    }


    public SystemBlock() {
    }


    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Motherboard getMotheboard() {
        return motheboard;
    }

    public void setMotheboard(Motherboard motheboard) {
        this.motheboard = motheboard;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "hdd=" + hdd +
                ", cpu=" + cpu +
                ", motheboard=" + motheboard +
                '}';
    }
}
