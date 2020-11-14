package homework11;

public class App {
    public static void main(String[] args) {
        Animal myAnimal=new Animal("Leo","lion",3,Color.YELLOW);
        myAnimal.printAnimalColor();

        HomeAnimal myHomeAnimal=new HomeAnimal("Masha","cat",7,Color.GRAY,"Nadya");
        myHomeAnimal.printAnimalColor();

        WiledAnimal myWiledAnimal=new WiledAnimal("Jack","squarel",1,Color.YELLOW,"park");
        myWiledAnimal.printAnimalColor();
        myWiledAnimal.printAnimalLocation();
    }
}
