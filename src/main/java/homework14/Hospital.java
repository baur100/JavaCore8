package homework14;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<InsuranseCompanies> acceptedInsuranses;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;

    public Hospital(String hospitalName, Address address, List<InsuranseCompanies> acceptedInsuranses, List<Doctor> doctors, Map<Integer, String> rooms) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.acceptedInsuranses = acceptedInsuranses;
        this.doctors = doctors;
        this.rooms = rooms;
    }


    public Hospital() {
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

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", acceptedInsuranses=" + acceptedInsuranses +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                '}';
    }
    public void printInfo(){
        System.out.println(hospitalName+" "+address+" accepted "+acceptedInsuranses);
    }
}
