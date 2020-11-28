package homework13;

public class Tools {
    private String make;



    public Tools(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return "Tools{" +
                "make='" + make + '\'' +
                '}';
    }
}
