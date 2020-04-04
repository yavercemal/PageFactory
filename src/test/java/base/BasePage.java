package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {

    public String baseUrl = "https://www.google.com/";
    public WebDriver driver;

    @BeforeTest
    public  void setBaseUrl() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }
}
