//package hw15;
//
//public class Example {
//    Создайте класс Hospital
//    Fields:
//            - private String hospitalName;
//- privare Address address;
//	(Класс Address
//	- private String streetAddress;
//	- private String town;
//	- private String state;
//	- private int zip;
//- private List<Doctor> doctors;
//	(Класс Doctor
//	- private String name;
//	- private String lastName;
//	- private Position position;
//		(Enum Position is a enum with 5 members - например Position.PHYSICIAN);
//- private Map<Integer,String> rooms; (список кабинетов и их название - пример комната 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
//            - private List<InsuranseCompamies> acceptedInsuranses; список принимаемых страховок.
//            (Enum InsuranseCompamies - enum of Insuranses,  например InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
//    Методы:
//            - Вывести на печать название, адрес и список Иншурансов которые принимает больница - public void printInfo();
//- Вывести на печать список врачей и их должности - public void printDoctors();
//- Вывести на печать все кабинеты с номерами и их названиямиж
//}
