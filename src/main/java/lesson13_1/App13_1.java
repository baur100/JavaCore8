package lesson13_1;

public class App13_1 {
    public static void main(String[] args) {
//        String str = new String("Hello world");
        String str = "   Hello, World  ";
        String xx = str.trim().replace("o","0").concat(" Hey").replace("Hey","Hi").toUpperCase();
        System.out.println(xx);
//        System.out.println(str);
//
//        System.out.println(str.length());
//        System.out.println(str.trim());
//        System.out.println(str.trim().length());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//
//        System.out.println(str.replace('o','O'));
//        System.out.println(str.replace("el","elll"));
//        System.out.println(str.substring(5,8));
//        System.out.println(str.contains("ell")); //true
//        System.out.println(str.concat("******"));
//        System.out.println(str.charAt(6));

        String st1 = "Lorem ipsum dolor sit amet";
        String[] words = st1.split(" ");
        String[] reverse = new String[words.length];
        for (int i = words.length-1; i>=0;i--){
            reverse[reverse.length-i-1] = words[i];
        }
        String answer = String.join(" ",reverse);
        System.out.println(answer);
    }
}
