import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioBtn1 = driver.findElement(By.id("radio-button-1"));
        radioBtn1.click();
        Thread.sleep(2000);
        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioBtn2.click();
        Thread.sleep(2000);
        WebElement radioBtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioBtn3.click();
        Thread.sleep(2000);


        driver.quit();
    }
}
