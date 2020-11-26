package homework10;

import java.util.Arrays;

public class HDD {
    private int[] size;
    private String[] make;

    public HDD(int[] size, String[] make) {
        this.size = size;
        this.make = make;
    }



    public HDD() {
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public String[] getMake() {
        return make;
    }

    public void setMake(String[] make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "size=" + Arrays.toString(size) +
                ", make=" + Arrays.toString(make) +
                '}';
    }
}
