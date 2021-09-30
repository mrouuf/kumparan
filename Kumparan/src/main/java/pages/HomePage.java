package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private By buttonMasuk = By.xpath("/html/body/div[3]/div/div/div[1]/div/div/nav/div/div/div[3]/button/div/div/span");
    private By buttonTidak = By.id("onesignal-slidedown-cancel-button");
    private By inputSearchField = By.id("track_search_keyword");
    private By resultAutotext = By.xpath("/html/body/div[3]/div/div/div[1]/div/div/nav/div/div/div[2]/div/div[2]/div/div/div[1]");
    private By Trending = By.xpath("/html/body/div[3]/div/div/div[1]/div/div/div/div/div[2]/div[1]/a[1]/div/span");
    private By berita1 = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div/nav/div[2]/div/div[1]/div/div[1]/div/div/div[1]/a/span");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void alert_clickToDismiss(){
        driver.findElement(buttonTidak).click();
    }

    public LoginPage clickLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(buttonMasuk));
        driver.findElement(buttonMasuk).click();
        return new LoginPage(driver);
    }

    public TrendingPage clickTrending(){
        driver.findElement(Trending).click();
        return new TrendingPage(driver);
    }

}
