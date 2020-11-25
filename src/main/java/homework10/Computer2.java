package homework10;

public class Computer2 {
    private Monitor monitor2;
    private Keyboard keyboard2;
    private Mouse mouse2;
    private SystemBlock systemBlock2;

    public Computer2(Monitor monitor2, Keyboard keyboard2, Mouse mouse2, SystemBlock systemBlock2) {
        this.monitor2 = monitor2;
        this.keyboard2 = keyboard2;
        this.mouse2 = mouse2;
        this.systemBlock2 = systemBlock2;

    }

    public Monitor getMonitor2() {
        return monitor2;
    }

    public void setMonitor2(Monitor monitor2) {
        this.monitor2 = monitor2;
    }

    public Keyboard getKeyboard2() {
        return keyboard2;
    }

    public void setKeyboard2(Keyboard keyboard2) {
        this.keyboard2 = keyboard2;
    }

    public Mouse getMouse2() {
        return mouse2;
    }

    public void setMouse2(Mouse mouse2) {
        this.mouse2 = mouse2;
    }

    public SystemBlock getSystemBlock2() {
        return systemBlock2;
    }

    public void setSystemBlock2(SystemBlock systemBlock2) {
        this.systemBlock2 = systemBlock2;
    }


    @Override
    public String toString() {
        return "Computer2{" +
                "monitor2=" + monitor2 +
                ", keyboard2=" + keyboard2 +
                ", mouse2=" + mouse2 +
                ", systemBlock2=" + systemBlock2 +
                '}';
    }
}
