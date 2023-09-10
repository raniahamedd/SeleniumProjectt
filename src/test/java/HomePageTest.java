import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
    WebDriver driver;
    WebElement contactButton;
    WebElement contactText;
    @BeforeClass
    public void setup(){
        //initilize diver
        driver =   WebDriverManager.chromedriver().create();
        driver.get("https://wewill.tech");
    }
    @Test
    public void test1(){
        System.out.println("kjhjkh");
    }
}
