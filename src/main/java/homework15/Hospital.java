package homework15;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer,String> room;
    private List<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> room, List<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.room = room;
        this.acceptedInsurances = acceptedInsurances;
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

    public Map<Integer, String> getRoom() {
        return room;
    }

    public void setRoom(Map<Integer, String> room) {
        this.room = room;
    }

    public List<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(List<InsuranceCompanies> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }

    @Override
    public String toString() {
        return "Hospital: " + hospitalName +
                ", address: " + address +
                ", presented bu following doctors: " + doctors +
                ", room location for patient's reference - " + room +
                ", Insurances accepted (*please check with your provider prior checking in): " + acceptedInsurances;
    }
}
