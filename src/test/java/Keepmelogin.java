import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keepmelogin {

        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://tooltips.org/login/");
            WebElement KeepMeLogIN_Checkbox = driver.findElement(By.id("rememberme"));
//select the checkbox
            KeepMeLogIN_Checkbox.click();

            if (KeepMeLogIN_Checkbox.isSelected()) {
                System.out.println("Checkbox is selected");
            }else{
                System.out.println("Checkbox is NOT selected");
            }
        }
    }
