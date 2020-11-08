package homework8;

public class App {
    public static void main(String[] args) {
        Furniture fur1 = new Furniture();
        fur1.name = "table";
        fur1.color = " black ";
        fur1.size = 25.5;

        fur1.buy();
        fur1.know();

        Furniture fur2 = new Furniture();
        fur2.name = "chair";
        fur2.color = "brown";
        fur2.size = 3.8;

        fur2.buy();
        fur2.know();

        Shape oval = new Shape();
        oval.name = "oval";
        oval.color = "green";
        oval.place = "on the table";

        oval.act();

        Shape square = new Shape();
        square.name = " square";
        square.color = " blue";
        square.place = "on the floor";

        square.act("triangle");

        Sounds bird = new Sounds();
        bird.animal = " sparrows ";
        bird.size = " small ";
        bird.quantity = "Two";

        bird.voice();
        bird.voice("nightingales");

        Sounds parrot = new Sounds();
        parrot.animal = " birds";
        parrot.size = "huge";
        parrot.quantity = " four ";

        parrot.voice();









    }

}

