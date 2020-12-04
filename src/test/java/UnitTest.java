import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.CalculateTicket;

import java.util.concurrent.Callable;

public class UnitTest {
    @Test
    public void ifInfant_returnZero() {
        //Arrange
        CalculateTicket calculateTicket = new CalculateTicket(1000);
        //Actual result
        double result = calculateTicket.getPrice(1);
        //Assert
        Assert.assertEquals(result, 0.0);
    }

    @Test
    public void ifChild_resultIsHalfPrice() {
        //Arrange
        CalculateTicket calculateTicket = new CalculateTicket(1000);
        //Actual result
        double result = calculateTicket.getPrice(5);
        //Assert
        Assert.assertEquals(result, 500.0);
    }

    @Test
    public void ifAdult_resultIsFullPrice() {
        //Arrange
        CalculateTicket calculateTicket = new CalculateTicket(1000);
        //Actual result
        double result = calculateTicket.getPrice(30);
        //Assert
        Assert.assertEquals(result, 1000.0);
    }
    @Test
    public void ifSenior_resultIsEightyPercent(){
        //Arrange
        CalculateTicket calculateTicket = new CalculateTicket(1000);
        //Actual
        double result = calculateTicket.getPrice(80);
        //Assert
        Assert.assertEquals(result,800.0);
        }
    }

