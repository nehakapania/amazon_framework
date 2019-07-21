import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverHelper;

public class Hooks
{
    DriverHelper driverHelper=new DriverHelper();

    @Before
    public void setUp()
    {
        driverHelper.openBrowser();
        driverHelper.url("https://www.amazon.co.uk/");
        driverHelper.maximizeBrowser();
        driverHelper.implicitWait();
    }
//    @After
//    public void quitBrowser()
//    {
//        driverHelper.closeBrowser();
//    }
}
