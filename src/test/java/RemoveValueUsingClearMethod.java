import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveValueUsingClearMethod {
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.flipkart.com/");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9970533443");
            Thread.sleep(2000);

            //String value = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).getAttribute("value");
            //System.out.println("Value present inside the text box is : "+value);

            driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).clear();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9152105010");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE); //
           // this line will actually delete the value if there is no space in the text entered
// if there is a space between two words in the username field, we have to use the below lines ofcode
            //driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(Keys.CONTROL+"a") ;
            //driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(Keys.DELETE);
            Thread.sleep(2000);
        }
}
