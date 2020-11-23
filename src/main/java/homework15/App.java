package homework15;

import java.util.*;

public class App {
    public static void main(String[] args) {


        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(101, "Cardiology");
        rooms.put(202, "Dermatology");
        rooms.put(303, "Surgery");
        rooms.put(404, "Pediatria");
        rooms.put(505, " Family Doctor");

        //      System.out.println(rooms);


        List<InsuranseCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranseCompanies.MEDICARE);
        acceptedInsuranses.add(InsuranseCompanies.AETNA);
        acceptedInsuranses.add(InsuranseCompanies.BCBSPPO);


        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Jakob", "Baum", Position.CARDIOLOGIST, rooms, acceptedInsuranses.subList(0, 3)));
        doctors.add(new Doctor("Mad", "Freed", Position.SURGEON, rooms, acceptedInsuranses.subList(1, 2)));
        doctors.add(new Doctor("Mary", "Track", Position.DERMATOLOGIST, rooms, acceptedInsuranses.subList(2, 3)));


        Address hospitalAddress = new Address("12 Randon Pl", "Chicago", "IL", 60073, doctors);


        Hospital hospital = new Hospital("UrgentCare", hospitalAddress);
        //       System.out.println(hospital);

        hospital.printInfo();













    }}