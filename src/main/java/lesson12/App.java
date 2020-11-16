package lesson12;

public class App {
    public static void main(String[] args) {
        NewDesktopLight k12My = new NewDesktopLight("grey", "MyBrand", "k12");
        k12My.americanPlug();
        k12My.e27BulbStandardSupport();
        k12My.workUsing110v();

        k12My.LampOn();
        k12My.LampOff();

        MyPrinter cc = new MyPrinter("Brother", "MP52100", "laser", false);

        cc.americanPlug();
        cc.workUsing110v();
        cc.print("abc");



    }
}
