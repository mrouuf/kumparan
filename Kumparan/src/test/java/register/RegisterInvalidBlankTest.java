package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterInvalidBlankTest {

    private WebDriver driver;
    private By inputEmail = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div/div/div/input");
    private By buttonRegister = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div[3]/button");
    private By buttonTidak = By.id("onesignal-slidedown-cancel-button");

    @BeforeClass
    public void setUp() {
        //you need to change the path for the chromedriver.exe
        System.setProperty("webdriver.chrome.driver","C:\\Users\\syiha\\IdeaProjects\\Kumparan\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://kumparan.com/register");
        driver.manage().window().maximize();
    }

    @Test
    public void alert_clickToDismiss(){
        driver.findElement(buttonTidak).click();
    }

    @Test (dependsOnMethods = "alert_clickToDismiss")
    public void registerInvalidBlank() {
        driver.findElement(inputEmail).sendKeys("");
        driver.findElement(buttonRegister).click();
    }
}
