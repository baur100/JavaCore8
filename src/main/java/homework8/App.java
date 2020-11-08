package homework8;

public class App {
    public static void main(String[] args){

        Watches myWatch1=new Watches();
        myWatch1.model="S1";
        myWatch1.brand="Rolex";
        myWatch1.size=7;
        myWatch1.color="Silver";

        myWatch1.printInfo();

        Watches myWatch2=new Watches();
        myWatch2.model="S2";
        myWatch2.brand="Omega";
        myWatch2.size=5;
        myWatch2.color="Gold";

        myWatch2.printInfo();

        Fruit fr1=new Fruit();
        fr1.name="Apple";
        fr1.color="Green";

        fr1.pie();

        Fruit fr2=new Fruit();
        fr2.name="Charry";
        fr2.color="Red";

        fr2.pie();


        Kid kid1=new Kid();
        kid1.name="Marshall";
        kid1.lastName="G";
        kid1.age=2;

        kid1.cry();

        Kid kid2=new Kid();
        kid2.name="Nadya";
        kid2.lastName="K";
        kid2.age=1;

        kid2.cry();
    }
}
