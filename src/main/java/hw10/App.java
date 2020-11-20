package hw10;

public class App {
    public static void main(String[] args) {
        Colors[] colors={Colors.BLUE,Colors.BROWN,Colors.GREEN,Colors.GREY,Colors.HAZEL,Colors.YELLOW};
        Monitor len = new Monitor("Lenovo", "G50-70", colors, 2000);
        len.getBrand();
        len.getModel();
        len.getColor();
        len.getYear();
        System.out.println(len.toString());
        System.out.println("*****************");
        Keyboard mK = new Keyboard("logitech MK-520", "MK-520", Colors.BROWN,2020);
        mK.getBrand();
        mK.getModel();
        mK.getColor();
        mK.getYear();
        System.out.println("*****************");
        Mouse sF = new Mouse("Surface", "Flashing", Colors.GREEN,2020);
        sF.getBrand();
        sF.getColor();
        sF.getfeatures();
        sF.getYear();
        System.out.println("*****************");
        SystemBlock CPU = new SystemBlock("Smart", "Lightening", 2020);
        CPU.getBrand();
        CPU.getFeatures();
        CPU.getYear();
    }
}