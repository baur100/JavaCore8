package homework9;

public class App {
    public static void main(String[] args) {

        Furniture MyFur = new Furniture();
        MyFur.setName(" table");
        MyFur.setColor(" black");
        MyFur.setSize( 25.5);

        MyFur.printClass();

        int[] taniasYear = {1992, 1996, 2000};
        Friend tania = new Friend( "Tania", "Levchenko", taniasYear);

        tania.printClass();
        tania.printYear();












    }
}

