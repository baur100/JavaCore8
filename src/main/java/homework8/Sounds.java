package homework8;

public class Sounds {
    public String animal;
    public String size;
    public String quantity;

    public void voice(){System.out.println("There are " + quantity + animal + " on the roof");}
    public void voice(String OtherAnimal){System.out.println(quantity + size + OtherAnimal + " love to sing");}
}
