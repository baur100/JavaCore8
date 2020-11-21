package homework15;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


//        Adding Doctors to the list
        Doctor doc1 = new Doctor("Andrey", "Adams", Position.PHYSICIAN);
        Doctor doc2 = new Doctor("Bill", "Billings", Position.PEDIATRICIAN);
        Doctor doc3 = new Doctor("Charles", "Crow", Position.DENTIST);
        Doctor doc4 = new Doctor("Down", "Dowson", Position.GYNECOLOGIST);
        Doctor doc5 = new Doctor ("Evan", "Evans", Position.CARDIOLOGIST);
        Doctor doc6 = new Doctor("Frank", "Freeman", Position.OPHTHALMOLOGIST);

        List<Doctor> doctorsList = new ArrayList<>();
        doctorsList.add(doc1);
        doctorsList.add(doc2);
        doctorsList.add(doc3);
        doctorsList.add(doc4);
        doctorsList.add(doc5);
        doctorsList.add(doc6);
//        System.out.println(doctorsList);

//        Adding new lists of the insurance companies options
        List<InsuranceCompanies> insuranceOption1 = new ArrayList<>();
        insuranceOption1.add(InsuranceCompanies.AETNA);
        insuranceOption1.add(InsuranceCompanies.CIGNA);
        insuranceOption1.add(InsuranceCompanies.BLUE_CROSS_BLUE_SHIELD);
//        System.out.println(insuranceOption1);

        List<InsuranceCompanies> insuranceOption2 = new ArrayList<>();
        insuranceOption2.add(InsuranceCompanies.WELLCARE);
        insuranceOption2.add(InsuranceCompanies.ANTHEM);
        insuranceOption2.add(InsuranceCompanies.UNITED_HEALTH);
//        System.out.println(insuranceOption2);

        List<InsuranceCompanies> insuranceOption3 = new ArrayList<>();
        insuranceOption3.addAll(insuranceOption1);
        insuranceOption3.addAll(insuranceOption2);
//        System.out.println(insuranceOption3);

//        Adding new list of the rooms in the hospital
        Map<Integer, String> roomAssignment = new HashMap<>();
        roomAssignment.put(101, "Physialogy");
        roomAssignment.put(102, "Pediatrics");
        roomAssignment.put(201, "Dentistry");
        roomAssignment.put(202, "Gynecology");
        roomAssignment.put(301, "Cardiology");
        roomAssignment.put(302, "Otolaryngology");
//        System.out.println(roomAssignment);

//        Adding address for the hospital
        Address hospitalAddress = new Address("123 New Hope st", "Charlotte", State.NC, 28277);

//        Creating the hospital itself
        Hospital providence = new Hospital("St Hope Providence hospital", hospitalAddress, doctorsList, roomAssignment, insuranceOption3);
        System.out.println(providence);

    }
}
