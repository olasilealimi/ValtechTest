import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BrowserClass {

    static WebDriver driver;

    @BeforeClass

    public void browserClass(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Softwares\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.valtech.co.uk/");

    }
    //@AfterClass
    public void tearDown(){

        driver.quit();

    }
}
