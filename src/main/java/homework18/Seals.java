package homework18;

abstract class Seals implements Mammals {
    public String kind;

    public Seals(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    void useWhiskers(){
        System.out.println("I can use my whiskers");
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
