package homework10;

import java.util.Arrays;

public class Motherboard {
    private String[] make;

    public Motherboard(String[] make) {
        this.make = make;
    }

    public Motherboard() {
    }


    public String[] getMake() {
        return make;
    }

    public void setMake(String[] make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "make=" + Arrays.toString(make) +
                '}';
    }
}
