package homework12;

public class NewModel implements hips,waist, bust {
    private String gender;
    private String nationality;
    private String agency;


    public NewModel(String gender, String nationality, String agency) {
        this.gender = gender;
        this.nationality = nationality;
        this.agency = agency;
    }

    public void modelPose() {
        System.out.println(gender + " " + nationality + " " + agency + " " + " can pose");
    }

    public void modelWalk() {
        System.out.println(gender + " " + nationality + " " + agency + " " + " can walk");
    }

    @Override
    public void hipscmModelStandart() {
        System.out.println(" Model with great hips measurements ");

    }

    @Override
    public void WaistModelStandart() {
        System.out.println(" Model with great waits measurements");

    }

    @Override
    public void BustModelStandart() {
        System.out.println(" Model with great bust measurements");
    }
}