package Lesson10;

public class Motherboard {
    private String layers;
    private String copper;

    public Motherboard(String layers, String copper) {
        this.layers = layers;
        this.copper = copper;
    }

    public String getLayers() {
        return layers;
    }

    public void setLayers(String layers) {
        this.layers = layers;
    }

    public String getCopper() {
        return copper;
    }

    public void setCopper(String copper) {
        this.copper = copper;
    }
}
