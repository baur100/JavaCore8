package hw10;

public class Monitor {
    private String brand;
    private String model;
    private Colors[] color;
    private int year;

    public Monitor(String brand, String model, Colors[] color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(Colors Color) {
        this.color = color;
    }

    public Colors[] getColor() {
        return color;
    }

    public void setYear() {
        this.year = year;
    }

    public int getYear(int year) {
        return year;
    }



    public void lenBrand() {
        System.out.println("I liked  " + brand+ " brand");
    }
    public void lenModel() {
        System.out.println("So, I desise to buy " + model+ " model");
    }

    public void lenColor() {
        System.out.println("There was " + Arrays.toString(color) + " colors, but I prefer WHITE " );
    }
    public void getYear() {
        System.out.println("I liked model made in " + year);
    }
}


//    public String toString() {
//        return "Monitor{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", color=" + Arrays.toString(color) +
//                ", year=" + year +
//                '}';
//    }
//}

