package hw10;

public class Computer_10 {
    private SystemBlock_10 systemBlock;
    private Keyboard_10 keyboard;
    private Mouse_10 mouse;
    private Monitore_10 monitor;

    public Computer_10(SystemBlock_10 systemBlock, Keyboard_10 keyboard, Mouse_10 mouse, Monitore_10 monitor) {
        this.systemBlock = systemBlock;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public SystemBlock_10 getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock_10 systemBlock) {
        this.systemBlock = systemBlock;
    }

    public Keyboard_10 getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard_10 keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse_10 getMouse() {
        return mouse;
    }

    public void setMouse(Mouse_10 mouse) {
        this.mouse = mouse;
    }

    public Monitore_10 getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitore_10 monitor) {
        this.monitor = monitor;
    }

    public void printInfo() {
        System.out.println("Information about the computer.");
        keyboard.printInfo();
        monitor.printInfo();
        mouse.printInfo();
        systemBlock.printInfo();
    }
}
