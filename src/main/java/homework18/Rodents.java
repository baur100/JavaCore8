package homework18;

abstract class Rodents implements Mammals {
    public String kind;

    public Rodents(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    void excavate(){
        System.out.println("I can excavate burrows");
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
