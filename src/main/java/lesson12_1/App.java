package lesson12_1;

public class App {
    public static void main(String[] args) {
//        NewDesktopLight k12My = new NewDesktopLight("Grey","MyBrand","K12");
//        k12My.americanPlug();
//        k12My.e27bulbStandardSupport();
//        k12My.workUsing110v();
//
//        k12My.lampOn();
//
//        MyPrinter cc = new MyPrinter("MyBrand","LaserXX","Laser",false);
//        cc.americanPlug();
//        cc.workUsing110v();

//        BulbE27 vv = new BulbE27();
        UsElectricPlug bb = new MyPrinter("MyBrand","LaserXX","Laser",false);
        UsElectricPlug vv = new NewDesktopLight("Grey","MyBrand","K12");
        bb.americanPlug();
        vv.americanPlug();




    }
}
