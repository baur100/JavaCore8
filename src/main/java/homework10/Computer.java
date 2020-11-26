package homework10;



public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitore monitore;
    private SystemBlock systemblock;

    public Computer(Keyboard keyboard, Mouse mouse, Monitore monitore, SystemBlock systemblock) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitore = monitore;
        this.systemblock = systemblock;
    }

    public Computer() {
    }

    public Keyboard getKeyboard() {

        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;

    }

    public Mouse getMouse() {

        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;

    }

    public Monitore getMonitore() {

        return monitore;
    }

    public void setMonitore(Monitore monitore) {
        this.monitore = monitore;

    }

    public SystemBlock getSystemblock()    {
        return systemblock;
    }

    public void setSystemblock(SystemBlock systemblock) {
        this.systemblock = systemblock;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", monitore=" + monitore +
                ", systemblock=" + systemblock +
                '}';
    }
}