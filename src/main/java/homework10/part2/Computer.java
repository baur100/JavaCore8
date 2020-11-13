package homework10.part2;

import homework10.part2.Keyboard;
import homework10.part2.Monitor;
import homework10.part2.Mouse;
import homework10.part2.SystemBlock;

import java.util.Arrays;

public class Computer {
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse[] mouse;
    private SystemBlock systemBlock;

    public Computer(Monitor monitor, Keyboard keyboard, Mouse[] mouse, SystemBlock systemBlock) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systemBlock = systemBlock;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse[] getMouse() {
        return mouse;
    }

    public void setMouse(Mouse[] mouse) {
        this.mouse = mouse;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }


    public String toString() {
        return "Computer:" +
                "\nmonitor=" + monitor +
                "\nkeyboard=" + keyboard +
                "\nmouse=" + Arrays.toString(mouse) +
                "\nsystem block=" + systemBlock;
    }

}
