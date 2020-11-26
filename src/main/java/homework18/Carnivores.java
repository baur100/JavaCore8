package homework18;

abstract class Carnivores implements Mammals{
    public String kind;

    public Carnivores(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    void killing(){
        System.out.println("I can kill others");
    }

    @Override
    public void haveHair() {
        System.out.println("Im hairy");
    }

    @Override
    public void skull() {
        System.out.println("I have brain in skull");
    }

    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void breath() {
        System.out.println("I can breath");
    }

    @Override
    public void reproduction() {
        System.out.println("I can reproduce");
    }

    @Override
    public void nutrition() {
        System.out.println("I can eat");
    }

    @Override
    public void responsivness() {
        System.out.println("I can response");
    }
}
