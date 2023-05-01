import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class checkboxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement chkBox1 = driver.findElement(By.id("checkbox-1"));
        WebElement chkBox2 = driver.findElement(By.id("checkbox-2"));
        WebElement chkBox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));


        for(int i=0; i<9;i++){
            chkBox1.click();
            Thread.sleep(1000);
            chkBox1.click();
            chkBox2.click();
            Thread.sleep(1000);
            chkBox2.click();
            chkBox3.click();
            Thread.sleep(1000);
            chkBox3.click();
        }
        Thread.sleep(2000);
        driver.quit();
    }
}