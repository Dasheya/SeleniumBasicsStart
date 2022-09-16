import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationUsingUniqueElement {
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.flipkart.com/");
            driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9970533443");
            driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Dthorat");
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
            Thread.sleep(3000);
            WebElement name = driver.findElement(By.xpath("//div[@class='exehdJ']"));
            if (name.isDisplayed()) {
                System.out.println("Home page is displayed");
            } else{
                System.out.println("Home page is NOT displayed");
            }
            driver.close();
        }
    }
