package homework10;

import java.util.Arrays;

public class CPU {
    private String[] make;
    private double herz;
    private String[] model;
    private int cores;
    private Cash[] cash;

    public CPU(String[] make, double herz, String[] model, int cores, Cash[] cash) {
        this.make = make;
        this.herz = herz;
        this.model = model;
        this.cores = cores;
        this.cash = cash;
    }

    public CPU() {
    }

    public String[] getMake() {
        return make;
    }

    public void setMake(String[] make) {
        this.make = make;
    }

    public double getHerz() {
        return herz;
    }

    public void setHerz(double herz) {
        this.herz = herz;
    }

    public String[] getModel() {
        return model;
    }

    public void setModel(String[] model) {
        this.model = model;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public Cash[] getCash() {
        return cash;
    }

    public void setCash(Cash[] cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "make=" + Arrays.toString(make) +
                ", herz=" + herz +
                ", model=" + Arrays.toString(model) +
                ", cores=" + cores +
                ", cash=" + Arrays.toString(cash) +
                '}';
    }
}
