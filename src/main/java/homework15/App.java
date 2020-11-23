package homework15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Joseph", "Baum", Position.DERMATOLOGIST));
        doctors.add(new Doctor("Mary", "Smith", Position.CARDIOLOGYST));
        doctors.add(new Doctor("Kate", "Brook", Position.PHYSICIAN));
        doctors.add(new Doctor("Peter", "Gram", Position.SURGEON));

        for(Doctor d:doctors){
            System.out.println(d);
        }

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(101, "Dermatology");
        rooms.put(202, "Cardiology");
        rooms.put(303, "Physician Office");
        rooms.put(404, "Surgery Room");

        System.out.println(rooms);


        List<homework15.InsuranseCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(homework15.InsuranseCompanies.MEDICARE);
        acceptedInsuranses.add(homework15.InsuranseCompanies.AETNA);
        acceptedInsuranses.add(homework15.InsuranseCompanies.UHC);
        acceptedInsuranses.add(homework15.InsuranseCompanies.BCBS);

        System.out.println(acceptedInsuranses);

        homework15.Address hospitalAddress = new homework15.Address("13 Balmond Ave", "Chicago", "IL", "60015");
        System.out.println( hospitalAddress);



















    }
}
