import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTooltip {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://tooltips.org/login/");
//find the Keep me Logged in Checkbox
            WebElement Checkbox = driver.findElement(By.id("rememberme"));
//get the tooltip text using getAttribute() method and store in a variable
            String tooltipText = Checkbox.getAttribute("title");
            System.out.println(tooltipText);
            driver.close();
        }
}
