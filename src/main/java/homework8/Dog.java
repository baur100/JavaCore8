package homework8;

public class Dog {
    public String breed;
    public String nickname;
    public String owner;
    public int age;

    public void bark() {
        System.out.println(nickname + " " + "can bark very loud");
    }

    public void commands() {
        System.out.println(owner + "'s dog" + " " + nickname + " " + "knows many commands");
        System.out.println("++++++++++");
    }
}


//1. Создайте 3 класса в которых есть аттрибуты и методы
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают