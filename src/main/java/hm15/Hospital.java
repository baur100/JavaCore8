package hm15;


import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
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

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(List<InsuranseCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void printDoctors(List<Doctor> doctors) {
        for (Doctor d : doctors) {
            System.out.println("Doctors" + d);
        }}

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                ", acceptedInsuranses=" + acceptedInsuranses +
                '}';
    }
    public void printAcceptedInsuransies(List<InsuranseCompanies> acceptedInsuranses){
        for (InsuranseCompanies i: acceptedInsuranses){
            System.out.println("acceptedInsuranses:" +i);
        }}
    public void printInfo(){
        System.out.println(hospitalName + " " + address + " " + " " + acceptedInsuranses + " ");





    }}


