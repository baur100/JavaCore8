package homework10;

public class App {
    public static void main(String[] args) {
        Cars[] familyCars = {Cars.PRIUS, Cars.FORD, Cars.BMW};

        FarmersInsurance farmersIns = new FarmersInsurance("23 Oak Dr", "David Smith", familyCars, 1200);
        GeicoInsurance geicoIns = new GeicoInsurance ("23 Oak Dr", Cars.BMW, Drivers.DRIVER2, 2100);

        System.out.println(farmersIns);
        System.out.println(geicoIns);
    }
}


// Сделать  2 enum
//Сделать 2 класса - в первом классе field сделать типа Enum
//Во  втором классе - field типа Enum[]

//    Заполните содержимым классы Monitor, Keyboard, Mouse, SystemBlock
//Создайте 2 объекта типа Computer в классе Work