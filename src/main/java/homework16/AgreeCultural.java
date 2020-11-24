package homework16;

public class AgreeCultural {
    private String nameOfCulture;
    private int fielsNumber;

    public AgreeCultural(String nameOfCulture, int fielsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fielsNumber = fielsNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public int getFielsNumber() {
        return fielsNumber;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public void setFielsNumber(int fielsNumber) {
        this.fielsNumber = fielsNumber;
    }

    @Override
    public String toString() {
        return "\nAgreeCultural: " +
                "\nnameOfCulture: " + nameOfCulture +
                ", fielsNumber: " + fielsNumber;
    }
}
