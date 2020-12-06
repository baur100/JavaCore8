package homework16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address farmAddress = new Address("13 Pull Rd", "Chicago", "IL", 60015);
        System.out.println(farmAddress);

        Map<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICKENS, 45);
        cattle.put(Cattle.COWS, 23);
        cattle.put(Cattle.PIGS, 11);
        cattle.put(Cattle.TURKEYS, 50);
        cattle.put(Cattle.SHEEPS, 9);
        System.out.println(cattle);

        List<AgreeCultural> agreeCultural = new ArrayList<>();
        agreeCultural.add(new AgreeCultural("Millet", 2));
        agreeCultural.add(new AgreeCultural("Corn", 8));
        agreeCultural.add(new AgreeCultural("Oats", 6));
        System.out.println(agreeCultural);





        }



    }

