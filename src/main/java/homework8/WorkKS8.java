package homework8;

public class WorkKS8 {
    public static void main(String[] args) {
        System.out.println("This is my HW8");

        Flower rose=new Flower();
        rose.name="Roses";
        rose.color="Green";
        rose.units=22;
        rose.bestgift();

        Flower pinky=new Flower();
        pinky.name="Apple";
        pinky.color="White";
        pinky.units= 10000000;
        pinky.spring();



        Jeans myjeans=new Jeans();
        myjeans.brand="Montana";
        myjeans.color="Deep Blue";
        myjeans.size=33;
        myjeans.model="Grand";
        myjeans.getjeans();

         Jeans oldjeans=new Jeans();
         oldjeans.brand="diesel";
         oldjeans.model="888";
         oldjeans.size=33;
         oldjeans.color="black";
         oldjeans.oldjeans();

        Tables tablenew=new Tables();
        tablenew.color="white";
        tablenew.size=25.3 ;
        tablenew.using="For Computer";
        tablenew.warranty=5;
        System.out.println(tablenew.warranty);

        Tables pctable=new Tables();
        pctable.color="white";
        pctable.size=150;
        pctable.using="office";
        pctable.newtableforme();

    }
}
