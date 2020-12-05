package lesson10homework;

public class MyComputer {
    private MyKeyboard myKeyboard;
    private MyMonitor myMonitor;
    private MyMouse myMouse;
    private MySystemBlock mySystemBlock;

    public MyComputer(MyKeyboard myKeyboard, MyMonitor myMonitor, MyMouse myMouse, MySystemBlock mySystemBlock) {
        this.myKeyboard = myKeyboard;
        this.myMonitor = myMonitor;
        this.myMouse = myMouse;
        this.mySystemBlock = mySystemBlock;
    }
}
