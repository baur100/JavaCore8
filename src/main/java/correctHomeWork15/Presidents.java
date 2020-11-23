package correctHomeWork15;

import java.util.HashMap;
import java.util.Map;

public class Presidents {
    public static void main(String[] args) {
        Map<String,String> presidents = new HashMap<>();
        presidents.put("Germany", "Steinmeier");
        presidents.put("France", "Macron");
        presidents.put("Italy", "Mattarella");

        System.out.println(presidents);

        presidents.remove("Germany");
        System.out.println(presidents);

        presidents.replace("France","Macron","Emmanuel");
        System.out.println(presidents);

        for (String v:presidents.keySet()){
            System.out.println(v);
        }

    }

}
