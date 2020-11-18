package homework9;

import java.awt.*;

public class WorkKS9 {
    public static void main(String[] args) {
        Type[] windowtype = {Type.wooden, Type.plastic, Type.aluminum};

        Windows mywindows = new Windows(33, windowtype, Color.GREEN);
        Phones myphone = new Phones(OSys.iOS, "white", 1999, "Newscom");
        mywindows.printclass();
        mywindows.printtype();
        System.out.println(mywindows.getType());

    }
}
