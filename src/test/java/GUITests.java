import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GUITests {

    @Test
    public void openGooglePageTest() throws InterruptedException {
        DriverManagerType driverManagerType = DriverManagerType.CHROME;
        WebDriverManager.getInstance(driverManagerType).setup();
        //Thread.sleep(3000);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/"); // transfer according to the URL
        driver.findElement(By.name("q")).sendKeys("TeachMeSkills" + Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href='https://teachmeskills.by/']")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }
}
