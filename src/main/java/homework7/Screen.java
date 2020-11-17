package homework7;

public class Screen {
    private String brand;
    private String[] subjects;
    private int size;


    public Screen(String brand, String[] subjects, int size) {
        this.brand = brand;
        this.subjects = subjects;
        this.size = size;
    }

    public Screen() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;

    }

    public void setSize(int size) {
        if (size < 10 || size > 100) {
            throw new ArithmeticException("Wrong screen size");
        }
        this.size = size;

    }
    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;

    }

    public void printSubjects() {
        for (String v : this.subjects) {
            System.out.println(v);
        }
    }

    public void printClass() {
        System.out.println(this.brand + "" + this.size);
    }
}
