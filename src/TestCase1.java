import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

public class TestCase1 {

    public static void main(String[] args) {

        WebDriver driver  = Driver.getDriver();

        driver.get("https://automationexercise.com/");
        System.out.println(driver.findElement(By.cssSelector("#header>div>div>div>div.col-sm-4>div>a>img")).isDisplayed());

        driver.quit();

    }

}
