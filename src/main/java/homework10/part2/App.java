package homework10.part2;

import homework10.part2.*;

public class App {
    public static void main(String[] args) {
        Mouse x10=new Mouse("Logitech","x10", ConnectionType.WIRELESS_TOKEN);
        Mouse x11=new Mouse("Logitech","x11", ConnectionType.WIRELESS_BLUETOOTH);
        Mouse x12=new Mouse("Logitech","x12", ConnectionType.WIRED_USB);
        Mouse x13=new Mouse("Logitech","x13", ConnectionType.WIRED_PS2);
        Mouse[] myMouse={x10,x11,x12,x13};

        Keyboard K1=new Keyboard("Yamaha","K11",SizeType.STANDARD);
        SystemBlock b1=new SystemBlock("Ryzen","rx570",SBType.VERTICAL);
        Monitor M120=new Monitor("Apple","m120",ResolutionType.HIGH);

        System.out.println(b1.toString());
        System.out.println(x10.toString());

        Computer myComp=new Computer(M120,K1,myMouse,b1);
        System.out.println(myComp);


    }


}
