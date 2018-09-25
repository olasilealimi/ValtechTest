import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(how=How.XPATH, using="//*[@id='CybotCookiebotDialogBodyButtonAccept']") public WebElement cookies;
    @FindBy(how=How.XPATH, using="//span[@id='menu-toggle-button']//span[@class='hamburger__front']/i") public WebElement glowbtn;



    public void glowStick(){
        //driver.switchTo().alert().accept();
        cookies.click();
        glowbtn.click();

    }

}
