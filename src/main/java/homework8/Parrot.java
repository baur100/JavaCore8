package homework8;

public class Parrot {
    public String breed;
    public String nickname;
    public String owner;
    public int age;

    public void twitter() {
        System.out.println(nickname + " " + "can twitter");
    }

    public void dance() {
        System.out.println(owner + "'s parrot" + " " + nickname + " " + "can dance very funny");
        System.out.println("++++++++++");
    }
}


//1. Создайте 3 класса в которых есть аттрибуты и методы
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают