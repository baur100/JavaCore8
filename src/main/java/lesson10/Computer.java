package Lesson10;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitore monitore;
    private Systemblock systemblock;

    public Computer(Keyboard keyboard, Mouse mouse, Monitore monitore, Systemblock systemblock) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitore = monitore;
        this.systemblock = systemblock;
    }

    public Computer(String kiki, Class<Mouse> mouseClass, String screen, String hdd) {
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

    public Systemblock getSystemblock() {
        return systemblock;
    }

    public void setSystemblock(Systemblock systemblock) {
        this.systemblock = systemblock;
    }
}
