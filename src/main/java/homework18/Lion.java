package homework18;

class Lion extends Carnivores{
    private String name;

    public Lion(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void king(){
         System.out.println("I can be the king");
     }



    @Override
    void killing() {
        super.killing();
    }

    @Override
    public void haveHair() {
        super.haveHair();
    }

    @Override
    public void skull() {
        super.skull();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void breath() {
        super.breath();
    }

    @Override
    public void reproduction() {
        super.reproduction();
    }

    @Override
    public void nutrition() {
        super.nutrition();
    }

    @Override
    public void responsivness() {
        super.responsivness();
    }
}
