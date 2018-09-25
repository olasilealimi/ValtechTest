import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AboutSubMenuPage {

    WebDriver driver;
    public AboutSubMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(how=How.XPATH, using="//*[@id='navigationMenuWrapper']/div/ul/li[1]/a/span") public WebElement about;


    public void aboutclk(){

        about.click();


    }

}
