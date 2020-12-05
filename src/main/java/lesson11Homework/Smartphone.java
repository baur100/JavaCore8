package lesson11Homework;

public class Smartphone extends Device {
    private String screenSize;
    private Network network;

    public Smartphone (String deviceType, String brand, String model, String screenSize, Network network){
        super(deviceType, brand, model);
        this.screenSize = screenSize;
        this.network = network;

    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
}
