package homework10;

import java.util.Arrays;

public class Monitore {
    private Colors[] color;
    private int size;
    private String[] mbrand;

    public Monitore(Colors[] color, int size, String[] mbrand) {
        this.color = color;
        this.size = size;
        this.mbrand = mbrand;
    }

    public Monitore() {
    }

    public Colors[] getColor() {
        return color;
    }

    public void setColor(Colors[] color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String[] getBrand() {
        return mbrand;
    }

    public void setBrand(String[] mbrand) {
        this.mbrand = mbrand;
    }

    @Override
    public String toString() {
        return "Monitore{" +
                "color=" + Arrays.toString(color) +
                ", size=" + size +
                ", mbrand=" + Arrays.toString(mbrand) +
                '}';
    }
}
