package tests;

import base.BasePage;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BasePage {

    @Test
    public void searchGoogle() {
        HomePage homePage = new HomePage(driver);
        homePage.setGoogleTextbox("Test Automation");
        homePage.searchClick();
    }
}
