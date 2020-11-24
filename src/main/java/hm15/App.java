package hm15;

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



        List<InsuranseCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranseCompanies.MEDICARE);
        acceptedInsuranses.add(InsuranseCompanies.AETNA);
        acceptedInsuranses.add(InsuranseCompanies.UHC);
        acceptedInsuranses.add(InsuranseCompanies.BCBS);

        System.out.println(acceptedInsuranses);

        Address hospitalAddress = new Address("13 Balmond Ave", "Chicago", "IL", "60015");
        System.out.println( hospitalAddress);






    }}
