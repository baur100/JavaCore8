package hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App16 {
    public static void main(String[] args) {
        Address16 address = new Address16("6400 W. Red Bird Lane","Dallas","TX",75236);

        Map<Cattle,Integer> cattle = new HashMap<Cattle,Integer>();
        cattle.put(Cattle.PIGS,25);
        cattle.put(Cattle.CHICKENS,50);
        cattle.put(Cattle.COWS,30);
        cattle.put(Cattle.SHEEPS,40);


        List<AgreeCultural> agreeCultural = new ArrayList<AgreeCultural>();
        AgreeCultural grain = new AgreeCultural("Grain",1);
        AgreeCultural sugarBeet = new AgreeCultural("SugarBeet",2);
        AgreeCultural sunflowerSeeds = new AgreeCultural("SunflowerSeeds",3);
        AgreeCultural potatoes = new AgreeCultural("Potatoes",4);

        agreeCultural.add(grain);
        agreeCultural.add(sugarBeet);
        agreeCultural.add(sunflowerSeeds);
        agreeCultural.add(potatoes);
        Farm farm1=new Farm("SunDorn Farm",address,cattle,agreeCultural);

        farm1.printInfo();
    }
}
