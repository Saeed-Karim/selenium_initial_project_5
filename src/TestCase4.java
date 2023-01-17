import utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        System.out.println(driver.findElement(By.cssSelector("#footer>div.footer-bottom>div>div>p")).isDisplayed());

        driver.quit();
    }
}