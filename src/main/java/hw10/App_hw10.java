package hw10;

public class App_hw10 {
    public static void main(String[] args) {
        Animal elephant = new Animal("ELEPHANT","FUNTIC","GRAY", 7 );
        elephant.printOut();

        Animal monkey = new Animal();
        monkey.setName("Monkey");
        monkey.setLastName("CHI-CHI");
        monkey.setColor("Black");
        monkey.setAge(5);
        monkey.printOut();

        Beer heineken = new Beer();
        heineken.setBrand("HEINEKEN");
        heineken.setColor("Light");
        heineken.setPrice(80);
        heineken.printMe();


        String [] size = {"Grand","Medium","Small"};
        Coffee Starbuсks = new Coffee("Starbucks",size);

        String[] c = Starbuсks.getSize();
        for (String v:c){
            System.out.println(v);
        }
    }
}
