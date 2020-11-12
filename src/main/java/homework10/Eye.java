package homework10;

public class Eye {
    private String name;
    private EyeColor type;

    public Eye(String name,EyeColor type){
        this.name=name;
        this.type=type;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public EyeColor getType(){
        return type;
    }
    public void setType(EyeColor type){
        this.type=type;
    }
}
