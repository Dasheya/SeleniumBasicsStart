import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printversion {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://tooltips.org/login/");
            String xpathforVersion = "//nobr[contains(text(),'tooltips')]";
            String version = driver.findElement(By.xpath(xpathforVersion)).getText();
            System.out.println("Version of tooltips on login page is : " + version);
        }
}
