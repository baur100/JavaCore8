package homework7;

public class Bike {
    private String brand;
    private String color;
    private int wheelssize;
    private String gear;
    private String[] subjects;
}

    public Bike(String brand, String color, int wheelssize, String gear, String[] subjects) {
        this.brand = brand;
        this.color = color;
        this.wheelssize = wheelssize;
        this.gear = gear;
        this.subjects = subjects;
    }

    public Bike() {

    }

    public Bike(String stels, String black, int wheelssize, String shemano, String bikessubject) {

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWheelssize(int wheelssize) {
        if (wheelssize < 0 || wheelssize > 30) {
            throw new ArithmeticException("Wrong wheel size");
        }
        this.wheelssize = wheelssize;
    }

    public int getWheelssize() {
        return wheelssize;
    }

    private void setGear(String gear) {
        this.gear = gear;
    }

    public String getGear() {
        return gear;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void printSubjects() {
        for (String v : this.subjects) {
            System.out.println(v);
        }
    }

    public void printClass() {
        System.out.println(this.brand + " " + this.color + " " + this.wheelssize + " " + this.gear);
    }



