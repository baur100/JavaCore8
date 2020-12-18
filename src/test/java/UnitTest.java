import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.CalculateTicket;

public class UnitTest {
    @Test
    public void ifInfant_returnsZero(){
        CalculateTicket calculateTicket=new CalculateTicket(1000);
        double result = calculateTicket.getPrice(1);
        Assert.assertEquals(result,0.0);
    }
    @Test
    public void ifChild_resultIsHalfPrice(){
        CalculateTicket calculateTicket=new CalculateTicket(1000);
        double result=calculateTicket.getPrice(5);
        Assert.assertEquals(result,500.0);
    }
    @Test
    public void ifAdult_resultIsFullPrice(){
        CalculateTicket calculateTicket=new CalculateTicket(1000);
        double result=calculateTicket.getPrice(25);
        Assert.assertEquals(result,1000.0);
    }
    @Test
    public void ifSenior_resultIs80percent() {
        CalculateTicket calculateTicket = new CalculateTicket(1000);
        double result = calculateTicket.getPrice(75);
        Assert.assertEquals(result, 800.0);
    }
}
