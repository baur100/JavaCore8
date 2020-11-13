package homework10;

public class SystemBlock {
    private HDD hdd;
    private MotherBoard motherBoard;
    private CPU cpu;

    public SystemBlock(HDD hdd, MotherBoard motherBoard, CPU cpu) {
        this.hdd = hdd;
        this.motherBoard = motherBoard;
        this.cpu = cpu;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "hdd=" + hdd +
                ", motherBoard=" + motherBoard +
                ", cpu=" + cpu +
                '}';
    }
}
