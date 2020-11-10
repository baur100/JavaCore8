package homework8and9;

public class App1 {
    public static void main(String[] args) {
        Cars vw = new Cars();
        vw.engine = 2.2;
        vw.make = "Volkswagen";
        vw.model = "Jetta";
        vw.year = 2013;

        vw.printCarInfo();
        vw.beep();

        Cars jeep = new Cars();
        jeep.engine = 5.4;
        jeep.make = "Jeep";
        jeep.model = "Wrangler";
        jeep.year = 2020;

        jeep.printCarInfo();
        jeep.beep();

        Presidents trump = new Presidents();
        trump.name = "Donald";
        trump.lastName = "Trump";
        trump.age = 74;

        trump.Hello();

        Presidents biden = new Presidents();
        biden.name = "Joe";
        biden.lastName = "Biden";
        biden.age = 78;

        biden.HelloNext();

        Airplains boing = new Airplains();
        boing.make = "Boing";
        boing.model = "737-MAX";
        boing.range = 5200;
        boing.speed = 600;

        boing.printFlightSpeed();
        boing.printFligtRange();

    }
}
