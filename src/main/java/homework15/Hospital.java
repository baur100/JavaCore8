package homework15;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer,String>rooms;
    private List<InsuranseCompanies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranseCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public List<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public void setAcceptedInsuranses(List<InsuranseCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void printDoctors(List<Doctor> doctors){
        for(Doctor d: doctors){
            System.out.println("Doctor:"+d);
        }
    }
    public void printAcceptedInsurances(List<InsuranseCompanies> acceptedInsuranses){
        for(InsuranseCompanies i: acceptedInsuranses){
            System.out.println("Accepted Insurances: "+i);
        }
    }
    public void printRooms(Map<Integer,String>rooms){
        rooms.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+" "+entry.getValue());
        });
    }
    public void printInfo(){
        System.out.println(hospitalName+" on "+address);
        printDoctors(doctors);
        printAcceptedInsurances(acceptedInsuranses);
        printRooms(rooms);
    }
}