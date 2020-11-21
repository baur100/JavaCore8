import org.testng.Assert;
import org.testng.annotations.Test;
import tickets_1.CalculateTicket_1;

public class UnitTest_1 {
    @Test
    public void ifInfant_returnsZero(){
        //Arrange
        CalculateTicket_1 calculateTicket = new CalculateTicket_1(1000);

        //Act
        double result = calculateTicket.getPrice(1);

        //Assert
        Assert.assertEquals(result,0.0);
    }
    @Test
    public void ifChild_resultIsHalfPrice(){
        //Arrange
        CalculateTicket_1 calculateTicket = new CalculateTicket_1(1000);

        //Act
        double result = calculateTicket.getPrice(5);

        //Assert
        Assert.assertEquals(result,500.0);
    }
    @Test
    public void ifAdult_resultIsFullPrice(){
        //Arrange
        CalculateTicket_1 calculateTicket = new CalculateTicket_1(1000);

        //Act
        double result = calculateTicket.getPrice(25);

        //Assert
        Assert.assertEquals(result,1000.0);
    }
    @Test
    public void ifSenior_resultIs80percent(){
        //Arrange
        CalculateTicket_1 calculateTicket = new CalculateTicket_1(1000);

        //Act
        double result = calculateTicket.getPrice(75);

        //Assert
        Assert.assertEquals(result,800.0);
    }
}
