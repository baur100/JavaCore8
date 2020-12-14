import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.CalculateTicket;

public class UnitTest {
    @Test
    public void ifInfant_returnsZero(){
        //Arrange
        CalculateTicket calculateTicket=new CalculateTicket(1000);
        //Act
        double result = calculateTicket.getPrice(1);
        //Assert
        Assert.assertEquals(result,0.0);
        //Assert упал--> Assert.assertEquals(0,result);or(result,100.0); acctual and expected are not match
    }
    @Test
    public void ifChild_resultIsHalfPrice(){
        //Arrange
        CalculateTicket calculateTicket=new CalculateTicket(1000);
        //Act
        double result=calculateTicket.getPrice(5);
        //Assert
        Assert.assertEquals(result,500.0);
    }
    @Test
    public void ifAdult_resultIsFullPrice(){
        //Arrange
        CalculateTicket calculateTicket=new CalculateTicket(1000);
        //Act
        double result=calculateTicket.getPrice(25);
        //Assert
        Assert.assertEquals(result,1000.0);
    }
    @Test
    public void ifSenior_resultIs80percent() {
        //Arrange
        CalculateTicket calculateTicket = new CalculateTicket(1000);
        //Act
        double result = calculateTicket.getPrice(75);
        //Assert
        Assert.assertEquals(result, 800.0);
    }
}
