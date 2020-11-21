package tickets_1;

public class CalculateTicket_1 {
    private int baseFare;

    public CalculateTicket_1(int baseFare) {
        this.baseFare = baseFare;
    }

    public double getPrice(int age) {
        if (age <= 2) {
            return 0;
        }
        if (age <= 12) {
            return this.baseFare * 0.5;
        }
        if (age <= 66) {
            return this.baseFare;
        }
        return this.baseFare * 0.8;
//        if(age>12 && age <=66){
//            return this.baseFare;
//        }
    }
}
