package homework10;

public class Computer1 {
    private Monitor monitor1;
    private Keyboard keyboard1;
    private Mouse mouse1;
    private SystemBlock systemBlock1;

    public Computer1(Monitor monitor1, Keyboard keyboard1, Mouse mouse1, SystemBlock systemBlock1) {
        this.monitor1 = monitor1;
        this.keyboard1 = keyboard1;
        this.mouse1 = mouse1;
        this.systemBlock1 = systemBlock1;
    }

    public Monitor getMonitor1() {
        return monitor1;
    }

    public void setMonitor1(Monitor monitor1) {
        this.monitor1 = monitor1;
    }

    public Keyboard getKeyboard1() {
        return keyboard1;
    }

    public void setKeyboard1(Keyboard keyboard1) {
        this.keyboard1 = keyboard1;
    }

    public Mouse getMouse1() {
        return mouse1;
    }

    public void setMouse1(Mouse mouse1) {
        this.mouse1 = mouse1;
    }

    public SystemBlock getSystemBlock1() {
        return systemBlock1;
    }

    public void setSystemBlock1(SystemBlock systemBlock1) {
        this.systemBlock1 = systemBlock1;
    }


    @Override
    public String toString() {
        return "Computer1{" +
                "monitor1=" + monitor1 +
                ", keyboard1=" + keyboard1 +
                ", mouse1=" + mouse1 +
                ", systemBlock1=" + systemBlock1 +
                '}';
    }
}
