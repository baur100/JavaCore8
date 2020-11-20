package hw15;

import lesson10.Address;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    Map <Integer, String> rooms;
    List<InsuranceCompany> insurance;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompany> insurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.insurance = insurance;
    }

    public Hospital(String coney_island_hospital, hw15.Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompany> insurance) {
    }
    public void printInfo(){
        System.out.println(hospitalName +" "+ address + " " +insurance);
    }
}

