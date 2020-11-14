package homework11;

public class HomeAnimal extends Animal{
    private String ownersname;

    public HomeAnimal(String name,String kind,int year,Color color,String ownersname){
        super(name, kind, year, color);
        this.ownersname=ownersname;
    }
    public HomeAnimal(){}

    public String getOwnersname() {
        return ownersname;
    }

    public void setOwnersname(String ownersname) {
        this.ownersname = ownersname;
    }

}
