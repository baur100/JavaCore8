package homework16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
//        Adding farm address
        Address farmAddress = new Address("123 Main st", "Charlotte", State.NC, 28277);

//        Adding cattle count
        Map<Cattle, Integer> farmCattle = new HashMap<>();
        farmCattle.put(Cattle.COWS, 1500);
        farmCattle.put(Cattle.PIGS, 2100);
        farmCattle.put(Cattle.SHEEP,4000);
        farmCattle.put(Cattle.CHICKENS, 22500);
        farmCattle.put(Cattle.TURKEYS, 750);

//        for (Map.Entry<Cattle,Integer> w : farmCattle.entrySet()){
//            System.out.println(w.getKey()+" - "+w.getValue()+" heads");
//        }

//        System.out.println(farmCattle);

//        Adding fields structure
        AgreeCultural firstElement = new AgreeCultural("Corn", 1);
        AgreeCultural secondElement = new AgreeCultural("Wheat", 2);
        AgreeCultural thirdElement = new AgreeCultural("Rice", 3);
        AgreeCultural forthElement = new AgreeCultural("Cotton", 4);
        List<AgreeCultural> fieldStructureList = new ArrayList<>();
        fieldStructureList.add(firstElement);
        fieldStructureList.add(secondElement);
        fieldStructureList.add(thirdElement);
        fieldStructureList.add(forthElement);

//        for (AgreeCultural v : fieldStructureList){
//            System.out.println(v.getNameOfCulture()+" - field #"+ v.getFieldNumber());
//        }


//        Creating the farm itself
        Farm kolhoz = new Farm("Kolhoz Zaveta Illicha", farmAddress, farmCattle, fieldStructureList);
        kolhoz.printFarmInfo();
    }
}
