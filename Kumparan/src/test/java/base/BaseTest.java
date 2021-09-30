package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected RegisterPage registerPage;
    protected TrendingPage trendingPage;
    protected DetailPage detailPage;


    @BeforeClass
    public void setUp() {
        //you need to change the path for the chromedriver.exe
        System.setProperty("webdriver.chrome.driver","C:\\Users\\syiha\\IdeaProjects\\Kumparan\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://kumparan.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        trendingPage = new TrendingPage(driver);
        detailPage = new DetailPage(driver);


    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
    }
}
