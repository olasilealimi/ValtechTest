import org.testng.annotations.Test;

public class TestRunner extends BrowserClass {

    @Test
    public void ValtechTestClass(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.glowStick();

        AboutSubMenuPage aboutSubMenu = new AboutSubMenuPage(driver);
        aboutSubMenu.aboutclk();

        ServicesSubPage servicesSubMenu = new ServicesSubPage(driver);
        servicesSubMenu.services();



    }

}
