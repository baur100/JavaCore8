package hw15;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map <Integer, String> rooms;
    private List<InsuranceCompany> insurance;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompany> insurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.insurance = insurance;
    }
    public void printDoctor(List<Doctor> doctors){
        for (Doctor d : doctors){
            System.out.println("Doctor: " +d);
        }
    }
    public void printInsurance(List<InsuranceCompany> insurance){
        for (InsuranceCompany i : insurance){
            System.out.println("InsuranceCompany: " +i);
        }

    }
    public void printRooms(Map <Integer, String> rooms){
        rooms.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }





    public void printInfo(){

        System.out.println(hospitalName +" "+ address);
    }
}

