package homework18;
abstract class Primates implements Mammals {
    public String kind;

    public Primates(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    void largeBrain(){
        System.out.println("I have brain");
    }

    @Override
    public void haveHair() {

    }

    @Override
    public void skull() {

    }

    @Override
    public void move() {

    }

    @Override
    public void breath() {

    }

    @Override
    public void reproduction() {

    }

    @Override
    public void nutrition() {

    }

    @Override
    public void responsivness() {

    }
}
