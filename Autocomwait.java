import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Autocomwait {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement autocompleteResult = driver.findElement(By.className("dismissButton"));
        
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        autocompleteResult.click();

        Thread.sleep(3000);
        driver.quit();
    }
}