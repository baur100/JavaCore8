package homework15;

import java.util.HashMap;
import java.util.Map;

public class WORKKS15 {
    public static void main(String[] args) {
        Map<String, String> aa = new HashMap<String, String>();
        Map<Integer, String> bb = new HashMap<>();
        Map<String, String> cc = new HashMap<>();

        Shoes myShoes=new Shoes("Puma",1);
        Usage myUsage=new Usage("Hicking","Winter");
        System.out.println(myShoes.getBrand());
        System.out.println(myUsage);


        aa.put("England", "English");
        aa.put("Ireland", "Irish");
        aa.put("Walles", "Wales");
        aa.put("UK", "All");
        aa.replace("UK", "BG");
        aa.remove("England");
        System.out.println(aa);
        System.out.println(aa.get("Ireland"));

        bb.put(1, "Strawberry");
        bb.put(5, "Blueberry");
        bb.put(2, "Veryberry");
        bb.put(8, "Marionberry");
        System.out.println(bb);
        System.out.println(bb.get(8));
        bb.remove(5);
        System.out.println(bb);
        bb.replace(1, "Lemon");
        System.out.println(bb);

        cc.put("Football", "Outdoor");
        cc.put("Tennis", "Summer");
        cc.put("Soccer", "Training");
        cc.put("Hicking", "WinterCold");
        System.out.println(cc);
        for (String v:aa.keySet()){
            System.out.println(v);
        }
        for(String d: bb.values()){
            System.out.println(d);
        }


    }
}


//Create 3 Map - String, String, Integer,String and some Custom class/Custom class1
//        Add 4+ elements to each Map
//        excersize methods put/get/remove/replace/foreach and etc