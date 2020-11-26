package homework18;

abstract class Whales implements Mammals {
    private String kind;

    public Whales(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    void weight600p(){
        System.out.println("I can weight 600 pounds");
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
