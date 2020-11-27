package homework11;

public class WORKKS11 {
    public static void main(String[] args) {
        Cars car1 = new Cars("Toyota", "Red", 20, CarType.PICKUP, EngineType.HYBRYD, 2016);
        System.out.println(car1);
        RegularCar rc = new RegularCar("LEATHER");
        System.out.println(rc);
//        WorkCar wc=new WorkCar( "HeavySetTool",8  );
//        System.out.println(wc);
//        OutdoorCar oc=new OutdoorCar( "FlexBox","AllCover"  );
//        System.out.println(oc);
//
        System.out.println(rc.getCars.getEngineType());
    }
}
