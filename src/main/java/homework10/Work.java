package homework10;

public class Work {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Samsung", "WORLD", ConnectionType.WIRELESS_TOKEN);
        Keyboard keyboard1 = new Keyboard("Samsung", "KOPTnrI", "Russian", ConnectionType.WIRELESS_BLUETOOTH);
        Monitor monitor1 = new Monitor("Samsung", "FopjLK", ConnectionType.WIRED_USB);
        SystemBlock systemBlock1 = new SystemBlock("Samsung", "BbkOPl", ConnectionType.WIRED_PS2);

        System.out.println(mouse1);
        System.out.println("+++++++++");
        System.out.println(keyboard1);
        System.out.println("++++++++++");
        System.out.println(monitor1);
        System.out.println("+++++++++");
        System.out.println(systemBlock1);
        System.out.println("++++++++++");

        Computer1 computer1 = new Computer1(monitor1, keyboard1, mouse1, systemBlock1);
        System.out.println(computer1);
        System.out.println("=====================");

        Mouse mouse2 = new Mouse("HD", "VolPP", ConnectionType.WIRED_USB);
        Keyboard keyboard2 = new Keyboard("HD", "BlPP", "Russian", ConnectionType.WIRED_USB);
        Monitor monitor2 = new Monitor("HD", "VBW", ConnectionType.WIRELESS_BLUETOOTH);
        SystemBlock systemBlock2 = new SystemBlock("HD", "ASpoH", ConnectionType.WIRED_USB);

        System.out.println(mouse2);
        System.out.println("+++++++++++");
        System.out.println(keyboard2);
        System.out.println("+++++++++++++");
        System.out.println(monitor2);
        System.out.println("+++++++++++");
        System.out.println(systemBlock2);
        System.out.println("++++++++++++++");

        Computer2 computer2 = new Computer2(monitor2, keyboard2, mouse2, systemBlock2);
        System.out.println(computer2);

    }
}


//    Заполните содержимым классы Monitor, Keyboard, Mouse, SystemBlock
//Создайте 2 объекта типа Computer в классе Work