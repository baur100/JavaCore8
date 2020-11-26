package homework18;

abstract class Herbivores implements Mammals {
    private String kind;

    public Herbivores(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    void vegetation(){
        System.out.println("I eat only vegetation");
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
