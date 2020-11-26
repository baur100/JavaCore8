package homework16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Cattle,Integer> cattle=new HashMap<>();
        cattle.put(Cattle.COWS,22);
        cattle.put(Cattle.SHEEPS,100);
        cattle.put(Cattle.PIGS,53);
        cattle.put(Cattle.CHICKENS,140);


    List<AgreeCultural> agreeCultural=new ArrayList<>();
    AgreeCultural corn=new AgreeCultural("Corn",1);
    agreeCultural.add(corn);
    agreeCultural.add(new AgreeCultural("Millet",2));
    agreeCultural.add(new AgreeCultural("Potato",3));


    Address myFarmAddress=new Address("113 berezka","Perm","Fl",33307);
    Farm myFarm=new Farm("Kolhoz",myFarmAddress,cattle,agreeCultural);
    myFarm.printInfo();
}
}
