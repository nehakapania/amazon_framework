package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DriverHelper {
    // Intialized web driver
    public static WebDriver driver;

    //initialised page factory by making constructor
    public DriverHelper() {
        PageFactory.initElements(driver, this);
    }

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void url(String Url) {
        driver.get(Url);
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }


    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }

    /* creating a method with actionclass to click on the products which are available at the end of page
    after scrolling a page*/
    public WebElement clickOnHiddenProduct(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        return element;
    }

    //random number generator method to select any webelement
    public int randomNumberGenerator(int size) {
        Random random = new Random();
        return random.nextInt(size - 1);
    }
}
