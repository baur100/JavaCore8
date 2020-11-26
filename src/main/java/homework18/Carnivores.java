package homework18;

abstract class Carnivores implements Mammals{
    protected String kind;

    void killing(){
        System.out.println("I can kill other");
    }

    @Override
    public void haveHair() {
        System.out.println("I'm hairy");
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
