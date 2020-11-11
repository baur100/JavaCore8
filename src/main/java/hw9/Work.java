package hw9;

public class Work {
    public static void main(String[] args) {
        Person amina = new Person();
        amina.setName("Amina");
        amina.setLastName("Astanova");
        amina.setAge(12);
//        System.out.println(amina.getName());
//        System.out.println(amina.getLastName());
//        System.out.println(amina.getAge());
        Music Symphony = new Music("Symphony #40", "Mozart", 1788);
        Music SwanLake = new Music ("Swan Lake", "Tchaikovskiy", 1876);

//        Symphony.setName("Simphony # 40");
//        Symphony.setComposer("Mozart");
//        Symphony.setYear(1788);
        Symphony.printInfo();
        SwanLake.printInfo();

        Geography ethiopia = new Geography("Ethiopia", "Addis Ababa", 426400, 116000000);
        String [] religions = {"Christianity", "Islam"};



    }
}
