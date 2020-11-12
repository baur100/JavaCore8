package hw10;

public class SystemBlock {
    private String brand;
    private String features;
    private int year;

    public SystemBlock(String brand, String features, int year) {
        this.brand = brand;
        this.features = features;
        this.year = year;
    }

    public void SPUBrand() {

        System.out.println("I choose  brand new  " + brand+ " last model");
    }

    public void SPUFeatures() {
        System.out.println("I love the " + features+ " features");
    }

    public void SPUYear() {

        System.out.println("I prefer the " + year + " year");
    }
}
