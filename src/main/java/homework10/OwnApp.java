package homework10;

public class OwnApp {
    public static void main(String[] args) {
        Student oleg=new Student("Oleg","Ivanov","Bachelor",2);
        oleg.printClass();
        Student alexandra= new Student("Alexandra","Boretski","Masters",7);
//        alexandra.setYearOfStudy(7);
        System.out.println("========================================================");
        Apartment myApartment=new Apartment("Mirage",2,2,1070,"Intracoastal");
        myApartment.printClass();
//        myApartment.setBaths(0);
        Apartment searchApartment=new Apartment(3,2,1450);
        searchApartment.printClass();
        City myCity=new City("Sunny Isles Beach","FL","SE",22000);
        myCity.printClass();
    }
}
