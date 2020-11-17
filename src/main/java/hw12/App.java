package hw12;

public class App {
    public static void main(String[] args) {
//        NewDesktopLight k12My = new NewDesktopLight("Gray", "MyBrand", "K12");
//
//        k12My.americanPlug();
//        k12My.e27bulbStandardSupport();
//        k12My.workUsing110v();
//
//        k12My.lampOn();
//        k12My.lampOff();
//
//        MyPrinter cc = new MyPrinter("MyBrand", "LaserXX", "Laser", false);
//        cc.americanPlug();
//        cc.workUsing110v();
//


//    BulbE27 vv=new BulbE27();
//    ne mojem, nelzya 'BulbE27' is abstract; cannot be instantiated. ne imeet tela.

    ElectricPlug bb=new MyPrinter("MyBrand", "LaserXX", "Laser", false);
    ElectricPlug vv=new NewDesktopLight("Gray", "MyBrand", "K12");
    bb.americanPlug();
    vv.americanPlug();





//    vot tak mojno




//    @Override
//    public void e27bulbStandardSupport() {
//
//
//}


  }}