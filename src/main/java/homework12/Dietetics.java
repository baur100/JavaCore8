package homework12;

public class Dietetics implements hips, waist {
    private String name;
    private String gender;
    private String length;
    private int kilos;

    public Dietetics(String name, String gender, String length, int kilos) {
        this.name = name;
        this.gender = gender;
        this.length = length;
        this.kilos = kilos;
    }


    public void lostWeight(){
        System.out.println(name + " " + length + " " + " lost " + kilos + " " + " kilos");

    }

    @Override
    public void WaistModelStandart() {
        System.out.println(" Now im in a good shape");

    }

    @Override
    public void hipscmModelStandart() {
        System.out.println(" Im skinny enough now for a modeling");

    }
}

