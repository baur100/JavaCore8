package homework16;

import javax.sound.midi.Soundbank;

public class AgreeCultural {
    private String nameOfCulture;
    private int fieldNumber;
    public void printCultureInfo(){System.out.println(nameOfCulture+" - field #"+fieldNumber); };


    public AgreeCultural(String nameOfCulture, int fieldNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }


    @Override
    public String toString() {
        return " " + nameOfCulture +
                " - field #" + fieldNumber;
    }
}
