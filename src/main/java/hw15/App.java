package hw15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    private static Object Address;
    private static Object Hospital;

    public static void main(String[] args) {
        Address address = new Address( "2601 Ocean Parkway", "Brooklyn", "NY", 11235);

        List<Doctor> Doctors = new ArrayList<>();
        Doctors.add (new Doctor("Mary","Queen", Position.Ophthalmologist));
        Doctors.add(new Doctor("John", "King", Position.Pediatrician));
        Doctors.add(new Doctor("Jasmine", "Clinton", Position.Dentist));
        Doctors.add (new Doctor("Igor", "Ivanov", Position.Surgeon));
        Doctors.add (new Doctor("Helen", "Smith", Position.Gynecologist));

        List <InsuranceCompany> Insurance = new ArrayList<>();
        Insurance.add(InsuranceCompany.FirstAid);
        Insurance.add(InsuranceCompany.MetroPlus);
        Insurance.add(InsuranceCompany.Fidelis);

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(7, "Pediatrician");
        rooms.put (17, "Dentist");
        rooms.put(27,"Gynecologist");
        rooms.put(37, "Ophthalmologist");
        rooms.put(47, "Surgeon");

        Hospital ConeyIslandHospital = new Hospital("Coney Island Hospital", address, Doctors, rooms, Insurance);
        System.out.println(Doctors);
        System.out.println(Insurance);
        System.out.println(rooms);
        System.out.println(Address);

        ConeyIslandHospital.printInfo();

    }




}
