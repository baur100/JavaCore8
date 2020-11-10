package homework9;

public class App {
    public static void main(String[] args) {

        Furniture MyFur = new Furniture();
        MyFur.setName(" table");
        MyFur.setColor(" black");
        MyFur.setSize( 25.5);

        MyFur.printClass();

        String[] myPlace = {"on the table, on the floor, on the wall"};
        Shape place = new Shape(triangle, blue,myPlace);

        myPlace.printClass();








    }
}

