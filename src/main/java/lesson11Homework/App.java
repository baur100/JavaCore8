package lesson11Homework;

public class App {
    public static void main(String[] args) {
        HDD myHDD = new HDD("Dell 400-ATKL", HDDType.HYBRID);
        Computer myComputer = new Computer("Desktop Computer", "Lenovo", "IdeaCentre 510A", "AMD - Ryzen 7", myHDD);

        Network myNetwork = new Network("Verizon", NetworkType.CDMA);
        Smartphone mySmartphone = new Smartphone("Smartphone","Samsung", "Galaxy S10", "5.8 inches", myNetwork);


        System.out.println(myComputer.getHDD().getHDDName());
        System.out.println(myComputer.getHDD().getHDDType());
        System.out.println(mySmartphone.getNetwork().getOperator());
        System.out.println(mySmartphone.getNetwork().getNetworkType());





    }
}
