package lesson13b;

public class App {
    public static void main(String[] args) {
//        String str = new String("Hello world");
        String str = "  Hello, world  ";
//        System.out.println(str);
//
//        System.out.println(str.length());
//        System.out.println(str.trim());
//        System.out.println(str.trim().length());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//
//        System.out.println(str.replace('o', 'O'));
//        System.out.println(str.replace("el", "ellll"));
//        System.out.println(str.substring(5,8));
//        System.out.println(str.contains("ell"));
//        System.out.println(str.charAt(6));

//        THIS IS IMPORTANT FOR THE F2F


        String str1 = "Loren ipsum dolor sit amet";
        String[] words = str1.split(" ");
        String[] reverse = new String[words.length];
        for(int i= words.length-1; i>=0; i--){
            reverse[reverse.length-i-1]=words[i];
        }
//        for (String x: reverse) {
//            System.out.println(x);
//        }
        String answer = String.join(" ", reverse);
        System.out.println(answer);
    }
}
