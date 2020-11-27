package homework9;

public class Work {
    public static void main(String[] args) {
Colors[]colors = {Colors.GREY, Colors.RED, Colors.WHITE};
        Vehicle myCar = new Vehicle("Toyota", colors, 2017, VehicleType.AUTOMAT);
        System.out.println(myCar.toString());
 print(myCar.getBrand());
 print(myCar.toString());
    }
public static void print(String a){
    System.out.println(a);
}
}
