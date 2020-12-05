package lesson10homework;

public class Work {
    public static void main(String[] args) {
        //1st MyComputer object
        MyMonitor myFirstMonitor = new MyMonitor("Samsung", "T350", ResolutionType.HD);
        MyKeyboard myFirstKeyboard = new MyKeyboard("Logitech", "ABC10", KeyboardType.MECHANICAL);
        MyMouse myFirstMouse = new MyMouse("Dell", "M300", ConnectionType.WIRELESS_BLUETOOTH);
        CPU myFirstCPU = new CPU("Lenovo", "ABC10", CPUType.DUAL_CORE);
        Motherboard myFirstMotherboard = new Motherboard("HP", "34RVB", MotherboardType.FORMFACTORATX);
        HDD myFirstHDD = new HDD("Toshiba", "43RFG", "4TB", HDDType.HYBRID);

        MySystemBlock myFirstSystemBlock = new MySystemBlock(myFirstHDD, myFirstMotherboard, myFirstCPU);

        MyComputer myFirstComputer = new MyComputer(myFirstKeyboard, myFirstMonitor, myFirstMouse, myFirstSystemBlock);

        // 2nd MyComputer object

        MyMonitor otherMonitor = new MyMonitor("Sony", "F456", ResolutionType.HD_PLUS);
        MyKeyboard otherKeyboard = new MyKeyboard("Logitech", "BCD54", KeyboardType.MULTIMEDIA);
        MyMouse otherMouse = new MyMouse("Microsoft Surface", "2S", ConnectionType.WIRED_PS2);
        CPU otherCPU = new CPU("HP", "G5", CPUType.QUAD_CORE);
        Motherboard otherMotherboard = new Motherboard("Asus", "A45", MotherboardType.MICROATX);
        HDD otherHDD = new HDD("Hitachi", "AT56", "2TB", HDDType.SOLIDSTATE);

        MySystemBlock otherSystemBlock = new MySystemBlock(otherHDD, otherMotherboard, otherCPU);
        MyComputer otherComputer = new MyComputer(otherKeyboard, otherMonitor, otherMouse, otherSystemBlock);





    }
}
