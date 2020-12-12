import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tickets.CalculateTicket;

public class UnitTestWithDataProvider {
    @DataProvider(name = "Ages")
    public Object[][] getData(){
        return new Object[][]{
                {1,0.0},
                {6,500.0},
                {25,1000},
                {69,800.0}
        };
    }


    @Test(dataProvider = "Ages")
    public void testTicket(int age, double expectedPrice){

        CalculateTicket calculator = new CalculateTicket(1000);

        double ticketPrice = calculator.getPrice(age);

        Assert.assertEquals(ticketPrice,expectedPrice);
    }
}
