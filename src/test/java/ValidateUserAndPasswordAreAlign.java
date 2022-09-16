import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserAndPasswordAreAlign {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.flipkart.com/");

            driver.manage().window().maximize();

            WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));

            int username_x = username.getLocation().getX();
            int username_width = username.getSize().getWidth();
            int username_height = username.getSize().getHeight();

            WebElement pwTB = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));

            int password_x = pwTB.getLocation().getX();
            int password_width = pwTB.getSize().getWidth();
            int password_height = pwTB.getSize().getHeight();

            if (username_x == password_x && username_width==password_width && username_height==password_height) {
                System.out.println("Username and password text box are aligned");
            } else {
                System.out.println("Username and password text box are NOT aligned");
            }
            driver.close();
        }
    }
