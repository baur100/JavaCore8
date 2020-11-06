package Lesson8;

public class App1 {
    public static void main(String[] args) {

        Veggi vegan = new Veggi("Avocado", "Green", "Medium", "Creamy");
        vegan.name = "Avocado";
        vegan.color = "Green";
        vegan.size = "Medium";
        vegan.taste = "Creamy";

        System.out.println(vegan.taste);
    }
}
