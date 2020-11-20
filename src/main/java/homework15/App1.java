package homework15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {

        List<Doctor> doctors = new ArrayList<Doctor>();
        Doctor david = new Doctor("David", "G", Position.PHYSICIAN);
        doctors.add(david);
        doctors.add(new Doctor("Delisa", "S", Position.OBGYN));
        doctors.add(new Doctor("Mark", "H", Position.CHIROPRACTOR));
        doctors.add(new Doctor("Lisa", "Lee", Position.NURSE));

        for (Doctor d : doctors) {
            System.out.println(d.getName() + " " + d.getLastName() + " is " + d.getPositin());
        }

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(22, "Gastroenterology");
        System.out.println(rooms);
        rooms.put(100, "OBGYN Office");
        rooms.put(101, "CHIROPRACTOR Office");
        rooms.put(1, "PHYSICIAN Rom");
        rooms.put(300, "ANASTHEITIST DEPARTMENT");
        System.out.println(rooms);

        List<InsuranseCompanies> acceptedInsuranses = new ArrayList<InsuranseCompanies>();
        acceptedInsuranses.add(InsuranseCompanies.AETNA);
        acceptedInsuranses.add(InsuranseCompanies.BCBS);
        acceptedInsuranses.add(InsuranseCompanies.UHcare);
        System.out.println(acceptedInsuranses);


        System.out.println("**********BrowardHealth*************");
        Address BHadress = new Address("123 main", "FortL", "FL", 33312);
        Hospital BrowardHealth = new Hospital("BrowardHealth", BHadress, doctors, rooms, acceptedInsuranses);
        BrowardHealth.printInfo();
    }

}
