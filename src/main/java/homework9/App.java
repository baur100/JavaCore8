package homework9;

public class App {

    public static void main(String[] args) {

//                Class Schedule

        Schedule anna = new Schedule();
        anna.setMeeting("You have meeting in Los Angeles on Monday");
        anna.setBusinessTrip("You have business trip to Chicago on Tuesday");
        anna.setActivity("You have swimming class on Sunday");

        System.out.println(anna.getMeeting());
        System.out.println(anna.getBusinessTrip());
        System.out.println(anna.getActivity());
        System.out.println("+++++++++++");

        anna.printClass();
        System.out.println("+++++++++++");

        Schedule olga = new Schedule();
        olga.setBusinessTrip("You have buisnedd trip to New York on Friday");
        olga.setMeeting("You have have meeting in Los Angeles on Tuesday");
        olga.setActivity("You have dancing class on Monday");

        System.out.println(olga.getBusinessTrip());
        System.out.println(olga.getMeeting());
        System.out.println(olga.getActivity());
        System.out.println("++++++++++++");

        olga.printClass();
        System.out.println("+++++    SCHOOL    +++++++");

//                Class School
        String[] peterSubject = {"MAth", "English"};
        School peter = new School("Oxford", "123 Bridge Ln", 278007, peterSubject);
        System.out.println(peter.getName());
        System.out.println(peter.getAddress());
        System.out.println(peter.getGroupId());
        System.out.println("+++++++++++++");

        peter.printSubjects();
        System.out.println("++++++++");

        peter.printClass();
        System.out.println("+++++++++++");

        School lisa = new School("School for Girls", "67 Luis Ave");
        System.out.println(lisa.getName());
        System.out.println(lisa.getAddress());
        System.out.println("++++++++++++");

        lisa.printClass();
        System.out.println("+++++++++++++");

        School artem = new School();
        artem.setName("Lion");
        artem.setAddress("500 Ford str");
        artem.setGroupId(349008);

        System.out.println(artem.getName());
        System.out.println(artem.getAddress());
        System.out.println(artem.getGroupId());
        System.out.println("+++++++++");

        artem.printClass();
        System.out.println("+++++++      WORK    +++++");

////            Class Work
        String[] lenaSkills = {"Hard working", "Diligent", "Responsible"};
        Work lena = new Work("Law office", "238 Sunny dr", "Lawer", 5, lenaSkills);
        System.out.println(lena.getName());
        System.out.println(lena.getAddress());
        System.out.println(lena.getOccupation());
        System.out.println(lena.getExperience());
        System.out.println("+++++++++++");

        lena.printSkills();
        System.out.println("++++++++");

        lena.printClass();
        System.out.println("++++++++++++++++");

        Work janet = new Work("Bloomindale's", "cashier", 10);
        System.out.println(janet.getName());
        System.out.println(janet.getOccupation());
        System.out.println(janet.getExperience());
        System.out.println("+++++++++++++");

        janet.printClass();
        System.out.println("+++++++++++");

        Work alice = new Work();
        alice.setName("Bank of America");
        alice.setAddress("1430 Toronto Ave");
        alice.setOccupation("Consultant");
        alice.setExperience(4);
        System.out.println("++++++++++++");

        System.out.println(alice.getName());
        System.out.println(alice.getAddress());
        System.out.println(alice.getOccupation());
        System.out.println(alice.getExperience());
        System.out.println("++++++++++++++");

        alice.printClass();
        System.out.println("+++++++++++++++");


    }
}

//Сделать 3 класса - в каждом классе по краней мере 3 fields
//Каждый field имеет setter и getter
//Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
//создайте в каждом классе метод printClass() - для вывода всех полей на экран

//По крайней мере один атрибут в одном классе должен быть array
//Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым. Объект созданный дефолтовым конструктором заполните при помощи сеттеров
//Выведите на экран эти объекты функцией printClass()
