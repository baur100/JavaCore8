package homework7;

public class WorkKS7 {
    public static void main(String[] args) {
        System.out.println("This is my homework7");

        String[] bikessubjects = {"Mountain", "Road", "Enjoy"};
        Bike stels = new Bike("Stels", "black", 26, "shemano", bikessubjects[2]);
        stels.printClass();
        stels.printSubjects();
        System.out.println(stels.getBrand());

        Bike kent = new Bike();
        kent.setBrand("kent");
        kent.setColor("white");
        kent.printClass();
        System.out.println(stels.getColor());

        String[] screensSubjects = ("Gaiming", "Longwork", "High resolution");
        Screen ace = new Screen("Aces", screensSubjects, 34);
        ace.printClass();
        ace.printSubjects();

        Screen arrow=new Screen("Sony",screensSubjects,50);
        arrow.printClass();
        arrow.printSubjects();

        String[] gameType={"Family"."Personal","For kids"}
        Game start=new Game ("Fresh",gameType,12);
        start.printclass();
        start.printType();

        Game calm=new Game("Calm",)

    }

}
