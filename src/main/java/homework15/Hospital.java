package homework15;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private homework15.Address address;
    private List<homework15.Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<homework15.InsuranseCompanies> acceptedInsuranses;

    public Hospital(String hospitalName, homework15.Address address, List<homework15.Doctor> doctors, Map<Integer, String> rooms, List<homework15.InsuranseCompanies> acceptedInsuranses) {
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

    public homework15.Address getAddress() {
        return address;
    }

    public void setAddress(homework15.Address address) {
        this.address = address;
    }

    public List<homework15.Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<homework15.Doctor> doctors) {
        this.doctors = doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public List<homework15.InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(List<homework15.InsuranseCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

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

    public void printDoctors(List<homework15.Doctor> doctors) {
        for (homework15.Doctor d : doctors) {
            System.out.println("Doctors" + d);
        }}

        public void printAcceptedInsuransies(List<homework15.InsuranseCompanies> acceptedInsuranses){
            for (homework15.InsuranseCompanies i: acceptedInsuranses){
                System.out.println("acceptedInsuranses:" +i);
            }}
            public void printInfo(){
        System.out.println(hospitalName + " " + address + " " + " " + acceptedInsuranses + " ");



            }}




