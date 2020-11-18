package homework14;


import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<School> mySchool = new ArrayList<>();

        School sc = new School("St.Mary School", "private", 2000);
        mySchool.add(sc);

        mySchool.add(new School("St. Louse School", "public", 1970));

        mySchool.forEach(s ->System.out.println(s.getType()) );








    }
}
