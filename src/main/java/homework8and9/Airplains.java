package homework8and9;

public class Airplains {
    public String make;
    public String model;
    public int range;
    public int speed;

    public void printFligtRange(){
        System.out.println("Our new plane "+make+" "+model+" can make "+range+" at fuul capasity");
    }
    public void printFlightSpeed() {
        System.out.println("Our fastest plane is " +make+ " " + model + " with a top speed of " + speed + " mph");
    }
}
