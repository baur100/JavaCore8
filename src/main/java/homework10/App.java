package homework10;

public class App {
    public static void main(String[] args) {
        Mouse v10 = new Mouse("logitech", "V10", Connecti0nType.WIRELESS_TOKEN);
        Monitor mon1 = new Monitor("AOC", "Model", 27,ScreenType.LCD);
        Keyboard ke1 = new Keyboard("Logitech", "KE1", ConnectionType.WIRED);
        HDD disk = new HDD("Toshiba", HDDType.SSD, 500);
        MotherBoard mazBo = new MotherBoard("Intel", Type.ATX);
        CPU intelCore = new CPU("Intel Core I7", 8, 3.2);
        SystemBlock bloc = new SystemBlock(disk,mazBo,intelCore);
        Computer myComp = new Computer(ke1, v10, mon1, bloc);

        System.out.println(myComp.getSystemBlock().getMotherBoard().getBrand());

    }
}
