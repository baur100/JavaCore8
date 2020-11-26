package homework18;

public class App {
    public static void main(String[] args) {
        Lion l1=new Lion("Simba");
        l1.breath();
        l1.reproduction();
        l1.nutrition();
        l1.responsivness();
        l1.move();
        l1.skull();
        l1.haveHair();
        l1.killing();
        l1.king();
        System.out.println("*************");

        Wolf w1=new Wolf("Gena");
        w1.breath();
        w1.reproduction();
        w1.nutrition();
        w1.responsivness();
        w1.move();
        w1.skull();
        w1.haveHair();
        w1.killing();
        w1.yyy();
        System.out.println("**************");

        BlueWhale bw1=new BlueWhale("Willy");
        bw1.breath();
        bw1.reproduction();
        bw1.nutrition();
        bw1.responsivness();
        bw1.move();
        bw1.skull();
        bw1.haveHair();
        bw1.killing();
        bw1.filterFood();
    }
}
