import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ServicesSubPage {

    WebDriver driver;

    public ServicesSubPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(how=How.XPATH, using="//span[@id='menu-toggle-button']//span[@class='hamburger__front']/i")
    public WebElement glowstickbtn;
    @FindBy(how=How.XPATH, using="//*[@id='navigationMenuWrapper']/div/ul/li[3]/a/span")
    public WebElement services;


    public void services(){
        glowstickbtn.click();
        services.click();

    }
}
