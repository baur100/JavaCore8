package homework14;

import lesson14.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WORKKS14 {
    public static void main(String[] args) {
        Doctor dantist = new Doctor("John", "White", Position.DANTIST);
        Doctor nurcery = new Doctor("Carla", "Green", Position.NURCERY);
        Doctor pediatric = new Doctor("Linda", "Trevis", Position.PEDIATRIC);
        Doctor physician = new Doctor("Chris", "Osbourne", Position.PHYSICIAN);
        Doctor surgeon = new Doctor("Nancy", "Irwine", Position.SURGEON);
        String hospitalName = new String("CITY COMMUNITY HOSPITAL");
        Address hospitaladdress = new Address("1010 Howthorne ave.", "Kingcity", "LA", 90887);

        List<InsuranseCompanies> acceptedInsurance = new ArrayList<InsuranseCompanies>();
        acceptedInsurance.add(InsuranseCompanies.PACIFIC_SOURCE);
        acceptedInsurance.add(InsuranseCompanies.CRATNA);
        acceptedInsurance.add(InsuranseCompanies.OHP);
        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(10, "Surgery");
        rooms.put(11, "Laboratory");
        rooms.put(22, "Gastroenterology");

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(dantist);
        doctors.add(nurcery);
        doctors.add(pediatric);
        doctors.add(physician);
        doctors.add(surgeon);

        Hospital cityHospital = new Hospital(hospitalName, hospitaladdress, acceptedInsurance, doctors,rooms);
//        System.out.println(acceptedInsurance);
        dantist.printDoctors();
        nurcery.printDoctors();
        pediatric.printDoctors();
        physician.printDoctors();
        surgeon.printDoctors();
//        System.out.println(doctors.printInfo);
        cityHospital.printInfo();
        System.out.println(rooms);
//        doctors. printDoctors();

    }
}

//    Создайте класс Hospital
//        Fields:
//        - private String hospitalName;
//        - privare Address address;
//        (Класс Address
//        - private String streetAddress;
//        - private String town;
//        - private String state;
//        - private int zip;
//        - private List<Doctor> doctors;
//        (Класс Doctor
//        - private String name;
//        - private String lastName;
//        - private Position position;
//        (Enum Position is a enum with 5 members - например Position.PHYSICIAN);
//        - private Map<Integer,String> rooms; (список кабинетов и их название - пример комната 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
//        - private List<InsuranseCompamies> acceptedInsuranses; список принимаемых страховок.
//        (Enum  - enum of Insuranses,  например InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
//        Методы:
//        - Вывести на печать название, адрес и список Иншурансов которые принимает больница - public void printInfo();
//        - Вывести на печать список врачей и их должности - public void printDoctors();
//        - Вывести на печать все кабинеты с номерами и их названиямиж
//







