package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test with the name "+iTestResult.getName()+" started ZZZZZZZZZZZZ");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test: "+iTestResult.getName()+" finished in: "+(iTestResult.getEndMillis()-iTestResult.getStartMillis()));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Failed ************ "+iTestResult.getName() + " "+ iTestResult.getEndMillis());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
